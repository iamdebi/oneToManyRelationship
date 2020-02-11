package com.example.CodeClan.FoldersFileUserHomework.component;

import com.example.CodeClan.FoldersFileUserHomework.models.File;
import com.example.CodeClan.FoldersFileUserHomework.models.Folder;
import com.example.CodeClan.FoldersFileUserHomework.models.User;
import com.example.CodeClan.FoldersFileUserHomework.repositories.FileRepository;
import com.example.CodeClan.FoldersFileUserHomework.repositories.FolderRepository;
import com.example.CodeClan.FoldersFileUserHomework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private FileRepository fileRepository;
    @Autowired
    private FolderRepository folderRepository;


    @Override
    public void run(ApplicationArguments args) {
        User debbie = new User("Debbie");
        userRepository.save(debbie);
        Folder javaProjects = new Folder("Java Projects", debbie);
        folderRepository.save(javaProjects);
        File javaIntro = new File("intro", ".java", 23, javaProjects);
        fileRepository.save(javaIntro);
        File javaClass = new File("Class", ".java", 35, javaProjects);
        fileRepository.save(javaClass);
        File javaRelationships = new File("Relationships", ".java", 17, javaProjects);
        fileRepository.save(javaRelationships);
        javaProjects.addFile(javaIntro);
        javaProjects.addFile(javaClass);
        javaProjects.addFile(javaRelationships);
        folderRepository.save(javaProjects);
        debbie.addFolder(javaProjects);
        userRepository.save(debbie);

        User bob = new User("Bob");
        userRepository.save(bob);
        Folder javaScript = new Folder("JavaScript Projects", bob);
        folderRepository.save(javaScript);
        File jsIntro = new File("intro", ".js", 29, javaScript);
        fileRepository.save(jsIntro);
        File js = new File("javaScript", ".js", 12, javaScript);
        fileRepository.save(js);
        Folder rubyProject = new Folder("Ruby Projects", bob);
        folderRepository.save(rubyProject);
        File rubyIntro = new File("ruby intro", ".ruby", 29, rubyProject);
        fileRepository.save(rubyIntro);
        File ruby = new File("ruby", ".ruby", 12, rubyProject);
        fileRepository.save(ruby);
        javaScript.addFile(jsIntro);
        javaScript.addFile(js);
        rubyProject.addFile(rubyIntro);
        rubyProject.addFile(ruby);
        folderRepository.save(javaScript);
        folderRepository.save(rubyProject);
        bob.addFolder(javaScript);
        bob.addFolder(rubyProject);
        userRepository.save(bob);


        User mike = new User("Mike");
        userRepository.save(mike);
        Folder jsProject = new Folder("jsProjects", bob);
        folderRepository.save(jsProject);
        File intro = new File("intro", ".js", 29, jsProject);
        fileRepository.save(intro);
        File vue = new File("vue", ".js", 12, jsProject);
        fileRepository.save(vue);
        Folder folder = new Folder("folder", bob);
        folderRepository.save(folder);
        File file1 = new File("ruby intro", ".ruby", 29, folder);
        fileRepository.save(file1);
        File file2 = new File("ruby", ".ruby", 12, folder);
        fileRepository.save(ruby);
        jsProject.addFile(intro);
        jsProject.addFile(vue);
        folder.addFile(file1);
        folder.addFile(file2);
        folderRepository.save(jsProject);
        folderRepository.save(folder);
        mike.addFolder(folder);
        mike.addFolder(jsProject);
        userRepository.save(mike);
    }
}
