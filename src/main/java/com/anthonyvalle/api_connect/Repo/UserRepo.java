package com.anthonyvalle.api_connect.Repo;

import com.anthonyvalle.api_connect.io.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepo extends JpaRepository<UserEntity, Long> {
//    UserEntity findByEmail(String email);
//    UserEntity findByUserId(String userId);


}
