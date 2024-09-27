package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringController {
	 @GetMapping("/home")
	    public String home() {
	        return "index.html";
	    }
	    @GetMapping("/signup")
	    public String signup() {
	        return "signup.html";
	    }
	    @GetMapping("/profile")
	    public String polling() {
	        return "profile.html";
	    }
	    @GetMapping("/ads")
	    public String result() {
	        return "ads.html";
	    }	   
}
