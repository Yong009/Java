package com.yedam.array;

public class Exam05 {
	public static void main(String[] args) {
		// 최댓값 또는 최솟값이 위치하는 인덱스 구하기
		int[] array = { 20, 50, 70, 80, 30, 10, 90, 100 };
		int index1 = 0;
		int index2 = 0;
		int max = 0;
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				index1 = i;
			}
			if (min > array[i]) {
				min = array[i];
				index2 = i;
			}

		}
		System.out.println("최댓값의 인덱스: " + index1);
		System.out.println("최솟값의 인덱스: " + index2);

		for (int i = 0; i < args.length; i++) {
			System.out.println("명령 라인 출력 : " + args[i]);
		}
      
		
		
	}
}
