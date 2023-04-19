package com.example.apicalls.service;

import com.example.apicalls.dao.UserRepository;
import com.example.apicalls.dto.UserDTO;
import com.example.apicalls.entity.users;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDTO getUser() {
        int userid = 2;
        users user = userRepository.findById(userid);
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);
        return userDTO;
    }

    @Override
    public UserDTO getUser(int userid) {
        users user = userRepository.findById(userid);
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);
        return userDTO;
    }

    @Override
    public UserDTO save(UserDTO userDTO) {
        users user = new users();
        BeanUtils.copyProperties(userDTO, user);
        users savedUser = userRepository.save(user);
        System.out.println("user saved!!!");
        return userDTO;
    }

    @Override
    public void deleteUser(int userid) {
        userRepository.deleteById(userid);
    }


}
