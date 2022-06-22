package com.example.springboot.dao;

import com.example.springboot.entity.DAOUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<DAOUser, Long> {

    DAOUser findByUsername(String userName);

}
