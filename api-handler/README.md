# Api Handler Service
A service that receives data from an API.

`RestApiService` - this is a wrapper class around WebClient with 
minimal configuration specified using `WebClient.builder().build();`

```java
ApiResponse response = restApiService.fetch("https://test.ru", "/test");
```
The `fetch` method sends a get request to the 
server and returns the `ApiResponse`.

`ApiResponse` has a `toJson()` method that returns a response 
from the server with type `JsonNode`.

```java
public JsonNode toJson();
```