package com.zr.librarymanagementsystem;

import com.zr.librarymanagementsystem.aspect.NoLog;
import com.zr.librarymanagementsystem.entity.Region;
import com.zr.librarymanagementsystem.entity.Author;
import com.zr.librarymanagementsystem.entity.Book;
import com.zr.librarymanagementsystem.entity.Category;
import com.zr.librarymanagementsystem.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Slf4j
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableAspectJAutoProxy
public class Library_app {

	public static void main(String[] args) {
		log.info("App starts to run!");
		SpringApplication.run(Library_app.class, args);
	}

//	@Bean
//	public CommandLineRunner initialCreate(BookService bookService) {
//		return (args) -> {
//
//			Book book = new Book("Test isbn", "Test name", "Test serial name", "Test description");
//			Author author = new Author("Test author name", "Test description");
//			Category category = new Category("Test category name");
//			Region region = new Region("US");
//
//			book.addAuthors(author);
//			book.addCategories(category);
//			book.addRegions(region);
//
//			bookService.createBook(book);
//
//			Book book1 = new Book("Test isbn1", "Test name1", "Test serial name1", "Test description1");
//			Author author1 = new Author("Test author name1", "Test description1");
//			Category category1 = new Category("Test category name1");
//			Region region1 = new Region("China");
//
//			book1.addAuthors(author1);
//			book1.addCategories(category1);
//			book1.addRegions(region1);
//
//			bookService.createBook(book1);
//
//			Book book2 = new Book("Test isbn2", "Test name2", "Test serial name2", "Test description2");
//			Author author2 = new Author("Test author name2", "Test description2");
//			Category category2 = new Category("Test category name2");
//			Region region2 = new Region("Russia");
//
//			book2.addAuthors(author2);
//			book2.addCategories(category2);
//			book2.addRegions(region2);
//
//			bookService.createBook(book2);

//		};
//	}
}
