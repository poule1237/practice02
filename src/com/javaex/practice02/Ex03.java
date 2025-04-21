package com.javaex.practice02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		//age가0살초과이고18살미만이면
		if(age < 18 ) {
			
			System.out.println("청소년입니다.");
		}else{
			System.out.println("청소년이 아닙니다");
		}
		sc.close();
	}
		
}
