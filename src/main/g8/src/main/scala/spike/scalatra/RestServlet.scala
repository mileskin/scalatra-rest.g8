package spike.scalatra

import org.scalatra._
import scalate.ScalateSupport
import net.liftweb.json._
import net.liftweb.json.JsonDSL._
import net.liftweb.json.Serialization.{read, write}

class RestServlet extends ScalatraServlet with ScalateSupport {
  get("/users/:id") {
    params("id") match {
      case "1" => compact(render(("user" -> ("name" -> "John") ~ ("age" -> 30))))
    }
  }

  post("/users") {
    implicit val formats = DefaultFormats
    case class User(name : String, age : Integer)
    val user = parse(request.body).extract[User]
    write(new Integer(1))
  }

  notFound {
    findTemplate(requestPath) map { path =>
      contentType = "text/html"
      layoutTemplate(path)
    } orElse serveStaticResource() getOrElse resourceNotFound()
  }
}
