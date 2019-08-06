package com.codeclan.example.filesandfoldershw.repositories;

import com.codeclan.example.filesandfoldershw.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
