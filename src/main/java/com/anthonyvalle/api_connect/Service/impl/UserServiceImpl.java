package com.anthonyvalle.api_connect.Service.impl;

import com.anthonyvalle.api_connect.Repo.UserRepo;
import com.anthonyvalle.api_connect.Service.UserService;
import com.anthonyvalle.api_connect.Shared.dto.UserDTO;
import com.anthonyvalle.api_connect.io.entity.UserEntity;
import com.anthonyvalle.api_connect.ui.model.response.UserRest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        UserEntity userEntity = new UserEntity();
        userDTO.setEncryptedPassword("test");//Todo:take away
        userDTO.setUserId("testUserID");//TODO:TAKE AWAY
        BeanUtils.copyProperties(userDTO,userEntity);

        UserEntity result =  userRepo.save(userEntity);

        UserDTO returnValue = new UserDTO();
        BeanUtils.copyProperties(userEntity,returnValue);
        return returnValue;
    }


}
