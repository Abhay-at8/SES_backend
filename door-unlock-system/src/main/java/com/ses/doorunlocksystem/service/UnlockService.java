package com.ses.doorunlocksystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ses.doorunlocksystem.model.DoorUnlock;
import com.ses.doorunlocksystem.model.User;
import com.ses.doorunlocksystem.repository.UnlockRepo;
import com.ses.doorunlocksystem.repository.UserRepo;

@Service
public class UnlockService {
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	UnlockRepo unlockRepo;

	public void addUser(User user) {
		
//		if(user.getRole().equals("owner")) {
//			userRepo.save(user);
//		}
		userRepo.save(user);
		
	}

	public List<User> getUsers() {

		return userRepo.findAll();
	}

	public void addUnlock(DoorUnlock doorUnlock) {
		unlockRepo.save(doorUnlock);
		
	}

	public List<DoorUnlock> getUnlocks() {
		return unlockRepo.findAll();
	}

}
