package com.example.web.admin.lost;

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

import com.example.web.util.Messenger;

@RequestMapping("/losts")
@RestController
public class LostController {

	@Autowired LostService lostService;
	
	@PostMapping("")
	public Messenger post(@RequestBody Lost lost) {
		lostService.register(lost);
		return Messenger.SUCCESS;
	}
	
	@GetMapping("")
	public List<Lost> list(){
		return lostService.findAll();
	}
	
	@GetMapping("/{lostID}")
	public Lost detail(@PathVariable String lostID) {
		return lostService.findOne(lostID);
	}
	
	@PutMapping("")
	public Messenger put(@RequestBody Lost lost) {
		lostService.modify(lost);
		return Messenger.SUCCESS;
	}
	
	@DeleteMapping("")
	public Messenger delete(@RequestBody Lost lost) {
		lostService.remove(lost);
		return Messenger.SUCCESS;
	}
}