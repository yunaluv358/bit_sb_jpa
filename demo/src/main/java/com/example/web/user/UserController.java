package com.example.web.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.admin.Admin;
import com.example.web.util.Messenger;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired UserService userService;
	
	@GetMapping("")
	public List<User> list(){
		return userService.findAll();
	}
	
	@GetMapping("/{userid}")
	public User detail(@PathVariable String userid) {
		return userService.findOne(userid);
	}
	

}

