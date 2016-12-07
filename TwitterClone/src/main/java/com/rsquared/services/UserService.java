package com.rsquared.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.rsquared.entities.Credentials;
import com.rsquared.entities.Tweet;
import com.rsquared.entities.User;

@Component
public interface UserService {
	
	List<User> getAllUsers();
	
	User getUserByUsername(String username);
	
	User updateUserProfile(String username);
	
	User createNewUser(User user);
	
	User deleteUser(String username);
	
	String follow(Credentials credentials);
	
	String unfollow(Credentials credentials);
	
	List<Tweet> getFeed(String username);
	
	List<Tweet> getAllTweetsByUser(String username);
	
	List<Tweet> getMentiones(String username);
	
	List<User> getFollowers(String username);
	
	List<User> getFollowing(String username);
	
}
