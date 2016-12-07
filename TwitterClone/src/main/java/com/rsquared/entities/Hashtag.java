package com.rsquared.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hashtags")
public class Hashtag {

	String label;
	
	Timestamp firstUsed;
	
	Timestamp lastUsed;
	
	
}
