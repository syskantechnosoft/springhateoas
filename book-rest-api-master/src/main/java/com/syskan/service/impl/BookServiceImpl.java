package com.syskan.service.impl;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syskan.domain.Book;
import com.syskan.repository.BookRepository;
import com.syskan.service.IService;

@Service
public class BookServiceImpl implements IService<Book> {
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public Collection<Book> findAll() {
		return bookRepository.findAll();
	}

	@Override
	public Optional<Book> findById(UUID id) {
		return bookRepository.findById(id);
	}

	@Override
	public Book saveOrUpdate(Book book) {
		return bookRepository.saveAndFlush(book);
	}

	@Override
	public String deleteById(UUID id) {
		JSONObject jsonObject = new JSONObject();
		try {
			bookRepository.deleteById(id);
			jsonObject.put("message", "Book deleted successfully");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return jsonObject.toString();
	}

}
