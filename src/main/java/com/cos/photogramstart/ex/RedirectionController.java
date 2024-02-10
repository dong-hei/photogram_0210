package com.cos.photogramstart.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectionController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/away")
    public String away(){
        return "redirect:/home"; //리다이렉션.(@Controller일때만 발동되고 @RestController일때는 발동안된다.)
    }
}
