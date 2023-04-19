package com.example.apicalls.controller;

import com.example.apicalls.dto.UserDTO;
import com.example.apicalls.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLIntegrityConstraintViolationException;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    //    @RequestMapping(name = "/create-user",method = RequestMethod.POST)
    @PostMapping("createUser")
    public String createUser(@RequestBody UserDTO userDTO) {
        UserDTO userDTO1 = null;
        try { 
            userDTO1 = userService.save(userDTO);
        } catch (Exception e) {
            System.out.println("Exception occurred while insertion." + e.getMessage());
        }
        return "saved successfully";
    }

    @GetMapping("getUser")
    public UserDTO readUser(@RequestParam int userId) {
        System.out.println("Controller Invoked!!! for userId of " + userId);
        return userService.getUser(userId);
    }

    @PutMapping("updateUser")
    public String updateUser(@RequestBody UserDTO userDTO) {
        UserDTO userDTO1 = userService.save(userDTO);
        return "updated successfully";

    }
    @DeleteMapping("/deleteUser")
    public String deleteUser(@RequestParam int userId) {
        userService.deleteUser(userId);
        return "Deleted Successfully";
    }

}


