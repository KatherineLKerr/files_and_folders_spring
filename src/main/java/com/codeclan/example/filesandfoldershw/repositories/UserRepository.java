package com.codeclan.example.filesandfoldershw.repositories;

import com.codeclan.example.filesandfoldershw.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
