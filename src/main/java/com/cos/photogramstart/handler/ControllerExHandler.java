package com.cos.photogramstart.handler;


import com.cos.photogramstart.handler.ex.CustomValidationEx;
import com.cos.photogramstart.utills.Script;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice // 컨트롤러 익셉션 받는 용도
@RestController
public class ControllerExHandler {


    @ExceptionHandler(CustomValidationEx.class)
    public String validationEx(CustomValidationEx e){

        System.out.println("e = " + e);
        System.out.println("getErrorMap = " + e.getErrorMap().toString());

        return Script.back(e.getErrorMap().toString());

        //CMResDto.Script 비교
        //클라에 응답 -> Script 좋다
        //Ajax 통신 -> CMResDto가 좋다
        //Android 통신 -> CMresDto가 좋다
//        System.out.println("에러맵 메세지" + e.getErrorMap());
//        return new CMResDto(-1,e.getMessage(), e.getErrorMap());
//                return new CMResDto(-1,e.getMessage(), "회원가입에 실패했습니다.");
    }


}
