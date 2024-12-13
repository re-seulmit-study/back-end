package com.minjyeon.sulmit.controller;

import com.minjyeon.sulmit.dto.SignupRequestDto;
import com.minjyeon.sulmit.dto.UserInfoDto;
import com.minjyeon.sulmit.entity.UserRoleEnum;
import com.minjyeon.sulmit.repository.UserRepository;
import com.minjyeon.sulmit.security.UserDetailsImpl;
import com.minjyeon.sulmit.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserService userService;

    // 인증된 사용자의 정보를 반환합니다.
    @GetMapping("/user-info")
    public ResponseEntity<UserInfoDto> join(@AuthenticationPrincipal UserDetailsImpl userDetails) {
        // UserDetailsImpl에서 사용자 정보 가져오기
        String username = userDetails.getUsername();
        UserRoleEnum role = userDetails.getUser().getRole();
        boolean isAdmin = (role == UserRoleEnum.ADMIN);

        // UserInfoDto 객체 생성
        UserInfoDto userInfoDto = new UserInfoDto(username, isAdmin);

        // ResponseEntity로 반환
        return ResponseEntity.ok(userInfoDto);
    }

    // 로그인 데이터를 받아 인증을 수행합니다.
    @PostMapping("/register")
    public ResponseEntity<?> signup(@Valid @RequestBody SignupRequestDto requestDto, BindingResult bindingResult) {
        // Validation 예외 처리
        if (bindingResult.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                errors.put(fieldError.getField(), fieldError.getDefaultMessage());
            }
            return ResponseEntity.badRequest().body(errors);
        }

        userService.signup(requestDto);
        return ResponseEntity.ok("Signup successful");
    }




}
