package com.itvedant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itvedant.model.Blog;
import com.itvedant.model.User;
import com.itvedant.model.UserWithoutPassword;
import com.itvedant.repository.BlogRepository;
import com.itvedant.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BlogRepository blogRepository;
	
	public Iterable<User> getAll(){
		return userRepository.findAll();
	}	
	
//	public List<UserWithoutPassword> getAll(){
//		return this.userRepository.findAllProjectedBy();
//	}
	
	public User add(User user) {
		return userRepository.save(user);
	}
	
	public String delete(Integer id) {
		User foundUser = this.find(id);
		if(foundUser == null)
			return null;
		else{
			userRepository.deleteById(id);
			return "deleted";
		}
	}
	
	public User find(Integer id) {
		return userRepository.findById(id).orElse(null);
	}	
	
	public User update(Integer id, User user) {
		User foundUser = this.find(id);
		if(foundUser == null)
			return null;
		else{
			user.setId(id);
			return userRepository.save(user);			
		}
	}
	
	public Blog addBlog(Integer userId, Blog blog) {
		User foundUser = this.find(userId);
		if(foundUser == null)
			return null;
		else {
			blog.setUser(foundUser);
			return this.blogRepository.save(blog);
		}
	}
	
	public List<Blog> getBlogs(Integer id){
		User foundUser = this.find(id);
		if(foundUser == null)
			return null;
		else {
			return foundUser.getBlogs();
		}		
	}
}
