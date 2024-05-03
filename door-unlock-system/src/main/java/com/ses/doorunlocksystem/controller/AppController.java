package com.ses.doorunlocksystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ses.doorunlocksystem.model.DoorUnlock;
import com.ses.doorunlocksystem.model.User;
import com.ses.doorunlocksystem.service.UnlockService;

@CrossOrigin("*")
@RestController
@RequestMapping("/app")
public class AppController {
	
	@Autowired
	UnlockService unlockService;
	
	@PostMapping("/addUser")
    public String addDoctor(@RequestBody User user){
		unlockService.addUser(user);
		return "user added Successfully";
    }
	
	@GetMapping("/getUsers")
	public List<User> getUsers() {
		return unlockService.getUsers();
	}
	
	@PostMapping("/addUnlock")
    public String addUnlock(@RequestBody DoorUnlock doorUnlock){
		unlockService.addUnlock(doorUnlock);
		return "unlock added Successfully";
    }
	
	@GetMapping("/getUnlocks")
	public List<DoorUnlock> getUnlocks() {
		return unlockService.getUnlocks();
	}

}
