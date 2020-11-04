package com.sbs.practice.easytextboard.service;

import com.sbs.practice.easytextboard.dao.UserDao;

public class UserService {

	private UserDao userDao;

	public UserService() {
		userDao = new UserDao();
	}

	public int join(String accountName, String accountPw, String userName) {
		return userDao.add(accountName, accountPw, userName);
	}

}
