package com.extremity.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.extremity.model.User;



public interface DaoInterface /*extends CrudRepository<User, Integer>*/{

	public User findAllByUnameAndPassword(String uname,String password);
	public User findAllByUid(int uid);
	public User findAllByPassword(String password);
	User saveUser(User user);
	int loginCheck(User user);
	List<User> displayAll(User user);
	User editUser(User user);
	int updateUser(User user);
	public User findOne(int uid);
	public int deleteUser(int id);
	public ArrayList<User> findAll();
	public List loginCheck(String uname, String password);
}
