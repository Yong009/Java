package com.yedam.javatest;

public class arraytest {
	public static void main(String[] args) {
		
	
	String[]arr = {"010102-4","991012-1","960304-1","881012-2","040403-3"};
	
	
	int man = 0;
	int woman = 0;
	
	for(int i=0; i<arr.length; i++) {
		if(arr[i].charAt(7)=='1'|| arr[i].charAt(7)=='3') {
			man++;
			
		} else if(arr[i].charAt(7)=='2'|| arr[i].charAt(7)=='4')
			woman++;
	 
	
	}  System.out.println("남 "+man+" "+"여 "+woman);
		
	
	
	
//		} 
}
}	

//			else if(arr[i].charAt(7)==2 || arr[i].charAt(7)==4) {
////		 woman+= 1;
////		}
////}
////}