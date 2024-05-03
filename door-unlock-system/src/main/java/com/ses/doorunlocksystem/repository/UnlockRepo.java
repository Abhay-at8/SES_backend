package com.ses.doorunlocksystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ses.doorunlocksystem.model.DoorUnlock;

public interface UnlockRepo extends JpaRepository<DoorUnlock,Long> {
	

}
