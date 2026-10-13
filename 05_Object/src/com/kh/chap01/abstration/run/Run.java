package com.kh.chap01.abstration.run;

import com.kh.chap01.abstration.model.vo.Dog;

public class Run {

	public static void main(String[] args) {
		// 현실세계의 개 => 자바에서 구현
		// species : 도베르만
		// name : 나폴레옹
		// age : 6
		// gender : M
		// neuter : 안함
		
		// 1번. Dog 클래스 명을 입력해줘야한다.
		// 2번. dog 의 이름을 지어줘야 한다.
		// 3번. 대입 연산자 = 를 써줘야 한다.
		// 4번. Dog(); 를 입력해줘야한다.
		
		Dog dog = new Dog(); // 이 과정을 객체생성이라고 한다.
		// 그리고 이 객체를 가지고 막 이것저것 만지는 것을 "객체지향 프로그램" 이라고 하는 것.
				//dog.walk();
		// 참조형은 기본값이 null
		dog.name = "나폴레옹"; // dog라고 하는 객체의, 이름값 필드로 move, 그리고 "나폴레옹" 값을 입력
		dog.age = 6;

		
		System.out.println(dog.name);
		
		// 종 : 푸들, 이름 : 징기스칸, 나이 6살, 성별 M, 중성화여부 X
		Dog Khan = new Dog();
		Khan.name = "징기스칸";
		Khan.species = "푸들";
		Khan.age = 1;
		Khan.sex = 'M';
	
				
		dog.walk();
		Khan.walk();
		dog.swingTail();
		Khan.swingTail();
		System.out.println(dog.age);
		System.out.println(Khan.age);
	
		// System.out.println(dog.name + "이(가)" +.walk);
	}
	/* 숙제
	 * 나만의 클래스. 사용자 정의를 내린 자료 10개 만들기
	 * 설계한 클래스를 이용해서 main 메소드에서 객체를 클래스마다 x2씩 생성해서 객체 20개 만들기
	 * 객체 필드에 접근해서 값 대입 후 출력하기
	 * 
	 */
		
		
		
		
				
		
		
				
				
				
		
		
	}

