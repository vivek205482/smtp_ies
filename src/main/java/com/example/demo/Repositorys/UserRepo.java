package com.example.demo.Repositorys;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entitys.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	User findByuserName(String userName);

}
 