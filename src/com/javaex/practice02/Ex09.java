package com.javaex.practice02;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
			
			
			int a = 2023;
			int b;
			int c;
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("태어난 년도를 입력해 주세요");
			System.out.print("년도: ");
			b = sc.nextInt();
	
			
			c = a-b;
			
			
			
			if( c<15 || c>=65 ) {
				System.out.println(c + "살 무료예방접종 대상자 입니다");
	
			}else { 
				System.out.println(c + "살 무료예방접종 대상자가 아닙니다");
			}
			
			sc.close();
	
		}
}
