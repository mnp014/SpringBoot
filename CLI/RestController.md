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
