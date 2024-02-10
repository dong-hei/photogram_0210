package com.cos.photogramstart.ex;

import org.springframework.web.bind.annotation.*;

//@Controller // File을 응답하는 컨트롤러(클라이언트가 브러우저면 .html)
@RestController // 이 어노테이션을보고 스프링이 컨트롤러로 인식, Data를 응답하는 컨트롤러 (클라이언트가 핸드폰이면 data)
//둘 중에 하나만 써야 하면
public class HttpController {

    //2-9

    //http://localhost:8080/get
    @GetMapping("/get")
    public String get(){
        return "<h4>get req<h4>";
//        return "a.html";
    }

    //http://localhost:8080/post
    @PostMapping("/post")
    public String post(){
        return "post req";

    }

    //http://localhost:8080/put
    @PutMapping("/put")
    public String put(){
        return "put req";

    }

    //http://localhost:8080/delete
    @DeleteMapping("/delete")
    public String delete(){
        return "delete req";
    }
}
