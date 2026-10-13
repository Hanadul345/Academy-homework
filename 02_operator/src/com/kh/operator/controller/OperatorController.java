package com.kh.operator.controller;

import java.util.Scanner;

public class OperatorController {

	public void arithmetic() {
		// 산술연산자 -> 이항연산자
		// +, -, *, / => 우선순위가 수학이랑 같음
		// % : 모듈러(modular) => 나눗셈에서의 나머지를 취하고 싶을 때.
		int firstNum = 10;
		int secondNum = 3;
		System.out.println("first : " + firstNum);
		System.out.println("second : " + secondNum);
		// *실습->com.khrun 패키지를 만든 후 Run클래스 및 main메소드를 선언한 뒤
		// main메소드에서 arithmetic메소드를 호출하여 콘솔에 위 두줄을 출력하기 시작!

		System.out.println("first+ second : " + (firstNum + secondNum));
		int sum = firstNum + secondNum;
		
		System.out.print("first + second : ");
		System.out.printf("first + Second : %d", firstNum + secondNum);
		System.out.printf("%d + %d : %d", firstNum, secondNum, firstNum + secondNum);
		
			
		System.out.println("first - second : " + (firstNum - secondNum));
		System.out.println("first / second : " + (firstNum / secondNum));
		System.out.println("first X second : " + (firstNum * secondNum));
		System.out.println("first mod second : " + (firstNum % secondNum));
	}
	public void presentToStudent() {
		// 27명의 학생
		
		Scanner sc = new Scanner(System.in);
		// 몇 명에게 비타민을 나눠줄 것인가?
		System.out.println("학생 수를 입력하세요 >");
		int studentCount = sc.nextInt();
		System.out.println("나눠줄 비타민의 개수 입력 : ");
		int vitamin = sc.nextInt();
		
		System.out.println("입력받은 학생 수 : " + studentCount);
		System.out.println("입력 받은 비타민 수 : " + vitamin);
		System.out.println("한 사람 당 받을 수 있는 비타민의 개수 : " + (vitamin / studentCount));
		System.out.println("남는 비타민의 개수 :" + (vitamin % studentCount));
	}

	
	// 고려은단 개수 구하기 프로그램 구현하기 실습
	// 메소드명 : presentToStudent()
	// 1. 출력문을 이용하여 사용자에게 값을 입력받으시오
	// scanner sc = new Scanner(System.in);
	// System.out.print("학생수를 입력하시오 : ");
	// int student = sc.nextInt();
	// 1_1. 고려은단 비타민씨를 받을 학생의 수
	// 1_2. 나눠줄 수 있는 비타민의 개수
	
	// 2. 방금 배운 산술연살자를 이용하여 결과값을 출력하시오.
	// 2_1. 1인당 받을 수 있는 비타민의 개수
	// 2_2. 남은 비타민의 개수
	
	// 실습 시작
	
	public void increse() {
		/*
		 * 증가연산자 : 단항연산자로 한 번에 1증가하거나 / 1감소하는 연산을 함
		 * [표현법] : ++ 값을 1증가시킴 / -- 값을 1감소시킴
		 * 증감을 먼저 할 것인지, 후에 할 것인지에 따라 연산자 위치가 달라짐
		 * 연산자가 앞이냐 뒤냐에 따라 전위연산 / 후위연산 이라 표현함.
		 * 후위연산은 앞에 있는 연산자를 먼저 계산 후에 값이 나옴. 
		 * 후위연산을 더 선호함.
		 * 전위연산은 
		 */
	
	int num = 10;
	System.out.println(num);
	num++;
	System.out.println(num);
	num--;
	System.out.println(num);
	
	
	System.out.println(num++);
	System.out.println(num);
	

	// 1. b라는 식별자를 가진 int형 변수 공간을 할당
	// 2. a라는 변수

}


	public void compound() {
		// = 대입연산자
		
		long veryBigNumberCount = 1000L;
		veryBigNumberCount = veryBigNumberCount + 1658;
		// 복합 대입 연산자
		// 자기자신과 해당 산술연산을 수행한 후 그 결과를 자기자신에게 다시 대입하는 용도
		veryBigNumberCount += 1;
		System.out.println(veryBigNumberCount);
		
		
}
	
	public void logicalNagation() {
		// 논리 부정연산자 : 논리값 (true, false)을 반대로 바꿔주는 연산자
		System.out.println(!true);
	}
	public void comparison() {
		/*
		 * 관계연산자 or 비교연산자
		 * 최소 두개의 값을 비교하는 이항 연산자
		 * 비교연산 -> true, false 의 두가지 닶으로 나옴
		 * 종류
		 * 
		 * 동등비교 = 동등한지 비교하는 것
		 * a == b 'a'라는 공간에 'b'값을 대입하겠다. (연산) -> a와 b가 '일치합니까?'
		 * a != b -> 이 뜻은 a와 b가 일치하지 않습니까?
		 * 
		 * 2. 대소비교 = 크고 작음을 비교
		 * a < b : a가 b보다 작습니까?
		 * a > b : a가 b보다 큽니까?
		 * a <= b : a가 b보다 작거나 같습니까?
		 * a >= b  : a가 b보다 크거나 같습니까?
		 * 
		 * 결과값은 항상 [논리값] 으로 처리가 된다.
		 */
		//System.out.println(1==2);
		
		int firstNum = 10;
		int secondNum = 25;
		System.out.println(firstNum < secondNum);
		System.out.println(firstNum == secondNum);
		System.out.println("firstNumber가 짝수입니까?");
		//ture가 되게끔.
		// 1번 짝수 확인방법 => 2로 나눴을 때 나머지가 '0' 과 같음
		// 숫자%2 == 0
		
		System.out.println(true);
		System.out.println(firstNum % 2 == 0);		
	}
		
