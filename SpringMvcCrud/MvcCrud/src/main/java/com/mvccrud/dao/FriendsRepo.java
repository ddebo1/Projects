package com.mvccrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mvccrud.entity.Friends;

public interface FriendsRepo extends JpaRepository<Friends, Integer> {

}
