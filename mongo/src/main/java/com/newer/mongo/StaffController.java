package com.newer.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staff")
public class StaffController {

	@Autowired
	StaffRepository repository;
	
	@PostMapping
	public Staff save(@RequestBody Staff staff) {
		return repository.save(staff);
	}
	
	@GetMapping
	public List<Staff> findAll(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Staff load(@PathVariable String id) {
		return repository.findById(id).get();
	}
	
	@GetMapping("/")
	public Staff find(@RequestParam String name) {
		return repository.a(name);
	}
	
	@PutMapping
	public Staff update(@RequestBody Staff staff) {
		return repository.save(staff);
	}
	
	@DeleteMapping("/{id}")
	public void del(@PathVariable String id) {
		repository.deleteById(id);
	}
}
