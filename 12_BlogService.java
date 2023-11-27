package com.itvedant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itvedant.model.Blog;
import com.itvedant.repository.BlogRepository;

@Service
public class BlogService {
	@Autowired
	BlogRepository blogRepository;
	
	public Iterable<Blog> getAll(){
		return blogRepository.findAll();
	}	
	
	public Blog add(Blog user) {
		return blogRepository.save(user);
	}
	
	public String delete(Integer id) {
		Blog foundUser = this.find(id);
		if(foundUser == null)
			return null;
		else{
			blogRepository.deleteById(id);
			return "deleted";
		}
	}
	
	public Blog find(Integer id) {
		return blogRepository.findById(id).orElse(null);
	}	
	
	public Blog update(Integer id, Blog user) {
		Blog foundUser = this.find(id);
		if(foundUser == null)
			return null;
		else{
			user.setId(id);
			return blogRepository.save(user);			
		}
	}
}
