package com.mvccrud.service;

import java.util.List;

import com.mvccrud.entity.Friends;

public interface FriendsService {
	
	List<Friends> findAll();
	
	Friends findById(int theId);
	
	void save(Friends theEmployee);
	
	void deleteById(int theId);
}
