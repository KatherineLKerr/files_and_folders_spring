package com.codeclan.example.filesandfoldershw.repositories;

import com.codeclan.example.filesandfoldershw.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
