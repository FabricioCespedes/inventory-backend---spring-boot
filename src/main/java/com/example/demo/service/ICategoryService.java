package com.example.demo.service;

import org.springframework.http.ResponseEntity;

import com.example.demo.model.Category;
import com.example.demo.response.CategoryResponseRest;

public interface ICategoryService {

	public ResponseEntity<CategoryResponseRest> search();
	public ResponseEntity<CategoryResponseRest> searchById(Long id);
	public ResponseEntity<CategoryResponseRest> save(Category category);
}
