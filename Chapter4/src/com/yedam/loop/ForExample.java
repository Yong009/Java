package com.yedam.loop;

public class ForExample {
	public static void main(String[] args) {
		// 반복문
		// 일정한 행동을 계속 반복
		// 반복을 할 때 어떠한 규칙에 따라 행동 반복
		// 규칙 찾는 게 중요.

		// 1~5까지의 누적의 합
		int sum = 0;

		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;

		// for문
		for (int i = 1; i <= 5; i++) {
			sum += i;
		}

		System.out.println("누적 합 : " + sum);

		// 1~100 사에서 짝수 구하는 반복문
		// 1~100 -> 1~100까지 반복
		// 2,4,6,8,10....
		// 2%2,, 4%2,, 6%2,,,,

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "\t");
			}
		}

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.print("\n" + i + "\t");
			}
		}

		// 1~100 사이에서 2의 배수 또는 3의 배수 찾기

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.println("2 또는 3의 배수: " + i + "\t");
			}
		}

		// 구구단 출력하기
		for (int i = 1; i <= 9; i++) {
			System.out.println(" 2 x " + i + "=" + "\t" + (2 * i));
		}

		// 중첩 for문
		// 반복문 안에 반복문이 들어가는 형태
		// for() {
		// for() {
		// for() {
		// }

		// 2단 -> 2*1, 2*2, 2*3
		// 3단 -> 3*1, 3*2, 3*3
		// 4단 -> 4*1, 4*2, 4*3

		// 2단 ~ 9단까지를 출력하는 반복문
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + (i * j));
			}

		}

		// 구구단 세로 찍기
		for (int i = 2; i <= 2; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "x" + j + "=" + (i * j) + "\t");
				System.out.print((i + 1) + "x" + j + "=" + ((i + 1) * j) + "\t");
				System.out.print((i + 2) + "x" + j + "=" + ((i + 2) * j) + "\t");
				System.out.print((i + 3) + "x" + j + "=" + ((i + 3) * j) + "\n");
			}

		}

		// 공포의 별찍기

		// *****
		// *****
		// *****
		// *****
		// *****

		// 한칸씩 내려 갈 때 쓰는 반복문
		for (int i = 0; i < 5; i++) {
			// 별 출력할 때 쓰는 반복문
			String star = "";
			for (int j = 0; j < 5; j++) {
				// +연산자를 활용해서 ***** 만듬
				star = star + "*";
			}
			System.out.println(star);
		}

		// *
		// **
		// ***
		// ****
		// *****

		for (int i = 1; i <= 5; i++) {
			String star = "";
			for (int j = 0; i > j; j++) {
				star = star + "*";
			}
			System.out.println(star);
		}

		// *****
		// ****
		// ***
		// **
		// *

		for (int i = 1; i <= 5; i++) {
			String star = "";
			for (int j = 6; i < j; j--) {
				star = star + "*";
			}
			System.out.println(star);
		}

		// *
		// ***
		// *****

		for (int i = 0; i <= 2; i++) {
			String star = "";
			String blank = "";
			for (int b = 2; i < b; b--) {
				blank = blank + " ";
			}
			System.out.print(blank);

			for (int j = 0; (2 * i) + 1 > j; j++) {
				star = star + "*";
			}
			System.out.println(star);
		}

		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= 5; j++) {
				if (i > j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}


	
	
	
	
	
	
	
	
	
	}
}
