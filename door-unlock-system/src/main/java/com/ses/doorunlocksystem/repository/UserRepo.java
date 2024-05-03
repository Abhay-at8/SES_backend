package com.ses.doorunlocksystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ses.doorunlocksystem.model.User;

public interface UserRepo extends JpaRepository<User,Long>{

}
