package com.budget.app.usermgmt.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.budget.app.usermgmt.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}
