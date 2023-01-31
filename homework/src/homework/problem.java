package homework;

public class problem {
	public static void main(String[] args) {

		int[]answer = {1,4,4,3,1,4,4,2,1,3,2};
		
		for(int i=0; i<answer.length; i++) {
			String star = "";
			for(int j=0; j<answer[i]; j++) 
					star = star+ "*";
		  System.out.println(star);}
		}

}
