# Finatra Typesafe [Activator](https://www.typesafe.com/get-started) Seed Template

[![Build Status](https://secure.travis-ci.org/twitter/finatra-activator-seed.png?branch=master)](http://travis-ci.org/twitter/finatra-activator-seed?branch=master)

A minimal [activator](https://www.typesafe.com/get-started) seed template for creating a Finatra application.

#### Note:
By default Finatra will run your external service on port `:8888` -- this also happens to be the same port the Activator UI uses. Therefore, in order to be able to correctly run your project inside the Activator UI start the Activator on a different port. E.g.,

```
activator -Dhttp.port=9090 ui
```
