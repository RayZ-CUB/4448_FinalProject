package com.zr.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zr.librarymanagementsystem.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
