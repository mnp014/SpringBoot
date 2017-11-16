package xyz.prazy.springbootStarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                       // used to make the Controller-class as Rest-Controller
// Rest-Controller can have methods which are mapped to a particular URL
public class HelloController {
	@RequestMapping("/hello")                  //this annotation tells which URL is mapped to this method by taking URL as an parameter
	//NOTE: By default @RequestMapping maps to all HTTP methods
	public String Sayhi() {
		return "Hi<br><br>hello";
	}

}
