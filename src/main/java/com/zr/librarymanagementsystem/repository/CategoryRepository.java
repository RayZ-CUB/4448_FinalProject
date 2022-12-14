package com.zr.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zr.librarymanagementsystem.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
