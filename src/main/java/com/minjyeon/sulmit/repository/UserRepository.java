package com.minjyeon.sulmit.repository;

import com.minjyeon.sulmit.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
