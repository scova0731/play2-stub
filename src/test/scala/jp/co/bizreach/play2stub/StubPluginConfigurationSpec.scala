package jp.co.bizreach.play2stub


import org.scalatest.{FunSpec, Matchers}


class StubPluginConfigurationSpec extends FunSpec with Matchers with FakePlayHelper {

  describe("route file parser") {


    it("should not have the plugin") {
      runApp(PlayApp()) { app =>
        assert(app.plugin[StubPlugin] !== None)
      }
    }
  }

}