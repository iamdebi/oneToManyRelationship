package com.example.CodeClan.FoldersFileUserHomework.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Users")
public class User {

    @Column
    private String name;
    @OneToMany(mappedBy = "user")
    private List<Folder> folders;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public User(String name) {
        this.name = name;
        this.folders = new ArrayList<>();
    }

    public  User(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void addFolder(Folder folder){
        this.folders.add(folder);
    }

}
