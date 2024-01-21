package com.mvccrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvccrud.dao.FriendsRepo;
import com.mvccrud.entity.Friends;

@Service
public class FriendsServiceImpl implements FriendsService {
	
	private FriendsRepo repo;
	
	@Autowired
	public FriendsServiceImpl(FriendsRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public List<Friends> findAll() {
		List<Friends> friends = repo.findAll();
		return friends;
	}

	@Override
	public Friends findById(int theId) {
		Optional<Friends> option = repo.findById(theId);
		Friends friend  = null;
		
		if(option.isPresent()) {
			friend = option.get();
		}
		else
			throw new RuntimeException("Cannot find employee id " + theId);
		
		return friend;
	}

	@Override
	public void save(Friends theFriend) {
		repo.save(theFriend);

	}

	@Override
	public void deleteById(int theId) {
		repo.deleteById(theId);

	}

}
