package com.example.demo.service;

import org.springframework.http.ResponseEntity;

import com.example.demo.response.CategoryResponseRest;

public interface ICategoryService {

	public ResponseEntity<CategoryResponseRest> search();
}
