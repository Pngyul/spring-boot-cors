package org.pngyul.cors;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello2(@CookieValue String  JSESSIONID){
        System.out.println(JSESSIONID);
        return "hello";
    }

}
