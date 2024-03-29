package com.crud.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.spring.model.User;
@Repository
public interface UserRepository extends JpaRepository<User , Long> {

}
