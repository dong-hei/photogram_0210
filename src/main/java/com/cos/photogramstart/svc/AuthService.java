package com.cos.photogramstart.svc;

import com.cos.photogramstart.domain.user.User;
import com.cos.photogramstart.domain.user.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AuthService {

    @Autowired
    private final UserRepo userRepo;

    @Autowired
    private final PasswordEncoder bCryptPasswordEncoder;

    @Transactional
    public User signin(User user) {
        //회원 가입 진행
        String rawPassword = user.getPassword();
        String encPassword = bCryptPasswordEncoder.encode(rawPassword); //암호화된 패스워드
        user.setPassword(encPassword);
        user.setRole("ROLE_USER"); // 관리자 ROLE_ADMIN
        User userEntity = userRepo.save(user);
        return userEntity;

    }
}
