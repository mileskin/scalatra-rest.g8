package spike.scalatra

import org.specs2.mutable._
import org.scalatra.test.specs2.MutableScalatraSpec
import javax.servlet.http.{HttpServlet, HttpServletRequest, HttpServletResponse}

class FunctionalSpec extends MutableScalatraSpec {
  args(sequential=true)
  addServlet(new RestServlet, "/*")

  "get user" should {
    "return user info" in {
      get("/users/1") {
        body must_== """{"name":"john","age":30}"""
      }
    }
  }
}
