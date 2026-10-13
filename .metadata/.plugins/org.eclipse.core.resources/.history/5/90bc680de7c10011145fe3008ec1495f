package com.kh.conditon;

import java.util.Scanner;

public class ConditionIf {
	/*(단일)If문
	 * if(조건식) 이란?
	 * 	모든 연산자(논리 연산 *대소비교, 동등비교 등)를 활용해서 사용하는 명령어로 결과값이 true 경우 실행하는 코드.
	 * }
	 * [동작방식]
	 * if(조건식) {
	 * 	조건식의 결과가 ture일 경우 실행하고자 하는 코드;
	 * but, 결과값이 false일 경우 : if 조건절의 Scop({})를 스킵
	 * -> 조건식 결과값이 true일 경우 : if조건절의 Scope({}) 안의 코드가 수행
	 *
	 */
	
	public void method0() {
		System.out.println("실습 : 메소드를 불러보세요~ 시작!");
		
		/*if(true) {
			System.out.println("나는 if문이다");
		}
		 */
		if(true) {
			System.out.println("세상만사 문제없음");
		}
		if(false) {
			System.out.println("세상만사 문제있음");
		}
		
		// 예시
		// 온도를 조절 습도를 조절
		
		Double temperature = 0.0;
		// 30도를 유지
		if(temperature <30.0) {//조건식 자리에는 결론적으로 true / false값이 들어가도록 구현한다!
			System.out.println("물트는 코드 또는 메소드호출");
		}
	}
	
	public void quiz() {
		
		int right = 0; // 정답 갯수
		int wrong = 0; // 오답 갯수
		System.out.println("노잼인데; 잼컨 만들기;");
		// 문제를 출력한 뒤
		// 사용자에게 O 또는 X를 입력받고
		// 정답입니다. 또는 오답입니다를 출력해주는 퀴즈 프로그램 제작
		
		System.out.println("------------------------------");
		System.out.println("문제 : 토마토는 과일이다 O, 채소이다 X");
		Scanner sc = new Scanner(System.in);
		// ox 퀴즈라는걸 알려줘야함.
		System.out.println("O 또는 X를 입력하시오 > ");
		char 답 = sc.nextLine().charAt(0);
		// X 입력 했을 때 정답입니다. O 일땐 오답입니다.
		if(답 == 'X' || 답 =='x') { //(1. 사용자의 [값, X] 2. [연산])
			System.out.println("정답입니다");
			right++;
		}
		if(답=='O' || 답=='o') {
			System.out.println("오답입니다");
			wrong++;
		//경우의 수 -> X,x,O,o 를 제외한
		//알파벳 48개, 히라가나, 한자, 등등등
			
		//if(사용자가 입력한 값이 X,x도 아니고 O,o도 아니면 = 값, 연산값 2개가 필요하다)
		}
		
		if((답 != 'X') && (답 != 'x') && (답 != 'O') && (답!='o')) {
			System.out.println("O 또는 X를 입력하시오.");
		}
		System.out.println("문제 : 기린은 서서 잠을 잔다.");
		System.out.println("정답은 O / X 로 입력해주세요 : ");
		답 = sc.nextLine().charAt(0);
		if(답 =='X' || 답=='x') {
			System.out.println("오답입니다.");
			wrong++;
		}
		if(답 =='O' || 답=='o') {
			System.out.println("정답입니다.");
			right++;
		}
		if(!(답 == 'O' || 답 == 'o' ||답 == 'X' || 답 == 'x')) {
			System.out.println("O 또는 X를 입력하시오.");
		}
		
		if(!(답=='o' || 답=='O' || 답=='X' || 답=='x')); {
			System.out.println("O / X를 입력하시오.");
		}
		System.out.println("문제 : 호주의 수도는 멜버른이다.");
		System.out.println("정답은 O / X 로 입력해주세요 : ");
		답 = sc.nextLine().charAt(0);
		if(답 =='X' || 답=='x') {
			System.out.println("정답입니다.");
			right++;
		}
		
		// 두문제 밖에 없음
		// 문제 풀이가 끝난후
		// 정답개수와 오답개수를 출력해줄 것
		System.out.println("퀴즈 끝~~ 오늘의 결과!");
		System.out.println("정답 : " + right + "개");
		System.out.println("오답 : " + wrong + "개");
		
		// ☆숙제 1. 오늘의 퀴즈쇼에 3개 추가하기
		// 퀴즈 3개 추가하면서 기존의 if문을 if else 문으로 변경하기
		
		
	}	
}	

