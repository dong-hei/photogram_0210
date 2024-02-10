package com.cos.photogramstart.ex;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@Slf4j
public class HttpBodyController {

    @PostMapping("/body1")
    public String xwwwform(String name){
        log.info(name);
        return "key = val 전송";
    }

    @PostMapping("/body2")
    public String plaintext(@RequestBody String data){
        log.info(data);
        return "key = txt 전송";

    }

    @PostMapping("/body3")
    public String applicationjson(@RequestBody String data){
        log.info(data);
        return "json 전송";

    }

    @PostMapping("/body4")
    public String applicationjsonToObj(@RequestBody User user){
//        log.info(user.getUsername());
        return "json 전송";

    }
}
