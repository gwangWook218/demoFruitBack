package com.example.demo.mapper;

import com.example.demo.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void save(UserDTO userDTO);
}
