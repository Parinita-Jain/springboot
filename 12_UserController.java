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
import com.itvedant.model.User;
import com.itvedant.service.UserService;
import com.itvedant.util.ResponseWrapper;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public ResponseEntity<?> getAllUsers(){
		ResponseWrapper wrapper = new ResponseWrapper();
		wrapper.setSubject("All User List");
		wrapper.setBody(userService.getAll());
		return new ResponseEntity<>(wrapper,HttpStatus.OK);
	}
	
	@PostMapping("/users")
	public ResponseEntity<?> addUser(@RequestBody User user) {
		ResponseWrapper wrapper = new ResponseWrapper();
		wrapper.setSubject("User Resource Created");
		wrapper.setBody(this.userService.add(user));
		return new ResponseEntity<>(wrapper,HttpStatus.OK);
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable Integer id) {
		String message = userService.delete(id);
		ResponseWrapper wrapper = new ResponseWrapper();
		if(message == null) {
			wrapper.setSubject("User Not Found");
			wrapper.setBody(null);
			return new ResponseEntity<>(wrapper,HttpStatus.NOT_FOUND);
		}
		else {
			wrapper.setSubject(message);
			wrapper.setBody(null);
			return new ResponseEntity<>(wrapper,HttpStatus.OK);
		}
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<?> findUser(@PathVariable Integer id) {
		User foundUser = userService.find(id);
		ResponseWrapper wrapper = new ResponseWrapper();
		//System.out.println(foundUser);
		if(foundUser == null) {
			wrapper.setSubject("User Not Found");
			wrapper.setBody(null);
			return new ResponseEntity<>(wrapper,HttpStatus.NOT_FOUND);
		}
		else{
			wrapper.setSubject("User Found: " + id);
			wrapper.setBody(foundUser);
			return new ResponseEntity<>(wrapper,HttpStatus.OK);
		}
	}
	
	@PutMapping("/users/{id}")
	public ResponseEntity<?> updateUser(@PathVariable Integer id, @RequestBody User user) {
		User updatedUser = userService.update(id, user);
		ResponseWrapper wrapper = new ResponseWrapper();
		if(updatedUser == null) {
			wrapper.setSubject("User Not Found");
			wrapper.setBody(null);
			return new ResponseEntity<>(wrapper,HttpStatus.NOT_FOUND);
		}
		else{
			wrapper.setSubject("User Updated: " + id);
			wrapper.setBody(updatedUser);
			return new ResponseEntity<>(wrapper,HttpStatus.OK);
		}
	}	
	
	@PostMapping("/users/{id}/blogs")
	public ResponseEntity<?> addBlog(@PathVariable Integer id, @RequestBody Blog blog){
		ResponseWrapper wrapper = new ResponseWrapper();
		wrapper.setSubject("Blog Added");
		wrapper.setBody(this.userService.addBlog(id, blog));
		return new ResponseEntity<>(wrapper,HttpStatus.OK);
	}
	
	@GetMapping("/users/{id}/blogs")
	public ResponseEntity<?> getBlog(@PathVariable Integer id){
		ResponseWrapper wrapper = new ResponseWrapper();
		wrapper.setSubject("Blogs Created by User: " + id);
		wrapper.setBody(this.userService.getBlogs(id));
		return new ResponseEntity<>(wrapper,HttpStatus.OK);
	}
}
