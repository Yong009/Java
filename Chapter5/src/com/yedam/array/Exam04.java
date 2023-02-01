package com.yedam.array;

import java.util.Scanner;

public class Exam04 {
public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in);
    int su = 0;
	boolean home = true;
	int[] point = null; 
	while(home) {
	
	
	
	
	
	
    System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
    System.out.println("선택>");
    
    int Point= sc.nextInt();
    if(Point==1) {
    	System.out.println("학생수>");
    	su =sc.nextInt();
        
        point = new int[su];
        		
        System.out.print(point.length);}
    	
    	else if(Point==2)	{
    		System.out.println("scores>");
        	point[0] = sc.nextInt();
        	
        	System.out.println("scores>");
        	point[1] = sc.nextInt();
        	
        	System.out.println("scores>");
        	point[2] = sc.nextInt();}
            
            else if(Point==3)
            {    	for(int i=0; i<point.length; i++) {
                	
                	System.out.println("scores>"+point[i]);
                	
            	}}
            	
            	else if(Point==4) { 
            		int max = 0;
            		for (int i = 0; i < point.length; i++) {
            			if (point[i] > max) {
            				max = point[i];
            			}
            		}
            		System.out.println("최댓값 : " + max);
            		
            		int Sum = 0;
            		for (int i = 0; i < point.length; i++) {
            			Sum += point[i];
            		}
            		
            		
            		double Avg = 0;
            		for (int i = 0; i < point.length; i++) {
            			Avg = (double)Sum/3;
            		}
            		System.out.println("점수의 평균 : " + Avg);
                   } else if(Point==5) {
                	   System.out.println("프로그램 종료");
                   	home = false;
                   }
            	
//    switch(Point){
//    case 1 :
//        
//    case 2 :
//    	
//    	System.out.println("scores>");
//    	point[0] = sc.nextInt();
//    	
//    	System.out.println("scores>");
//    	point[1] = sc.nextInt();
//    	
//    	System.out.println("scores>");
//    	point[2] = sc.nextInt();
//        break;
//    
//    case 3 :
//    	for(int i=0; i<point.length; i++) {
//        	
//        	System.out.println("scores>"+point[i]);
//        	
//    	}
//    	break;
//    case 4 :
//    	int max = 0;
//		for (int i = 0; i < point.length; i++) {
//			if (point[i] > max) {
//				max = point[i];
//			}
//		}
//		System.out.println("최댓값 : " + max);
//		
//		int Sum = 0;
//		for (int i = 0; i < point.length; i++) {
//			Sum += point[i];
//		}
//		
//		
//		double Avg = 0;
//		for (int i = 0; i < point.length; i++) {
//			Avg = (double)Sum/3;
//		}
//		System.out.println("점수의 평균 : " + Avg);
//       break;
//    case 5 :
//    	System.out.println("프로그램 종료");
//    	home = false;
//    }  
//    
}}
}
