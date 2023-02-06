package com.yedam.wash;

public class LG implements ButtonA{

	@Override
	public void dry() {
		System.out.println("건조 기능");
		
	}

	@Override
	public void start() {
		System.out.println("빨래 시작");
		
	}

	@Override
	public void stop() {
		System.out.println("빨래 중지");
		
	}

	@Override
	public void finish() {
		System.out.println("빨래 종료");
		
	}

	@Override
	public void change(int run) {
		
			if(run==1) {
				System.out.println("Speed는 20");
				} else if(run==2) {
					System.out.println("Speed는 50");
				} else if(run==3) {
					System.out.println("Speed는 100");
		
	}

	}
}
