package com.minjyeon.sulmit.controller;

import com.minjyeon.sulmit.dto.ResponseData;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    @GetMapping("/")
    public ResponseEntity<ResponseData<?>> main() {
        System.out.println("메인 페이지 반환");
        return ResponseEntity.status(HttpStatus.OK).body(ResponseData.success());
    }

    // 로그인 페이지를 반환합니다.
    @GetMapping("/login")
    public ResponseEntity<ResponseData<?>> login() {
        System.out.println("로그인 페이지 반환");
        return ResponseEntity.status(HttpStatus.OK).body(ResponseData.success());
    }

    // 회원가입 페이지를 반환합니다.
    @GetMapping("/register")
    public ResponseEntity<ResponseData<?>> register() {
        System.out.println("회원가입 페이지 반환");
        return ResponseEntity.status(HttpStatus.OK).body(ResponseData.success());
    }
}
