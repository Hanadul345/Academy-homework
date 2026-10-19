package com.kh.chop01;

public class Run {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.printParent();
		
		Child1 c1 = new Child1();
		c1.printChild1();
		
		Child2 c2 = new Child2();
		c2.printChild2();
		
		Parent p2 = new Child1(); // 해당 Parent 클래스 자료형을 Heap 영역에 Child로 생성. p2로 정의
		p2.printParent();
		((Child1)p2).printChild1(); // Class형 변환 ( ) 자료형 변환 기능
		
		Child1[] cs = {new Child1(), new Child1(), new Child1()};
		Child2[] css = {new Child2(), new Child2(), new Child2()};
		System.out.println("----------------------");
		
		Parent[] arr = {new Child1(), new Child2(), new Child2(), new Child1(), new Child2()};
		for(int i = 0; i < arr.length; i++) {
			arr[i].print();
			// 동적바인딩(Dynamic Binding)
			// 실질적으로 참조하는 객체가 해당 메소드를 오버라이딩 했다면, 메소드 실행시점에
			// 자식 클래스의 오버라이딩 된 메소드를 호출함.
		}
	}
}
