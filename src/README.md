## Cross-Parameter Validation

This example application demonstrates cross-parameter validation using a custom Validator.  

### Getting Started

After cloning the repository, the application can be launched with Gradle:

```
./gradlew bootRun
```

### Testing Validation Logic
This simple application creates an `/order` endpoint that accepts a `FlowerDeliveryOrder` and returns a copy if all
validation checks pass successfully. Otherwise, a 400 error will be returned. There is an /example endpoint available to return a JSON-encoded sample `FlowerDeliveryOrder` to demonstrate the correct 
format. 

[Postman](https://www.postman.com/) is a very useful tool for API testing. The `Postman/` folder contains a collection 
of requests that can be imported into Postman, including examples of both valid and invalid requests to the 
`/order` endpoint. 