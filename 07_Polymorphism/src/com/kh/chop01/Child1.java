package com.kh.chop01;

public class Child1 extends Parent {
	// Field //
	private int y;
	
	// Method //
	public void printChild1() {
		System.out.println("아이 메소드 호출!");
	}
	public void print() {
		System.out.println("나는 부모메소드를 덮어쓰겠다. 음하하");
	}
}
