package com.yedam.variable;

public class LiteralExample {
    public static void main(String[] args) {
		
    	//int 사용
    	int var1 = 0b1011; //2진수(0b로 시작)
    	int var2 = 0206; // 8진수(0으로 시작)
    	int var3 = 365; // 10진수
    	int var4 = 0xB3; //16진수(0x으로 시작)
    	
    	System.out.println(var1);
    	System.out.println(var2);
    	System.out.println(var3);
    	System.out.println(var4);
    	
    	
    	//byte - 128~127
    	byte bVal = -128;
    	byte bVa12 = 0;
    	byte bVa13 = 127;
    	int bVa14 = 500; // 데이터 타입 변경 
    	
    	//long
    	
    	long lVal = 10;
    	//int가 가지는 범위를 넘어서 long에 넘게되면, long 타입이라고 표현.
    	long lva12 = 1000000000000L; 
    	
    	
    	//char(유니코드)
    	//문자 다룰 때 쓰는 기본타입.
    	
    	char cVar = 'A'; //65
    	char cVar2 = '가';
    	char cVar3 = 67;
    	char cVar4 = 0x0041;
    	
    	System.out.println(cVar);
    	System.out.println(cVar2);
    	System.out.println(cVar3);
    	System.out.println(cVar4);
    			
    	//문자열
       //char cVa15 ='홍';
       String str = "홍길동";	
       String str2 = "프로그래머";
       
       System.out.println(str);
       System.out.println(str2);
       
       //이스케이프 문자
       //탭만큼 띄움 (\t)
       System.out.println("번호\t이름\t직업");
       
       //엔터(\n)
       System.out.println("행 단위 출력\n");
       
       //특수문자 존재 여부 확인(\",\')
       System.out.println("우리는 \"개발자\'입니다.");
       
       //특수문자 존재 여부 확인(\\)
       System.out.println("봄\\여름\\가을\\겨울");
      
       
       //실수 타입
       //float
       float fVa1 = 3.14f;
       //double
       double dVa1 = 3.14;
       
       //e 사용하기
       double dVa12 = 3e6; //3*10의 6승
       float fVa12 = 3e6f; //3*10의 6승
       double dVa13 = 2e-3; // 2*10의 -3승 => 2/1000
       
       System.out.println(dVa12);
       System.out.println(fVa12);
       System.out.println(dVa13);
       
       
       //논리 타입 
       boolean stop = true;
       
       if(stop) {
    	   System.out.println("중지합니다.");
    	   
       }else {
           System.out.println("시작합니다.");
       
      
	}
    }
    }