package com.yedam.exception;

public class Application {
//  try {
//	  //예외가 발생할만한 코드
//	  } catch() {
//		  //예외가 발생 후 처리하는 코드
//	  } finally {
//		  //try 또는 catch문 실행하고 나서 무조건!!
//		  //실행해야하는 코드
//	  } 
	public static void main(String[] args) {
		try {
			// 예외가 발생할꺼 같은 코드
//			double avg = 1 / 0;
//			System.out.println(avg);

//			String str = "자바";
//			int a = Integer.parseInt(str);

			// ClassNotFound
//			Class clazz = Class.forName("java.lang.String2");
			
			int[]intAry = new int[5];
			intAry[7] = 6;
		} catch (ArithmeticException e) {
		
			e.printStackTrace();
			
		} catch (NumberFormatException e) {
		
			System.out.println("숫자는 0으로 나누기 못함");
			
//		} catch (ClassNotFoundException e) {
//		
//			System.out.println("문자열 변환 에러!");

		} catch (Exception e) {
		
			System.out.println("위에서 처리못하면 내가 처리함");
		} finally {
			System.out.println("finally 항상 실행");
		}
		System.out.println("try-catch탈출");

		// } catch (Exception e) {
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
//			e.printStackTrace();
//			System.out.println("클래스를 찾지 못해서 나는 오류입니다.");
	}

}
