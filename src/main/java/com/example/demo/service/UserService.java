package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    UserMapper userMapper;

    public void signup(UserDTO userDTO) {
        userDTO.setEnabled(true);
        userMapper.save(userDTO);
    }
}
