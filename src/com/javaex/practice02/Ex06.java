package com.javaex.practice02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age;
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이:");
		age = sc.nextInt();
		
		if (age >= 19 && age < 65) {
            System.out.println("1번그룹 입니다");
		}else {
			System.out.println("2번그룹 입니다");
		}
		
		sc.close();
	}
}
