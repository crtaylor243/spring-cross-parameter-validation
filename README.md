## Cross-Parameter Validation

This is a simple application to demonstrate cross-parameter validation as described in [this article](https://dev.to/focusedlabs/cross-parameter-validation-with-spring-3955)

### Getting Started

```
git clone git@github.com:crtaylor243/spring-cross-parameter-validation.git
cd spring-cross-parameter-validation
./gradlew bootRun
```

### Testing Validation Logic
This simple application creates an `/order` endpoint that accepts a `FlowerDeliveryOrder` and returns a copy if all
validation checks pass successfully. Invalid requests return an appropriate HTTP status code. There is an /example endpoint available to return a JSON-encoded sample `FlowerDeliveryOrder` to demonstrate the correct format. 

[Postman](https://www.postman.com/) is a very useful tool for API testing. The `Postman/` folder contains a collection 
of requests that can be imported into Postman, including examples of both valid and invalid requests to the 
`/order` endpoint. 
