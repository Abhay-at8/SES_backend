package com.ses.doorunlocksystem.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class DoorUnlock {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	Long userId;
	String firstName;
	String doorId;
	LocalDateTime  unlockTime;
	public DoorUnlock(Long id, Long userId, String firstName, String doorId, LocalDateTime unlockTime) {
		super();
		this.id = id;
		this.userId = userId;
		this.firstName = firstName;
		this.doorId = doorId;
		this.unlockTime = unlockTime;
	}
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Long getUserId() {
		return userId;
	}



	public void setUserId(Long userId) {
		this.userId = userId;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getDoorId() {
		return doorId;
	}



	public void setDoorId(String doorId) {
		this.doorId = doorId;
	}



	public LocalDateTime getUnlockTime() {
		return unlockTime;
	}



	public void setUnlockTime(LocalDateTime unlockTime) {
		this.unlockTime = unlockTime;
	}



	public DoorUnlock() {}
	

}
