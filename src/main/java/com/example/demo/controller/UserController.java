package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    UserService userService;

    @GetMapping("/auth/signup")
    public String signup() {
        return "/user/signup";
    }

    @PostMapping("/auth/signup")
    public String signup(@ModelAttribute UserDTO userDTO) {
        userService.signup(userDTO);
        return "redirect:/auth/login";
    }

    @GetMapping("/auth/login")
    public String login() {
        return "redirect:/auth/login";
    }
}
