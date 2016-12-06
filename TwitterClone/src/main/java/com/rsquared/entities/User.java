package com.rsquared.entities;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class User {

	Long id;
	
	Profile profile;
	
	Credentials credentials;
	
	Timestamp joined;
	
	List<User> following;
	
	List<User> followers;
	
	List<Tweet> tweets;
	
	List<Tweet> mentions;
	
}
