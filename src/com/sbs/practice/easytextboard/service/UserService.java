package com.sbs.practice.easytextboard.service;

import com.sbs.practice.easytextboard.dao.UserDao;
import com.sbs.practice.easytextboard.dto.User;

public class UserService {

	private UserDao userDao;

	public UserService() {
		userDao = new UserDao();
	}

	public int join(String accountName, String accountPw, String userName) {
		return userDao.add(accountName, accountPw, userName);
	}

	public boolean isValidAcountName(String accountName) {
		User user = userDao.getUserByAccountName(accountName);
		if (user != null) {
			return false;
		}
		return true;

	}

}
