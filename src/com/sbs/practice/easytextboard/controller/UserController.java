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
		int failCount = 0;
		int maxFailCount = 3;

		while (true) {
			if (failCount >= maxFailCount) {
				System.out.println("회원가입을 취소합니다.");
				return;
			}
			System.out.printf("사용자 아이디 : ");
			accountName = sc.nextLine().trim();

			boolean isValidAcountName = userService.isValidAcountName(accountName);
			if (isValidAcountName == false) {
				System.out.println("이미 사용중인 아이디입니다.");
				failCount++;
				continue;
			} else if (accountName.length() == 0) {
				System.out.println("올바른 아이디를 입력하세요.");
				failCount++;
				continue;
			}
			failCount = 0;
			break;
		}
		
		while (true) {
			if (failCount >= maxFailCount) {
				System.out.println("회원가입을 취소합니다.");
				return;
			}
			System.out.printf("사용자 비밀번호 : ");
			accountPw = sc.nextLine().trim();
			
			if (accountPw.length() == 0) {
				System.out.println("올바른 비밀번호를 입력하세요.");
				failCount++;
				continue;
			}
			failCount = 0;
			break;
		}
		
		while (true) {
			if (failCount >= maxFailCount) {
				System.out.println("회원가입을 취소합니다.");
				return;
			}
			System.out.printf("사용자 이름 : ");
			userName = sc.nextLine().trim();
			
			if (userName.length() == 0) {
				System.out.println("올바른 이름을 입력하세요.");
				failCount++;
				continue;
			}
			break;
		}
		
		int userId = userService.join(accountName, accountPw, userName);
		System.out.printf("축하합니다 %d번 회원님! 가입이 완료되었습니다.%n", userId);
	}

}
