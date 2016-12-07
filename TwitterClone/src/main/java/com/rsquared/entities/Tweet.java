package com.rsquared.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tweets")
public class Tweet {

	@Id
	@GeneratedValue
	int id;
	
	User author;
	
	Timestamp posted;
	
	String content;
	
	Tweet inReplyTo;
	
	Tweet inRepostTo;
	
}
