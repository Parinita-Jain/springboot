package com.itvedant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itvedant.model.Blog;
import com.itvedant.service.BlogService;
import com.itvedant.util.ResponseWrapper;

@RestController
public class BlogController {
	@Autowired
	private BlogService blogService;
	
	@GetMapping("/blogs")
	public ResponseEntity<?> getAllUsers(){
		ResponseWrapper wrapper = new ResponseWrapper();
		wrapper.setSubject("All Blog List");
		wrapper.setBody(blogService.getAll());
		return new ResponseEntity<>(wrapper,HttpStatus.OK);
	}
	
	@PostMapping("/blogs")
	public ResponseEntity<?> addUser(@RequestBody Blog user) {
		ResponseWrapper wrapper = new ResponseWrapper();
		wrapper.setSubject("Blog Resource Created");
		wrapper.setBody(this.blogService.add(user));
		return new ResponseEntity<>(wrapper,HttpStatus.OK);
	}
	
	@DeleteMapping("/blogs/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable Integer id) {
		String message = blogService.delete(id);
		ResponseWrapper wrapper = new ResponseWrapper();
		if(message == null) {
			wrapper.setSubject("Blog Not Found");
			wrapper.setBody(null);
			return new ResponseEntity<>(wrapper,HttpStatus.NOT_FOUND);
		}
		else {
			wrapper.setSubject(message);
			wrapper.setBody(null);
			return new ResponseEntity<>(wrapper,HttpStatus.OK);
		}
	}
	
	@GetMapping("/blogs/{id}")
	public ResponseEntity<?> findUser(@PathVariable Integer id) {
		Blog foundUser =blogService.find(id);
		ResponseWrapper wrapper = new ResponseWrapper();
		//System.out.println(foundUser);
		if(foundUser == null) {
			wrapper.setSubject("Blog Not Found");
			wrapper.setBody(null);
			return new ResponseEntity<>(wrapper,HttpStatus.NOT_FOUND);
		}
		else{
			wrapper.setSubject("Blog Found: " + id);
			wrapper.setBody(foundUser);
			return new ResponseEntity<>(wrapper,HttpStatus.OK);
		}
	}
	
	@PutMapping("/blogs/{id}")
	public ResponseEntity<?> updateUser(@PathVariable Integer id, @RequestBody Blog user) {
		Blog updatedUser = blogService.update(id, user);
		ResponseWrapper wrapper = new ResponseWrapper();
		if(updatedUser == null) {
			wrapper.setSubject("Blog Not Found");
			wrapper.setBody(null);
			return new ResponseEntity<>(wrapper,HttpStatus.NOT_FOUND);
		}
		else{
			wrapper.setSubject("Blog Updated: " + id);
			wrapper.setBody(updatedUser);
			return new ResponseEntity<>(wrapper,HttpStatus.OK);
		}
	}	
}
