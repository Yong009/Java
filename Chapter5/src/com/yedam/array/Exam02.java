package com.yedam.array;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		// array.length
		Scanner sc = new Scanner(System.in);

		int[] ary = new int[6];

		System.out.println("ary의 배열 크기 : " + ary.length);

		int[] ary2;
		System.out.println("배열의 크기>");
		int no = Integer.parseInt(sc.nextLine());

		ary2 = new int[no];
		System.out.println("ary2의 배열크기 : " + ary2.length);

		// i가 배열의 길이까지 하는 게 편함
		for (int i = 0; i < ary2.length; i++) {
			System.out.println("입력>");
			ary2[i] = Integer.parseInt(sc.nextLine());
		}

		// js -> for of , java 향상된 for문
		for (int var : ary2) {
			System.out.println(var);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
