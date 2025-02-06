package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.mapper.APIUserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class APIUserService {
    APIUserMapper apiUserMapper;
    PasswordEncoder passwordEncoder;

    public void signup(UserDTO userDTO) {
        String encodePw = passwordEncoder.encode(userDTO.getPassword());
        userDTO.setPassword(encodePw);
        userDTO.setEnabled(userDTO.isEnabled());

//        사용자 등록
        apiUserMapper.save(userDTO);
//        권한 등록
        apiUserMapper.insertUserRole(userDTO.getId(), 1);
    }
}
