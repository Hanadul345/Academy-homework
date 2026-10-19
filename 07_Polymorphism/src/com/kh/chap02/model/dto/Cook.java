package com.kh.chap02.model.dto;

public abstract class Cook {
	// Field //
	private String name;
	// Constructor //
	public Cook(String name) {
		super();
		this.name = name;
	}
	// Method //
	// public void cooking() {} //이 메소드는 자식 클래스의 오버라이딩을 위해 선언만 해놓겠음.
	
	public abstract void cooking();
	// 추상화 => 추상클래스 사용법 //
	/* 접근연산자와 (사이에) 반환형 사이에 abstract 입력
	 * => would you like to use this Syntax, you have to remove { }
	 * 
	 * abstract <=> implement
	 * static / dynamic / automatic
	 * virtula == logical / physical
	 * 
	 */
	
	public void breakTime() {
		System.out.println("후... 힘들다.. 에너지 보충");
	}
	
	
}
