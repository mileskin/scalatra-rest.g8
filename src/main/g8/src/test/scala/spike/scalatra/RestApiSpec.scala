package spike.scalatra

import org.scalatra.test.scalatest._
import org.scalatest.WordSpec
import net.liftweb.json

class RestApiSpec extends ScalatraSuite with WordSpec with JsonHelpers {
  addServlet(new RestApiServlet, "/*")

  "get user" should {
    "return user info" in {
      get("/api/json/users/1") {
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

  "on unexpected error" should {
    "return general message with appropriate status code" in {
      get("/error") {
        status should equal (500)
        body should equal ("""{"message":"Internal error."}""")
      }
    }
  }

  def jsonResponse = json.parse(response.getContent)
}
