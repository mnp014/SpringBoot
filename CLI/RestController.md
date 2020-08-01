#### Controller:
  `@RestController` annotaion is used to map requests to the required HTTP method using URI path specified using request mapping.  

#### Request Mapping
The request mapping can any of the following type:  
 - `@RequestMapping("/")`              A generic way of mapping to HTTP methods, This can be use to map GET, POST, PUT, DELETE, PATCH.   
 The following can be used incase you don't want to use generic type of mappinng.  
 - `@GetMapping("/{id}")`              For get request    
 - `@PostMapping`                      For post request   
 - `@PutMapping`                       For put request   
 - `@DeleteMapping`                    For delete request   
 - `@PatchMapping`                     For patch request   
 **NOTE** - @GetMapping  == @RequestMapping(method=HttpMethod.GET)  
____
#### Sample file
```
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

}
``` 
____
#### URI patterns:
```
?             | Matches one character                                            | "/pages/t?st.html"                    | "/pages/t <E> st.html"
*             | Matches zero or more characters within a path segment            | "/projects/*/versions"                | "/projects/ <spring> /versions"
**            | Matches zero or more path segments until the end of the path     | "/resources/**"                       | "/resources/ <images/file.png">
{name}        | Matches a path segment and captures it as a variable named "name"| "/projects/{project}/versions"        | "/projects/ <spring> /versions"
{name:[a-z]+} | Matches the regexp "[a-z]+" as a path variable named "name"      | "/projects/{project:[a-z]+}/versions" | "/projects/spring/versions"
```  
____
#### Consumable Media Types
 - Narrow the request mapping based on the Content-Type of the request.
 ```
 @PostMapping(path = "/pets", consumes = "application/json") 
 public void addPet(@RequestBody Pet pet) {
     // ...
 }
 ```
#### Producible Media Types
 - Narrow the request mapping based on the Producible Media Types
 ```
 @GetMapping(path = "/pets/{petId}", produces = "application/json") 
 @ResponseBody
 public Pet getPet(@PathVariable String petId) {
     // ...
 }
 ```
 #### Parameters, headers
 - Narrow the request mapping based on the Parameters, headers Types
 ```
 @GetMapping(path = "/pets/{petId}", params = "myParam=myValue") 
 public void findPet(@PathVariable String petId) {
     // ...
 }
 ```
____ 
 #### Explicit Registrations
  ```
  @Configuration
public class MyConfig {

    @Autowired
    public void setHandlerMapping(RequestMappingHandlerMapping mapping, UserHandler handler)  [1]
            throws NoSuchMethodException {

        RequestMappingInfo info = RequestMappingInfo
                .paths("/user/{id}").methods(RequestMethod.GET).build(); [2] 

        Method method = UserHandler.class.getMethod("getUser", Long.class);  [3]

        mapping.registerMapping(info, handler, method); [4]
    }
}
```
[1] Inject the target handler and the handler mapping for controllers.  
[2] Prepare the request mapping meta data.  
[3] Get the handler method.  
[4] Add the registration.  


____

***Also refer:***
@RequestParam
@RequestHeader
@CookieValue
@ModelAttribute
@SessionAttributes
@SessionAttribute
@RequestAttribute
**Redirect Attributes**
Flash Attributes
**Multipart**
@RequestBody
HttpEntity
@ResponseBody
ResponseEntity
Jackson JSON

