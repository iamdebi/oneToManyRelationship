package com.example.CodeClan.FoldersFileUserHomework.repositories;

import com.example.CodeClan.FoldersFileUserHomework.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
