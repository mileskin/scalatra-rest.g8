package spike.scalatra

import org.specs2.mutable._
import org.scalatra.test.specs2.MutableScalatraSpec
import javax.servlet.http.{HttpServlet, HttpServletRequest, HttpServletResponse}

class FunctionalSpec extends MutableScalatraSpec {
  // sequential is required if your service is stateful
  args(sequential=true)
  addServlet(new RestServlet, "/*")

  "get user" should {
    "return user info" in {
      get("/users/1") {
        body must_== """{"user":{"name":"John","age":30}}"""
      }
    }
  }

  "post user" should {
    "return user id" in {
      post("/users", """{"name":"john","age":30}""") {
        body must_== "1"
      }
    }
  }
}
