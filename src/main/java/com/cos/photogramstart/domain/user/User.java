package com.cos.photogramstart.domain.user;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 번호 증가 전략이 DB를 따라감
    private int id; // 서비스를 직접 운영하는게 아니기때문에 int선언 아이디는 자동증가

    /* 공통기능 (= AOP)
    * username이 중복되면 ConstraintViolationException: could not execute statement ex
    * ㄴ서버가 DB에 전달되기전에 처리해주면 되기때문에 전처리해주면 된다.
    * ㄴ전처리는 validation
    * 
    * length가 길면 SQLGrammarException: could not execute statement ex,
    * ㄴDB에 전달되기전에 처리해주면 되기때문에 후처리해주면 된다.
    * ㄴ후처리는 exceptionHandler
    * */
    @Column(length = 20, unique = true)
    private String username; // 유저

    @Column(nullable = false)
    private String password; // 비번

    @Column(nullable = false)
    private String name; // 이름
    private String website; // 웹사이트
    private String bio; // 자기소개

    @Column(nullable = false)
    private String email; // 이메일
    private String gender; // 성별

    private String profileImgUrl; // 프로필 이미지
    private String role; // 권한
    
    private LocalDateTime createDate; // 생성일

    @PrePersist //DB에 INSERT 되기 직전에 실행
    public void createDate(){
        this.createDate = LocalDateTime.now(); 
    }



}
