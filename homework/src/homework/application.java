package homework;

import java.util.Scanner;

public class application {
	public static void main(String[] args) {

		// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		// 출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.

		Scanner sc = new Scanner(System.in);
		int proCount = 0;
		int max=0; int index = 0; int sum =0;
		Keyboard[] kbdAry = null;

		while (true) {
			System.out.println("1.상품 수|2.상품 및 가격입력|3.제품별 가격|4.분석|5.종료");
			System.out.println("입력>");
			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				System.out.println("상품 수 입력>");
				proCount = Integer.parseInt(sc.nextLine());
			} else if (selectNo == 2) {
				kbdAry = new Keyboard[proCount];
				for(int i=0; i<kbdAry.length; i++) {
				kbdAry[i] = new Keyboard();
				System.out.println("상품명>");
				String name = sc.nextLine();
				kbdAry[i].name = name;
				
				System.out.println("가격>");
				int price = Integer.parseInt(sc.nextLine());
				kbdAry[i].price = price;
			}
			} else if(selectNo==3) {
				for(int i=0; i<kbdAry.length; i++) {
					System.out.print(kbdAry[i].name+" : ");
					System.out.println(kbdAry[i].price+"원");
				}
			} else if(selectNo==4) {
				
				for(int i=0; i<kbdAry.length; i++) {
					if(max<kbdAry[i].price) {
						max = kbdAry[i].price;
						index = i;
					
				}} 
					for(int i=0; i<kbdAry.length; i++) {
				  if(kbdAry[index].price != kbdAry[i].price) {
					  
					   sum += kbdAry[i].price;}
				} 
				System.out.println("최고 가격 제품 : "+kbdAry[index].name+"\t"); 
				System.out.println("이 제품을 제외한 가격 총합 : "+sum+"원");
			}
			
			else if(selectNo==5) {
				System.out.println("프로그램 종료");
				return;
			}
		}
             
	}
}
