package com.sbs.practice.easytextboard.session;

public class Session {
	public int loginedUserId;

	public Session() {
		loginedUserId = 0;
	}

	public void login(int userId) {
		loginedUserId = userId;

	}

	public void logout() {
		loginedUserId = 0;

	}

}
