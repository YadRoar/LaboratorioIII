package com.example.login.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.login.models.AppUser;

public interface  AppUserRepository extends JpaRepository<AppUser, Integer> {
       
       public AppUser findByEmail (String email);

}
