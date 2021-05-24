# api_service

The API is rest end point for the service exposed by the pipeline.

## Infrastructure Setup
- Running Docker compose will bring up postgres, kafka & kafka ui container.
- The postgresql will be initiated with firstpipeline DB and testschema.
- The kafka will have two topics `local.cloudevent.cmd.data.0` & `orders` created.

To set up the infrastructure following commands should be executed.
- ` cd ./infrastructure `
- ` docker-compose up`

## Starting API Service
- To build the application run the command `./gradlew clean build`.
- To start the application run the command `./gradlew bootRun`.

## Accessing the application
The application can be accessed at `localhost:3000`.

## Developers note
Check `KafkaController.java` for the implemented routes.
