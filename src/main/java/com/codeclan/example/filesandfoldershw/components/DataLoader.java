package com.codeclan.example.filesandfoldershw.components;

import com.codeclan.example.filesandfoldershw.repositories.FileRepository;
import com.codeclan.example.filesandfoldershw.repositories.FolderRepository;
import com.codeclan.example.filesandfoldershw.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

    }
}
