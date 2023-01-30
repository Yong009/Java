package com.yedam.condition;

import java.util.Scanner;

public class Exam02 {
 public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	   
	   System.out.println("성적입력>");
	   //입력한 문자열 변수에 저장
	   String point = sc.nextLine();
	   //문자열을 int형으로 형 변환 하는 과정
	   int score = Integer.parseInt(point);
     
	   String pass = "";
	   if(score >= 90) {
		   pass = "A";
 
 } else if(score >= 80) 
 { pass = "B";
	 }else if(score >= 70) {
		 pass = "C";
	 }else {
		 pass = "D";
	 }
	 
	 //90이상은 A
	   //89~80 B
	   //79~70 C
	   //69~60 D
	 
	//switch문 부등호 사용 못함.
	//효율적으로 코딩(1~100 해당 되는 case문 만들지 말라)
	   switch(score/10) {
	   
	   case 10:   
	   case 9: 
		  System.out.println("A");
		  break;
	   case 8 : 
		   System.out.println("B");
		   break;
	   case 7 : 
		   System.out.println("C");
		   break;
	    default :
	    	System.out.println("D");
	    	break;
	    }

	   
	 
}
}
