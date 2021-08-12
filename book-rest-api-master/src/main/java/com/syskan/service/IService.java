package com.syskan.service;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface IService<T> {
	Collection<T> findAll();
	
	Optional<T> findById(UUID id);
	
	T saveOrUpdate(T t);
	
	String deleteById(UUID id);
}
