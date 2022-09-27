package com.Bridgelabz.Day1;

import java.util.Scanner;

public class CheckEqualString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the name 1 ");
		String name1 = sc.next();
		System.out.println(" Enter the name 2 ");
		String name2 = sc.next();
		System.out.println(name1.equals(name2));
	}
}
