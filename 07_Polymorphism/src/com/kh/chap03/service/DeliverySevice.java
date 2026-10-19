package com.kh.chap03.service;



public interface DeliverySevice { // 추상 클래스

	
	/* public abstract */ void delivery(); // public abstract 가 없어도 구현됌.
	 // 공개 추상메소드만을 가진 추상메소드의 끝판왕.
	
	default void close() {
		System.out.println("닫힙니다.");
		// 인터페이스에 있는 메소드를 온전하게 사용하고 싶을 경우
		// default 키워드를 붙여 구현한다.
	}
}
	
