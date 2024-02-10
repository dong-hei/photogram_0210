package com.cos.photogramstart.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JavaToJspController {

    @GetMapping("/jsp/java")
    public String jspToJava(){
        return "Empty";
    }

    @GetMapping("/jsp/java/model")
    public String jspToJavaToModel(Model model){ //함수의 파람에 Model을 선언

//        User user = new User();
//        user.setUsername("Lingard");
//        model.addAttribute("username", user.getUsername()); //addAttribute 함수로 전달만 하면 된다.
//        //key, val

        return "Model";
    }
}
