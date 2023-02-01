package homework;

import java.util.Scanner;

public class homework4 {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		Scanner sc = new Scanner(System.in);
		// 문제1
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 60) {

				System.out.println(i);
			}
		}

		// 문제2

		for (int i = 0; i < arr1.length; i++) {
			if (i != 3) {
				System.out.print(arr1[i] + "\t");
			}
		}

		// 문제3
		int index = 0;
		System.out.println("\n" + "인덱스번호>");
		int a = sc.nextInt();
		for (int i = 0; i < arr1.length; i++) {

			if (i == a) {
				arr1[i] = 1000;
				System.out.println(arr1[i]);
			}
		}

		// 문제4
		int max = 0;
		int min = arr1[0];

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > max) {
				max = arr1[i];

			}
			if (arr1[i] < min) {
				min = arr1[i];

			}
		}
		System.out.println("최댓값  : " + max);
		System.out.println("최솟값 : " + min);

		// 문제5
		int[] arr2 = new int[10];
		for (int i = 0; i <= 9; i++) {
			System.out.println("양의 정수를 입력하세요");
			int plus = sc.nextInt();
			arr2[i] = plus;}
	     for (int j=0; j<=9; j++){
	    	 if (arr2[j]%3 == 0) {
				System.out.println(arr2[j]);
			}
		}

	    //추가문제
	     int[]answer = {1,4,4,3,1,4,4,2,1,3,2};
			
			for(int i=0; i<answer.length; i++) {
				String star = "";
				for(int j=0; j<answer[i]; j++) 
						star = star+ "*";
			  System.out.println(star);}
	     
	     
	}
}
