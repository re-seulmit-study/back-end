package com.minjyeon.sulmit.controller;

import com.minjyeon.sulmit.dto.UserInfoDto;
import com.minjyeon.sulmit.entity.UserRoleEnum;
import com.minjyeon.sulmit.security.UserDetailsImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequiredArgsConstructor
public class LoginController {
//    @GetMapping("/user-info")
//    @ResponseBody
//    public UserInfoDto getUserInfo(@AuthenticationPrincipal UserDetailsImpl userDetails) {
//        String username = userDetails.getUser().getUsername();
//        UserRoleEnum role = userDetails.getUser().getRole();
//        boolean isAdmin = (role == UserRoleEnum.ADMIN);
//
//        return new UserInfoDto(username, isAdmin);
//    }
}
