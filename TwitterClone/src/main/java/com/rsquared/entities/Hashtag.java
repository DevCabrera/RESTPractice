package com.rsquared.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;

@Entity
public class Hashtag {

	String label;
	
	Timestamp firstUsed;
	
	Timestamp lastUsed;
	
	
}
