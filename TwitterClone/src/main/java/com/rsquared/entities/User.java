package com.rsquared.entities;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class User {

	@Id
	@Column(name="userId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long userId;
	
	Profile profile;
	
	Credentials credentials;
	
	@Column(name="joined")
	Timestamp joined;
	
	@Column(name="folowing")
	List<User> following;
	
	@Column(name="followers")
	List<User> followers;
	
	@Column(name="tweets")
	List<Tweet> tweets;
	
	@Column(name="mentions")
	List<Tweet> mentions;
	
}
