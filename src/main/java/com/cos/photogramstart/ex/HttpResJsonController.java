package com.cos.photogramstart.ex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpResJsonController {

    @GetMapping("/res/json")
    public String resJson(){
        return "{\"username\":\"kim\"}";
    }

    @GetMapping("/res/json/obj")
    public User resJsonObj(){
        User user = new User();
        //        String data = "{\"username\":\"+user.getUsername()+\"}";  이걸 자동으로 스프링 MessageConverter가 해준다
        // 1. JavaObj -> Json(과거는 xml) 으로 변경해 통신을 통해 응답
        // 2. @RestController 일때만 MessageConverter가 작동한다.
//        user.setUsername("Kim Dong-hei");
        return user;
    }
}
