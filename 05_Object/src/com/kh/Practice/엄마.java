package com.kh.Practice;

public class 엄마 {
	private int cash;
		private 길동 자녀 = new 길동;
	
	// 매개 변수가 있는 생성자가 있는 상태에선 그냥 생성할 수 없다. 매개변수의 초기값을 설정해야 한다
	public 엄마(int cash) {
		this.cash = cash;
	}
	public int getCash() {
		return cash;
		
	}
	public void 심부름시키기() {
		this.cash = 자녀.심부름하기(cash);
	}
		
}
