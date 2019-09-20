package com.anthonyvalle.api_connect.Service;

import com.anthonyvalle.api_connect.Shared.dto.UserDTO;
import org.springframework.stereotype.Service;


public interface UserService {

    UserDTO createUser(UserDTO userDTO);


}
