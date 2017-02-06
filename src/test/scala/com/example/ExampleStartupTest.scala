package com.example

import com.google.inject.Stage
import com.twitter.finatra.http.EmbeddedHttpServer
import com.twitter.inject.Test

class ExampleStartupTest extends Test {

  val server = new EmbeddedHttpServer(
    stage = Stage.PRODUCTION,
    twitterServer = new ExampleServer)

  test("server#startup") {
    server.assertHealthy()
  }
}
