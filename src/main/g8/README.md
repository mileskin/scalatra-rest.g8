## Summary

Scala SBT project with Scalatra, lift-json and ScalaTest.

## Setup

Launch [SBT](https://github.com/harrah/xsbt/wiki) (embedded in project):

    ./sbt

(optionally) generate IDEA configuration:

    gen-idea

Start Jetty server so that it boots after each source file change:

    ~;container:start; container:reload /

Open [http://localhost:8660/api/json/users/1](http://localhost:8660/api/json/users/1) or

    curl http://localhost:8660/api/json/users/1

Learn more about [Scalatra](http://www.scalatra.org/stable/book/) and
   [lift-json](https://github.com/lift/lift/tree/master/framework/lift-base/lift-json/)
