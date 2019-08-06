package com.codeclan.example.filesandfoldershw.components;

import com.codeclan.example.filesandfoldershw.models.File;
import com.codeclan.example.filesandfoldershw.models.Folder;
import com.codeclan.example.filesandfoldershw.models.User;
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

        User user1 = new User("katherine");
        userRepository.save(user1);

        Folder colours = new Folder("colours", user1);
        folderRepository.save(colours);

        Folder animals = new Folder("animals", user1);
        folderRepository.save(animals);

        File blue = new File("blue", ".txt", 50, colours);
        fileRepository.save(blue);

        File orange = new File("orange", ".txt", 40, colours);
        fileRepository.save(orange);

        File whales = new File("whales", ".txt", 55, animals);
        fileRepository.save(whales);

        File bears = new File("bears", ".txt", 324, animals);
        fileRepository.save(bears);

        File giraffes = new File("giraffes", ".txt", 23, animals);
        fileRepository.save(giraffes);
    }
}
