package com.example.CodeClan.FoldersFileUserHomework.repositories;

import com.example.CodeClan.FoldersFileUserHomework.models.File;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
