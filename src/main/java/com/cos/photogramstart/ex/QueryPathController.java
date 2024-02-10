package com.cos.photogramstart.ex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryPathController {

    @GetMapping("/chicken")
    public String chickenQuery(String type){
        return type+ " 치킨 배달 대기중. (queryString)";
    }

    @GetMapping("/chicken/{type}")
    public String chickenPath(@PathVariable String type){
        return type+ " 치킨 배달 대기중. (adressVarMapping)";
    }


}
