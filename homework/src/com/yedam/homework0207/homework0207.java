package com.yedam.homework0207;

import java.util.Scanner;

public class homework0207 {
	public static void main(String[] args) {

//	#모든 문자열은 소문자로 받아서 진행 한다.
//	//1) 세 개의 단어를 입력 받아 그 중 가장 짧은 단어와 길이 리턴하기
//	예시 )  입력> tiger
//	          입력> lion
//	          입력> rabbit
//	          출력> 가장 짧은 단어는 lion이며, 길이는 4 입니다.
//
		// 문제1)

		Scanner sc = new Scanner(System.in);
//	System.out.println("입력>");
//	String a = sc.nextLine();
//	System.out.println("입력>");
//	String b = sc.nextLine();
//	System.out.println("입력>");
//	String c = sc.nextLine();
//	
//	if(a.length()<b.length() && a.length()<c.length()) {
//		System.out.println("가장 짧은 단어는 "+a+"이며, 길이는 "+a.length()+"입니다.");
//		
//	} else if(b.length()<a.length() && b.length()<c.length()) {
//		System.out.println("가장 짧은 단어는 "+b+"이며, 길이는 "+b.length()+"입니다.");
//	} else if(c.length()<a.length() && c.length()<c.length()) {
//		System.out.println("가장 짧은 단어는 "+c+"이며, 길이는 "+c.length()+"입니다.");
//	}

//	// 2) 문자열 개수 세기
//	-> 입력 문자열에서 알파벳, 숫자, 공백의 개수를 구하시오.
//	예시) 
//	-> 입력 : 1a2b3c4d 5e
//	-> 출력 : 문자 :5개, 숫자:5개, 공백 : 1개
//
//
		// 문제2) 아스키 코드 이용
//	System.out.print("입력 : ");
//	String A = sc.nextLine();
//	int B =0;
//	int C =0;
//	int D =0;
//	for(int i=0; i<A.length(); i++) {
//		if(A.charAt(i)>=48 && A.charAt(i)<=57) {
//			B++;
//		}
//	if(A.charAt(i)>=97 && A.charAt(i)<=122)
//			C++;
//	if(A.charAt(i)==' ') {
//		D++;
//	}
//	}
//	
//	System.out.println(B);
//	System.out.println(C);
//	System.out.println(D);

		// 3) 중복되는 문자가 없는 문자열에서 두 문자사이의 거리 구하기
//	조건 : 입력되는 두 문자를 제외한 가운데 문자의 갯수를 두 문자간 거리로 한다.
//	예시)
//	-> 입력 : "abcdefghijklmnopqrstuvwxyz"
//	-----------------------------------
//	-> 입력 : 첫번째 문자 : c
//	-> 입력 : 두번째 문자 : f
//	-> 출력 : 두 문자간의 거리 : 2
//	------------------------------------
//	-> 입력 : 첫번째 문자 : e
//	-> 입력 : 두번째 문자 : a
//	-> 출력 : 두 문자간의 거리 : 3
//

		// 문제3)

//	System.out.print("입력 : ");
//	String m = sc.nextLine();
//	System.out.print("입력 : ");
//	String f = sc.nextLine();
//	System.out.print("입력 : ");
//	String e = sc.nextLine();
//	
//	int index2 =m.indexOf(f);
//	int index3 =m.indexOf(e);
//	
//	System.out.println(index3-index2-1);

//	//4) 중복문자 제거
//	입력 : aaabbccceedddd
//	출력 : abcd
//	
		// 문제4)

		System.out.print("입력 : ");
		StringBuilder ab = new StringBuilder();
		String ap = sc.nextLine();
		for (int i = 0; i < ap.length(); i++) {
			if (ap.indexOf(ap.charAt(i)) == i) {
				System.out.print(i);
				ab.append(ap.charAt(i));
			}

		}
		System.out.print(ap);
	}

}
