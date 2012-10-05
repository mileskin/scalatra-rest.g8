package spike.scalatra

import org.scalatra.test.scalatest.ScalatraSuite
import org.scalatest.WordSpec

class DummySpec extends ScalatraSuite with WordSpec {
  "any" should {
    "do something" in {
      1 should equal (1)
    }
  }
}
