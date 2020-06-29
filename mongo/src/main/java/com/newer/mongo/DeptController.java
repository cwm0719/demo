package com.newer.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
public class DeptController {
	@Autowired
	DeptRepository repository;
	
	@PostMapping
	public Dept save(@RequestBody Dept dept) {
		return repository.save(dept);
	}
}
