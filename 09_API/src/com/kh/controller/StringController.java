package com.kh.controller;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.kh.run.MathRun;

public class StringController {
		// 4byte
		// String 클래스형 은 불변하다.
		
	
	public void method1() {
		String str1 = new String("hello");
		String str2 = new String("hello");
		MathRun run = new MathRun();
		System.out.println("======================");
		System.out.println(run);
		System.out.println(str1);
		System.out.println(str2.toString());
		/* 1. String 클래스의 toString() 활용 시
		 * 실제 담겨있는 문자열 값을 반환하도록 오버라이딩 된다.		 * 
		 */
		System.out.println("======================");
		MathRun run2 = new MathRun();
		System.out.println(run.equals(run2));
		System.out.println(str1.equals(str2));
		// 2. String 클래스의 equals() 사용 시
		// 실제 담겨 있는 문자열 값을 비교하게끔 오버 라이딩
		// hashCode()
		System.out.println("======================");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println("hello".hashCode());
		// 3. 주소값을 해싱 하는 것이 아닌, 실제 담긴 문자열 값을 기반으로
		// 해싱코드가 실행되도록 오버라이딩
		System.out.println(str1 == str2);		
		System.out.println("======================");
	}
	public void method2() {
		String str1 = new String("hello");
		String str2 = new String("hello");
		// toString
		System.out.println(str1);
		System.out.println(str2);
		// equals()
		System.out.println(str1.equals(str2));
		// hashcode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1 == str2);
	}
	
	public void method3() {
		String str1 = new String("hello"); // 절대 금지 문법. heap 영역에 새로운 공간을 할당하기 때문.
		String str2 = "hello";
		// 문자열 리터럴은 대입 연산자를 활용해 대입할 때
		// String Pool(heap) 영역에 등록되며, 동일한 문자열이 존재할 수 있음.
		// 동일한 문자열을 참조값으로 설정할 경우, 참조변수명이 달라져도 동일한 포인트(주소)를 가르킴
		String str3 = str2;
		System.out.println(str2);
		str2 += "~";
		// 이 행은 기존에 있던 hello 를 삭제하면서, 문자열에 ~가 붙어 새롭게 만들어짐.
		System.out.println(str2);
		
		String a = "a";
		String b = "a";
		
		System.out.println("결과: " + a == b); // + (a==b)); 로 표현해야 true값 이 나옴.
	}
	// 문자열을 더하고 싶은데, 더하지 말라고?? 어떻게 하라는거야 ㅡㅡ ;;?
	public void method4() {
		String str = "Hello" + " World";
		// 이 짓을 하지 말라!!! 더하면 Heap 영역을 계속 까먹으니.
		StringBuffer sb = new StringBuffer();
		// 앞으로는 이걸 활용해서 문자열을 더할 것.
		// Buffer 라고 함은 '임시 공간' 을 떠올리면 된다.
		// 문자열임시저장공간. 문자열은 불변 객체기 때문에, 내용물 변경이 일어나면
		// 새로운 공간을 새로 할당받아 메모리에 올림.
		// 이를 해결하기 위한 방법으로 Buffer를 준비해서 임시공간에 쌓아 한번에 처리하는 클래스
		sb.append("Hello");
		sb.append(" World");
		System.out.println(sb);
		// Buffer 는 더 좋은 옵션이 있기 때문에 좀 더 느리다. 이론상.
		System.out.println("======================");
		StringBuilder builder = new StringBuilder();
		builder.append("Hello");
		builder.append(" World");
		System.out.println(builder); // 나중에 나옴.
		// 동시제어(Thread-safe)가 적용되어 있지 않음.
		// 직접 동시제어를 설계(구현)할 것이라면 Builder를 쓴다.
	}
	
	// 취미 : 빵만들기다. 책읽기				.
	// View : 베이커리. 독후감 남기기 프로그램  .
	
	public void method5() {
		String str1 = "이 또한 지나가리라!";
		// 1. 문자열.lenght() : int
		System.out.println("str1의 길이 : " + str1.length());
		System.out.println("======================");		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요. >");
		//String userID  = new Scanner;
		System.out.println("======================");
		// 3. 문자열.subString(int index) : String
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(5,7));
		System.out.println("======================");
		// 4. 문자열.indexOf(String) : int
		System.out.println(str1.indexOf("지나가"));
		
		String[] emails = {"hong@naver.com", "kimWkhoh"};
		
		String fileName = "flower.jpg";
		System.out.println(fileName.substring(fileName.indexOf(".")));
		
		String name = "sdf.sd.sd.sd.sd.sd..asdfasdf.png";
		System.out.println(name.substring(name.lastIndexOf(".")+1));
		// 특정 패턴을 가지고 찾을 땐, IndexOf를 사용하지 X
		System.out.println("======================");
		char[] chArr = str1.toCharArray();
		System.out.println(Arrays.toString(chArr));
		for(char c : chArr) {
			System.out.print(c);
		}
		
		// char[] ->
		System.out.println(String.valueOf(chArr));
		
		String replaceStr = "엄마손식당";
		System.out.println(replaceStr.replace("엄마", "아빠"));
		
		System.out.println("abcd".toUpperCase());
		System.out.println("ABCD".toUpperCase());
		// 분리하기
		String device = "냉장고,세탁기,식기세척기,청소기";
		String[] devices = device.split(",");
		for(String d : devices) {
			System.out.println(d);
		
		System.out.println("======================");
		StringTokenizer stn = new StringTokenizer(device, ",");
			System.out.println(stn.nextToken());
			System.out.println(stn.nextToken());
			System.out.println(stn.nextToken());
			System.out.println(stn.nextToken());
		System.out.println("======================");
		
		while(stn.hasMoreTokens()) { // 토큰이 남아있으면 true, 없으면 false
			System.out.println(stn.nextToken());
		}
		}	
	}
}
