package com.rsquared.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "profiles")
public class Profile {

	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	
}
