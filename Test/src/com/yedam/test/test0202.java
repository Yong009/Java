package com.yedam.test;
import java.util.Scanner;

public class test0202 {
	public static void main(String[] args) {

		// 문제1
//		
		int a = 10;
		float b = 2f;

		System.out.println((int) (a + b));

		// 문제2
		// (1) false
		// (2) true
		// (3) false

		// 문제3
		// 큰 금액부터 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = new int[4];
		int money = 2680;
		System.out.println("money=" + money);
		for (int i = 0; i < coinUnit.length; i++) {
			if (i == 0) {
				coinUnit[0] = (int) (money / 500);
			} else if (i == 1) {
				coinUnit[1] = (int) ((money % 500) / 100);
			} else if (i == 2) {
				coinUnit[2] = (int) (((money % 500) % 100) / 50);
			} else if (i == 3) {
				coinUnit[3] = (int) ((((money % 500) % 100) % 50) / 10);
			}
		}
		System.out.println(money % 500);
		System.out.print("500원 : " + coinUnit[0] + "개" + "\t");
		System.out.print("100원 : " + coinUnit[1] + "개" + "\t");
		System.out.print("50원 : " + coinUnit[2] + "개" + "\t");
		System.out.println("10원 : " + coinUnit[3] + "개" + "\t");

		// 문제4

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i >= j) {
					System.out.println(i + "x" + j + "=" + i * j);
				}

			}
		}

		// 문제5
		Scanner sc = new Scanner(System.in);
		boolean go = true;
		while (go) {
			System.out.println("==1.주사위 크기 2.주사위 굴리기 3.결과 보기 4.가장 많온 수 5.종료===");
			System.out.println("메뉴>");
			int cho = Integer.parseInt(sc.nextLine());

			switch (cho) {
			case 1:
//			
				System.out.println("주사위 크기>");
				int cho2 = Integer.parseInt(sc.nextLine());
				if (cho2 < 5 || cho2 > 10) {
					System.out.println("범위에서 벗어났습니다.");

				}

				else if (cho == 2) {
					System.out.println("주사위");
				}
				

			case 2:

				int Count5 = 0;
				int Count6 = 0;
				int Count7 = 0;
				int Count8 = 0;
				int Count9 = 0;
				int Count10 = 0;

				boolean stop = true;

				while (stop) {
					int su = (int) (Math.random() * 10) + 5;
					if (su == 5) {

						System.out.println("5가 나올 때까지 주사위를" + Count5 + " 번 굴렸습니다.");
                        stop = false;
						
					}
					if (su == 6) {
						Count6++;

					}
					if (su == 7) {
						Count7++;
						if (su == 8) {
							Count8++;
						}
						if (su == 9) {
							Count9++;
						}
						if (su == 10) {
							Count10++;
						}

					}
					Count5++;
				}
				
			case 3:
//						 System.out.println("5는"+Count5+"번 나왔습니다.");
//						 System.out.println("5는"+Count6+"번 나왔습니다.");
//						 System.out.println("5는"+Count7+"번 나왔습니다.");
//						 System.out.println("5는"+Count8+"번 나왔습니다.");
//						 System.out.println("5는"+Count9+"번 나왔습니다.");
//						 System.out.println("5는"+Count10+"번 나왔습니다.");
////							
				
			case 4:
				 
//		}           case 5:

			case 5:
				System.out.println("프로그램 종료");
				go = false;
		
				
		
				
				
				
			
			
			
			
			}

		}
	}
}
