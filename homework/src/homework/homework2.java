package homework;

import java.util.Scanner;

public class homework2 {
 public static void main(String[] args) {

	 
	 
	//문제 1
	 
	 Scanner sc = new Scanner(System.in);
	 
//	 System.out.println("x값 입력>");
//	 
//	  int x = sc.nextInt();
//	  
//	 System.out.println("y값 입력>"); 
//	  int y = sc.nextInt();
//	 
//	 if(x>0 && y>0){
//		 System.out.println("제1사분면");
//	 } else if(x<0 && y>0) {
//		 System.out.println("제2사분면");
//	 } else if(x<0 && y<0) {
//		 System.out.println("�제3사분면");
//	 } else if(x>0 && y<0) { 
//		 System.out.println("제4사분면");
//	 }
		 
		 
		 
 
	 
	 
	 
	//문제 2
	 
//	System.out.println("해당 연도를 적어주세요");
//	int years = sc.nextInt();
//	if(years%4 == 0 && years%100 != 0) { 
//	 System.out.println("윤년입니다");
//	} else if(years%400==0) { 
//			System.out.println("윤년입니다");
//		} else{ 
//			System.out.println("윤년이 아닙니다");
//		} 			
//	}
//	 
	
	//문제 3
	
//     System.out.println("가위바위보를 입력하세요. 1.가위 2.바위 3.보");
//     int game = sc.nextInt(); 
//     
//     switch(game){
//    	 case 1 :
//    		 System.out.println("바위를 내셔야 이깁니다.");
//    		 break;
//    	 case 2 :
//    		 System.out.println("보를 내셔야 이깁니다.");
//    		 break;
//    	 case 3 :
//    		 System.out.println("가위를 내셔야 이깁니다.");
//    		 break;
////     }
//	 
//	//문제 4
//	 System.out.println(" 몇 단? ");
//     int m=sc.nextInt(); 	 
//     System.out.println("몇까지 곱할까요?");
//	 int n=sc.nextInt();	
//
//		 for(int i=m; i<=m; i++) {
//			 for(int j=1; j<=n; j++) {
//				 System.out.println(i+"x"+j+"="+(i*j));
//			 }
//		 }
//		 
//		 
	//문제 5 
	    System.out.println("몇단까지할까요?"); 
	    
	    int n = sc.nextInt();
	     
		 for(int i=1; i<=n; i++) {
			 for(int j=1; j<=n; j++) {
				 if(i==9 ||j==9 || i*j==9) {
					 System.out.print(j+"x"+i+"="+(i*j)+"\t");
				 }	 
				  else if(i!=9 || j!=9 || i*j!=9) {
					 System.out.print(j+"x"+i+"="+('9')+"\t");
				  } if(j==n) {
					  System.out.print(j+"x"+i+"="+(i*j)+"\n");
				  }

			 } 
		
		  
	 
 }
 }}

