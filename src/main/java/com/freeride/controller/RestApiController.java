package com.freeride.controller;

import com.freeride.model.User;
import com.freeride.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by Chamath Abeysinghe on 2/4/2017.
 */
@RestController
@RequestMapping("/api")
public class RestApiController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public ResponseEntity<List<User>> listAllUsers(){
        List<User> users=userService.findAllUsers();
        if(users.isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<User>>(users,HttpStatus.OK);
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public ResponseEntity<String> login(@RequestParam Map<String,String> allRequestParams){
        String name = allRequestParams.get("name");
        String nic= allRequestParams.get("nic");
        String telephone= allRequestParams.get("telephone");
        String email= allRequestParams.get("email");
        String gender= allRequestParams.get("gender");
        User user=new User();
        user.setName(name);
        user.setEmail(email);
        user.setGender(gender);
        user.setNic(nic);
        user.setEmail(email);
        user.setTelephone(telephone);
        user.setSecurityCode("9999999");
        userService.saveUser(user);
        return new ResponseEntity<String>("Successfully logged in",HttpStatus.OK);
    }


}
