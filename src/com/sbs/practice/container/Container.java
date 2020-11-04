package com.sbs.practice.container;

import java.util.Scanner;

import com.sbs.practice.easytextboard.session.Session;

public class Container {

	public static Scanner sc;
	public static Session session;

	static {
		sc = new Scanner(System.in);
		session = new Session();
	}

}
