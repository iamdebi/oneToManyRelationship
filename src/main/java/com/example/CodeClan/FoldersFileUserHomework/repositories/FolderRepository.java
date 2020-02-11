package com.example.CodeClan.FoldersFileUserHomework.repositories;

import com.example.CodeClan.FoldersFileUserHomework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
