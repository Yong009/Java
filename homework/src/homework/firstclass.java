package homework;

public class firstclass {
        public static void main(String[] args) {
		//문제1
        	int a1 = 37;
			int a2 = 91;
        
		//문제2
			System.out.println(a2+a1);
			System.out.println(a2-a1);
			System.out.println(a2*a1);
  			System.out.println(a2/a1);
 
        //문제3
  		      
  			int var1 = 128;
  		    char var2 ='B';
  		    int var3 = 44032;
  		    long var4 = 100000000000L;
  		    double var5 = 43.93106; 
  		    float var6 = 301.3f;
  		    System.out.printf("128, int'\t'");
	  		System.out.printf("B, char'\t'");
	  		System.out.printf("44032, int'\t'");
	  		System.out.printf("100000000000L, long'\t'");
	  		System.out.printf("43.93106, double'\t'");
	  		System.out.printf("301.3f, float\t\n");
	  		
	  	//문제4
	  	  //4-1
	  		byte a = 35;
			byte b = 25;
			int c = 463;
			long d = 1000L;
  		    
			long result1 = a + c + d;
			System.out.println(result1);
         //4-2
			int result2 = a + b + c;
			System.out.println(result2);
          
		 //4-3
			double e = 45.31;
			double result3 = c + d + e;
			System.out.println(result3);
			
		//문제5
			int intValue1 = 24;
			int intValue2 = 3;
			int intValue3 = 8;
			int intValue4 = 10;
			char charValue = 'A';
			String strValue = "번지";
			float intValue5 = intValue4;
			
			System.out.print(charValue);
			System.out.print(intValue1+intValue2);
			System.out.print(intValue3);
			System.out.print(strValue);
			System.out.println(intValue5);
			
			//추가문제
			
           int value = 485;
           int value2 = value/100;
           int value3 = value/60;
           int value4 = value/90;
           int value5 = value2 + value3 + value4;
           
           System.out.print(value5);
           
           
           
        }
}
