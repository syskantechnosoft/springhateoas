package com.syskan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.syskan.domain.Book;
import com.syskan.service.IService;

//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2
public class Application implements CommandLineRunner {
	
	@Autowired
	private IService<Book> service;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book = new Book();
		book.setTitle("Spring Microservices in Action");
		book.setAuthor("John Carnell");
		book.setCoverPhotoURL("https://images-na.ssl-images-amazon.com/images/I/417zLTa1uqL._SX397_BO1,204,203,200_.jpg");
		book.setIsbnNumber(1617293989L);
		book.setPrice(2776.00);
		book.setLanguage("English");
		service.saveOrUpdate(book);
		
		Book book1 = new Book();
		book1.setTitle("JAVA Complete Reference");
		book1.setAuthor("Herbert Schildt");
		book1.setCoverPhotoURL("https://images-na.ssl-images-amazon.com/images/I/51U232GoNXL._SX385_BO1,204,203,200_.jpg");
		book1.setIsbnNumber(9339212096L);
		book1.setPrice(740.00);
		book1.setLanguage("English");
		service.saveOrUpdate(book1);

	}

}
