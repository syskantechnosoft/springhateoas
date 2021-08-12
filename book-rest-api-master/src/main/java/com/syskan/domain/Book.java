package com.syskan.domain;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
//@Getter
//@Setter
//@NoArgsConstructor
public class Book extends RepresentationModel<Book> {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private UUID id;
	private String title;
	private String author;
	private String coverPhotoURL;
	private Long isbnNumber;
	private Double price;
	private String language;

	public Book() {
		super();
	}

	@JsonCreator
	public Book(@JsonProperty("id") UUID id, @JsonProperty("title") String title, @JsonProperty("author") String author,
			@JsonProperty("coverPhotoURL") String coverPhotoURL, @JsonProperty("isbnNumber") Long isbnNumber,
			@JsonProperty("price") Double price, @JsonProperty("language") String language) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.coverPhotoURL = coverPhotoURL;
		this.isbnNumber = isbnNumber;
		this.price = price;
		this.language = language;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCoverPhotoURL() {
		return coverPhotoURL;
	}

	public void setCoverPhotoURL(String coverPhotoURL) {
		this.coverPhotoURL = coverPhotoURL;
	}

	public Long getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(Long isbnNumber) {
		this.isbnNumber = isbnNumber;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
