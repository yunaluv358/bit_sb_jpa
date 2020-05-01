package com.example.web.user;

import com.example.web.util.Messenger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("")
	public Messenger post(@RequestBody User user) {
		userService.register(user);
		return Messenger.SUCCESS;
	}

	@GetMapping("")
	public List<User> list() {
		userService.findAll();
		return null;
	}
	
	@GetMapping("/{employNumber}")
	public User detail(@PathVariable String employNumber) {
		userService.findOne(employNumber);
		return null;
	}
	
	@PutMapping("/{employNumber}")
	public Messenger put(@RequestBody User user) {
		userService.modify(user);
		return Messenger.SUCCESS;
	}
	
	@DeleteMapping("/{employNumber}")
	public Messenger delete(@RequestBody User user) {
		userService.remove(user);
		return null;
}
}