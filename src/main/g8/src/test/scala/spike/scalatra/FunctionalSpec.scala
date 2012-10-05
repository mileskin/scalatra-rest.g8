package spike.scalatra

import org.scalatra.test.scalatest._
import org.scalatest.WordSpec

class FunctionalSpec extends ScalatraSuite with WordSpec {
  addServlet(new RestServlet, "/*")

  "get user" should {
    "return user info" in {
      get("/users/1") {
        body should equal ("""{"user":{"name":"John","age":30}}""")
      }
    }
  }

  "post user" should {
    "return user id" in {
      post("/users", """{"name":"john","age":30}""") {
        body should equal ("1")
      }
    }
  }
}
