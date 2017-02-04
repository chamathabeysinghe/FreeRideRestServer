package com.freeride.controller;

import com.freeride.model.User;
import com.freeride.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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


}
