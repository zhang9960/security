package com.z.oauth_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhang
 * @version 1.0
 * @date 2021/1/19 11:16
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

//    @GetMapping("/admin/hello")
////    public String admin(){
////        return "admin";
////    }
////
////    @GetMapping("/user/hello")
////    public String user(){
////        return "uesr";
////    }
}
