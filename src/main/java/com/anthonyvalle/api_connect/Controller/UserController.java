package com.anthonyvalle.api_connect.Controller;


import com.anthonyvalle.api_connect.Service.UserService;
import com.anthonyvalle.api_connect.Service.impl.UserServiceImpl;
import com.anthonyvalle.api_connect.Shared.dto.UserDTO;
import com.anthonyvalle.api_connect.ui.model.request.UserDetailsRequestModel;
import com.anthonyvalle.api_connect.ui.model.response.UserRest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserServiceImpl userService;


//    @GetMapping("/")
//    public List<UserRest> getAllUsers(){
//       Us
//
//
//
//        return "all Users";
//    }

    @PostMapping("/add")
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails ){
        UserRest userRest = new UserRest(); //creates an empty response object
        UserDTO userDTO = new UserDTO(); // creates an empty DTO object
        BeanUtils.copyProperties(userDetails,userDTO);
        /*
        ^ the code above copies items from the UserDetails (JSON OBJECT COMING FROM APP OR ENDPOINT) and
        puts in a new DTO object called userDTO
         */
        UserDTO createdUser = userService.createUser(userDTO);
        BeanUtils.copyProperties(createdUser,userRest);
       return userRest;
    }


}