	public void logical() {
		/*
		 * Scanner 란 실제 대답을 받아 적을 직원
		 * Scanner sc = new Scanner(System.in); 이란 뜻은 키보드 입력을 받아주는 직원 sc를 하나 고용한다.
		 * 논리연산자 : 두개의 값의 논리값을 연산
		 * 대입연산자 :
		 * 증가연산자 : ++,-- 로 수의 증가를 연산
		 * 산술연산자 : 사칙연산으로 값을 연산
		 * [논리연산자의 표현법]
		 * 논리값 논리연산자 논리값 -> 논리값으로 '값'이 나옴
		 * [종류]
		 * 1. AND 연산 : 좌항, 우항 값이 모두 true 이면 -> True.
		 * 2. OR 연산 : 좌항, 우항 값 '중' 하나라도 True -> True
		 */
		//System.out.println(true || true);
		//System.out.println(true || false);
		//System.out.println(false || true);
		//System.out.println(false || false);
		
		// 사용자에게 한개의 정수값을 입력받음. 입력한 정수 값이 0보다 크면서 짝수인지 판별
		// 입력된 수는 0보다 크면서 짝수인가요?
		// 1.출력할 수 있는 구문을 쓴다.
		// 2.사용자에게 한 개의 정수 값을 입력 받음.
		// 3.입력 값이 0보다 크면서 짝수인지 판별. *그 값은 변수를 통해 저장해야한다. 정수형태의 값을 어딘가에 저장해야 한다. *변수선언 -> 공간확보 -> 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 > ");
		int num = sc.nextInt();
		boolean result = (num > 0 && num % 2 == 0);
		System.out.print("입력값이 0보다 크면서 짝수입니까? + result ");
	
	}
	
	public void andOper() {
			// 사용자에게 정수값을 하나 입력받은 후
			// 입력받은 정수값을 변수에 대입하고
			// 콘솔창에 출력해보세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값을 하나 입력하시오 : ");
		int num = sc.nextInt();
		System.out.println("입력한 정수값 : " + num);
		// 사용자가 입력한 정수가 1~5사이의 값인지 확인해서 출력하기
		// 1. 값, 2. 연산
		// 1. 입력값, 1, 5
		// 2. 대소비교연산으로 1<=사용자가 입력한 값 <=5)
		
		boolean result = num >= 1 && num <= 5;
		System.out.println("입력값이 1부터 5사이의 값인가요 :" + result);
		
		}
	
	public void orOper() {
		// 사용자에게 한 글자를 입력받아
		// 입력받은 글자가 'A' 또는 'a'인지 확인해서 출력하기
	
		// char letter = nextLine *문자열로 받아야 하며, charAt 변수선언을 사용한다. 
		Scanner sc = new Scanner(System.in);
		System.out.println("한 글자를 입력하시오 : ");
		char letter = sc.nextLine().charAt(0); // index : 0부터 시작하는 개념
		System.out.println(letter);
		
		// 1. 값 -> 'a', 'A', 사용자가 입력한 '한글자'
		// 2. 연산 -> 동등비교 연산을 활용 "=="
		boolean result = letter == 'a' || letter == 'A';
		System.out.println("사용자가 입력한 값이 A인가요? :" + result);
		
	}
	
	public void tip() {
		int num = 10;
		boolean result = false && (num>0);
		boolean result2 = num<0 && num == 10;
		
	}
	
	/* 삼향 연산자 : 피 연산자가 3개
	 * -> 3개의 값과 1개의 연산자로 구성됨(조건문의 형식으로 사용됨)
	 * [조건문] 이란? 값에 따라 연산을 처리하는 방식으로,
	 * 결과값이 true일 경우, 첫문장을 따라 처리하도록, but 결과괎이 false 일 경우 다음 문장을 처리하도록 따름.
	 */
	
	public void triple() {
		// 영화루 -> 메뉴판
		
		System.out.println("영화루에 오신것을 환영합니다.");
		System.out.println("-----메뉴를 선택해주세요.-----");
		System.out.println("1.고추간짜장");
		System.out.println("2.고추짬뽕");
		System.out.println("번호를 입력해주세요> ");
		// 계획
		// 1. 사용자가 메뉴를 입력하고
		// 2. 1번을 입력하면 고추간짜장을 주문
		// 3. 2번을 입력하면 고추짬뽕을 주문.
		// 내용이 출력되는 시스템.
		
		Scanner sc = new Scanner(System.in);
		int menuNo = sc.nextInt();
		//System.out.print(menuNo);
		
		//String selected = menuNo == 1? "고추간짜장을 주문하셨습니다." : "고추짬뽕을 주문하셨습니다.";
		String selected = menuNo == 1? "고추간짜장을 주문하셨습니다."
				: menuNo == 2? "고추짬뽕을 주문하셨습니다."
				: "없는 메뉴입니다.";
		System.out.println(selected);
		
		
		
	}
}
	