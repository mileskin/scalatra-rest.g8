package spike.scalatra

import org.scalatra._
import scalate.ScalateSupport
import net.liftweb.json._
import net.liftweb.json.JsonDSL._

case class User(name: String, age: Int)

class RestServlet extends ScalatraServlet with ScalateSupport with JsonHelpers {
  get("/users/:id") {
    params("id") match {
      case "1" => Json(User("John", 30))
    }
  }

  post("/user") {
    val user = parse(request.body).extract[User]
    1
  }

  notFound {
    contentType = "application/json;charset=UTF-8"
    status(404)
    compact(render(("message" -> "Not found.")))
  }
}
