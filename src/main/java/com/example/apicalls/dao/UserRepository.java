package com.example.apicalls.dao;

import com.example.apicalls.entity.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<users, Integer> {

    users findByUseridAndPassword(int userid, String password);

    users findById(int id);

    List<users> findByStatus(String status);

}
