package com.example.apicalls.service;

import com.example.apicalls.dto.UserDTO;
import com.example.apicalls.entity.users;

public interface UserService {

    public UserDTO getUser();

    public UserDTO getUser(int userid);

    public UserDTO save(UserDTO userDTO);

    public void deleteUser(int userid);
}
