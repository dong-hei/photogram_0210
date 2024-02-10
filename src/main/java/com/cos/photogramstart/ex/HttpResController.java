package com.cos.photogramstart.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 파일 리턴
public class HttpResController {

    @GetMapping("/txt")
    public String txt(){
        return "a.txt"; //일반 정적 파일은 res/static 폴더 내부가 디폴트 경로
    }

    @GetMapping("/mus")
    public String mus(){
        return "b"; //templates 폴더 안에 .mustache를 두면 확장자 없이 파일명만 적으면 찾아간다.
    }

    @GetMapping("/main")
    public String main(){
        return "Empty"; // jsp 엔진 : src/main/webapp 폴더가 디폴트 경로

    }
}
