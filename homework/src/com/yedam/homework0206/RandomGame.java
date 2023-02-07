package com.yedam.homework0206;

import java.util.Scanner;

public class RandomGame {
	public static Keypad getRandomGame() {
		Keypad game = null;
		// random data 출fur
		// 1==rpg
		// 2==acr
		int random = (int) (Math.random() * 2) + 1;
		return (random == 1) ? new RPGgame() : new ArcadeGame();
	}

	public static void main(String[] args) {
		boolean run = true;

		Scanner sc = new Scanner(System.in);
		// 인터페이스 다형성, 자동변환
		// 하나의 객체로 두개 또는 여러개의 객체 만들어 사용
		//game = new RPGgame();
		//game = new ArcadeGame();
		Keypad game = getRandomGame();

		while (run) {
			System.out.println("=================================");
			System.out.println(
					"<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
			System.out.println("=================================");
			System.out.println("입력>");
			int menuNo = Integer.parseInt(sc.nextLine());
			switch (menuNo) {
			case 1:
				game.leftUpButton();
				break;
			case 2:
				game.leftDownButton();
				break;
			case 3:
				game.rightDownButton();
				break;
			case 4:
				game.rightUpButton();
				break;
				
			case 5:
				game.changeMode();
				break;
			case 0:
				game = getRandomGame();
				break;
			case 9:
				System.out.println("종료");
				run = false;
			}
		}
	}
}
