package com.sbs.practice.easytextboard.controller;

import java.util.Scanner;

import com.sbs.practice.container.Container;
import com.sbs.practice.easytextboard.service.UserService;

public class UserController {

	private UserService userService;

	public UserController() {
		userService = new UserService();
	}

	public void doCmd(String cmd) {
		if (cmd.equals("user join")) {
			join(cmd);
		}

	}

	private void join(String cmd) {
		Scanner sc = Container.sc;
		String accountName;
		String accountPw;
		String userName;

		System.out.printf("사용자 아이디 : ");
		accountName = sc.nextLine();

		System.out.printf("사용자 비밀번호 : ");
		accountPw = sc.nextLine();

		System.out.printf("사용자 이름 : ");
		userName = sc.nextLine();

		int userId = userService.join(accountName, accountPw, userName);
		System.out.printf("축하합니다! %d번 회원이 가입되었습니다.%n", userId);
	}

}
