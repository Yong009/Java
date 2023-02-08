package com.yedam.javatest;

public class CardExample {
public static void main(String[] args) {

	Card card = new TossCard("5432-4567-9534-3657", 0, 0, null, "신빛용");
			
			card.showCardInfo();
	
	Card card2 = new DGBCard("5432-4567-9534-3657", 20251203, 253, null, "신빛용");
			
			card2.showCardInfo();
}
}