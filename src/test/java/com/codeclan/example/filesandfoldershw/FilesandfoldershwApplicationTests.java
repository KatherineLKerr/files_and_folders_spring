package com.codeclan.example.filesandfoldershw;

import com.codeclan.example.filesandfoldershw.models.File;
import com.codeclan.example.filesandfoldershw.models.Folder;
import com.codeclan.example.filesandfoldershw.models.User;
import com.codeclan.example.filesandfoldershw.repositories.FileRepository;
import com.codeclan.example.filesandfoldershw.repositories.FolderRepository;
import com.codeclan.example.filesandfoldershw.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesandfoldershwApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createUserAndFileAndFolder() {
		User user1 = new User("katherine");
		userRepository.save(user1);

		Folder folder1 = new Folder("LookItIsFullOfFiles", user1);
		folderRepository.save(folder1);

		File file1 = new File("filename", ".txt", 50, folder1);
		fileRepository.save(file1);
	}

}
