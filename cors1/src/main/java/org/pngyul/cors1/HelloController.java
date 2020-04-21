package org.pngyul.cors1;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * 尽管@CrossOrigin可以在类上面配置跨域，但是其作用范围还是某一个Controller
 * 并不是全局，如果全局配置
 * 可以java配置
 *
 * 另外，如果你允许的跨域请求的资源api不多
 * 直接就@CrossOrigin完事了
 */

@RestController
//@CrossOrigin(value = "http://localhost:8080")
public class HelloController {



    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    //可以和类上的@CrossOrigin组合
    //@CrossOrigin(allowedHeaders = {"token","content-type"},maxAge = 5,allowCredentials = "true")
    @PostMapping("/dopost")
    public String hello2(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if(cookies!=null){
            for(Cookie cookie : cookies){
                String name = cookie.getName();
                String value = cookie.getValue();
                System.out.println(name+":"+value);
            }
        }else{
            System.out.println("cookie为空");
        }

        return "dopost";
    }

    @PutMapping("/doput")
    public String hello1(){
        return "doput";
    }
}
