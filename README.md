Spring Cloud Config Demo
========================

This simple demonstration of spring-cloud-config includes a *config server*, *config repo*, and an *config client application*

NOTE: The config repo is https://github.com/dturanski/config-repo . To modify properties clone this repo and edit the config-server [application.yml](./config-server/src/main/resources/application.yml)


* Start config-server
* Start my-service
* Navigate to <http://localhost:8080>

### Change property values to single application (config-bus not required)

*  `curl -X POST http://localhost:8080/env -d info.foo=zoob -d info.bar=bobo`
*  If [MyController](./my-service/src/main/java/com/example/MyController.java) has @RefreshScope, `curl -X POST http://localhost:8080/refresh` is required to update the `value` field.
* `curl -X POST http://localhost:8080/env/reset` to restore original values. (NOTE: Another POST to /refresh is required to restore the @RefreshScope beans)

### Changing logging levels at run time
* `curl -X POST http://localhost:8080/env -d logging.level.com.example=DEBUG`


### Change property values to all config clients via config-bus

NOTE: To demonstrate spring-cloud-bus, start a local Rabbit MQ sever.

* Update values in config repo and `curl -X POST http://localhost:8888/bus/refresh
* `curl -X POST http://localhost:8888/bus/env -d logging.level.com.example=DEBUG`



