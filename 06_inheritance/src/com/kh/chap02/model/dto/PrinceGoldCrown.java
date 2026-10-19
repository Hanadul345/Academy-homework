package com.kh.chap02.model.dto;

// 상속주는 클래스  // 받는 클래스
// 부모,슈퍼,상위,조상 // 자식,서브,하위,후손
// 확장클래스		// 파생클래스

public class PrinceGoldCrown extends Treasure {
	//Field
	private String source;
	//Constuctor
	public PrinceGoldCrown() {
		super(); // 라는 구문은 나의 슈퍼(부모) 클래스의 기본 생성자를 호출하는 기능이다.
		System.out.println("나는 자식 클래스다.");
		// super(); 하위 클래스 밑에 슈퍼 클래스는 있을 수 없다.
	}
	public PrinceGoldCrown(String source) {
		this.source = source;
	}
	
}
