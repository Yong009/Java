package com.dice.exe;

import java.util.Scanner;

public class Dice {
	// 필드

	Scanner sc = new Scanner(System.in);

	int size = 0;
	int[] dice = null;
	String selectNo = sc.nextLine();
	// 내용 정리 -> 실행
	public Dice() {
		run();
	}

	private void run() {

		boolean run = true;

		while (run) {
			
			menu();

			

			switch (selectNo) {
			case "1":
				diceSize();
				break;

			case "2":
				diceSetting();
				break;

			case "3":
				diceResult();
				break;

			case "4":
				diceMax();
				break;

			case "5":
				System.out.println("종료");
				run = false;
				break;

			}

		}

	}

	private void menu() {
		System.out.println("1. 주사위 크기 2. 주사위 굴리기 3. 결과 보기 4. 가장 많이 나온 수 5. 종료");
		System.out.println("메뉴>");
	

	}

	private void diceSize() {
		System.out.println("주사위 크기 >");
		size = Integer.parseInt(sc.nextLine());

		if (size < 5 || size > 10) {
			System.out.println("5~10 사이의 수를 입력하세요.");
		} else {

		}

	}

	private void diceMax() {
		int max = dice[0];
		int index = 0;
		for (int i = 0; i < dice.length; i++) {
			if (max < dice[i]) {
				max = dice[i];
				index = i;
			}
		}
		System.out.println("가장 많이 나온 수는 " + (index + 1) + "입니다");

	}

	private void diceResult() {
		for (int i = 0; i < dice.length; i++) {
			System.out.println((i + 1) + "은" + dice[i] + "번 나왔습니다.");
		}

	}

	private void diceSetting() {

		dice = new int[size];

		int count = 0;

		while (true) {

			int random = (int) (Math.random() * size) + 1;

			dice[random - 1] = dice[random - 1] + 1;
			count++;

			if (random == 5) {
				break;
			}
		}
		System.out.println("5가 나올때 까지 주사위를 " + count + "번 굴렸습니다.");

	}
}