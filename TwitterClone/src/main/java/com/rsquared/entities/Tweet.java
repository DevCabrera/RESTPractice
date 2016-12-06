package com.rsquared.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;

@Entity
public class Tweet {

	int id;
	
	User author;
	
	Timestamp posted;
	
	String content;
	
	Tweet inReplyTo;
	
	Tweet inRepostTo;
	
}
