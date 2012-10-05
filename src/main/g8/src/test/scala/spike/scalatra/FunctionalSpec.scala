package spike.scalatra

import org.scalatra.test.scalatest._
import org.scalatest.WordSpec
import net.liftweb.json

class FunctionalSpec extends ScalatraSuite with WordSpec with JsonHelpers {
  addServlet(new RestServlet, "/*")

  "get user" should {
    "return user info" in {
      get("/users/1") {
        jsonResponse.extract[User].name should equal ("John")
      }
    }
  }

  "post user" should {
    "return user id" in {
      post("/user", """{"name":"john","age":30}""") {
        body should equal ("1")
      }
    }
  }

  def jsonResponse = json.parse(response.getContent)
}
