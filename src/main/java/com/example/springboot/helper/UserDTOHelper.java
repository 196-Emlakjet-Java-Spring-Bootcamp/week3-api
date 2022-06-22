package com.example.springboot.helper;

import com.example.springboot.dto.UserDTO;
import com.example.springboot.entity.DAOUser;
import org.springframework.stereotype.Component;

@Component
public class UserDTOHelper {

    public DAOUser convertToEntity(UserDTO userDTO){
        DAOUser userEntity = new DAOUser();
        userEntity.setUsername(userDTO.getUsername());
        userEntity.setPassword(userDTO.getPassword());
        userEntity.setEmail(userDTO.getEmail());
        return userEntity;
    }

    public UserDTO convertToDTO(DAOUser userEntity){
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(userEntity.getUsername());
        userDTO.setPassword(userEntity.getPassword());
        userDTO.setEmail(userEntity.getEmail());
        return userDTO;
    }

}
