package com.sbs.practice.easytextboard;

import java.util.Scanner;

import com.sbs.practice.container.Container;
import com.sbs.practice.easytextboard.controller.UserController;

public class App {
	UserController userController = new UserController();

	public void run() {
		Scanner sc = Container.sc;
		while (true) {

			System.out.printf("명령어) ");
			String cmd = sc.nextLine();

			if (cmd.equals("system exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (cmd.startsWith("user ")) {
				userController.doCmd(cmd);
			}
		}
		sc.close();
	}
}
