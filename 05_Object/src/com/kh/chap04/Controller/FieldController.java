package com.kh.chap04.Controller;

/*
 * 필드 == 멤버변수 == 속성
 * 객체지향 프로그램이란? 데이터의 묶음
 * 클래스를 구성하는 요소 중 하나로 (데이터 값을 대입하여 오브젝트를 정의내릴 수 있다.)
 * 데이터를 저장하기 위한 역할(변수)
 * 
 * [인스턴스 변수]
 * class 아래 적는 변수 값. new 키워드를 사용해서 해당 객체를 생성하는 순간 heap에 할당.
 * 
 * [클래스 변수] == Static Field ≒ 전역변수와 비슷한 느낌
 * static 이란 예약어가 붙어 있는 필드값
 * 
 * [지역 변수]
 * 특정 영역 { } (block Scope) 내부에서 선언되는 시점에 메모리 영역에 할당.
 */

public class FieldController {
	public int global;
	public static String str = "나는 스태틱"; // Italic 폰트로 변하게 됨, 프로그램 구동 중에 계속 사용해야 하는 경우 사용.
	// 일반 지역변수, Field는 목숨이 정해져있다.
	public static final String JAVA_VERSION = "21"; // final 을 사용할 시 굵어짐, 
	
	
	public void checkVariable(int parameter) { // parameter. 매개변수 초기화.
		int local = 1;
		//int[] arr = new int[2];
		//System.out.println(arr.length);
				System.out.println(global);
		System.out.println(local);
		System.out.println(parameter);		// 여기서 왜 0, 0, 1, 10이 같이 나온거지??
		
		
	}
}
