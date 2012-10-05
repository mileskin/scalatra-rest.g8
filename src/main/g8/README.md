## Summary

Scala SBT project with Scalatra, lift-json and ScalaTest.

## Setup

1. Launch [SBT](https://github.com/harrah/xsbt/wiki):

    sbt

2. (optionally) generate IDEA configuration:

    gen-idea

3. Start Jetty server so that it boots after each source file change:

    ~;container:start; container:reload /

4. Open http://localhost:8660/api/json/users/1 or

    curl http://localhost:8660/api/json/users/1

5. Learn more about [Scalatra](http://www.scalatra.org/stable/book/) and
   [lift-json](https://github.com/lift/lift/tree/master/framework/lift-base/lift-json/)

