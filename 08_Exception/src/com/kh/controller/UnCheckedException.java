package com.kh.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.EnterFiveException;

public class UnCheckedException {
	public void divZero() {
		/*
		 * System.out.println("천천히"); System.out.println(10/0);
		 * System.out.println("합시당");
		 */

		// 사용자에게 두 개의 정수 값을 입력 받아 나눗셈 한 뒤 결과를 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("나누기 프로그램임다");
		System.out.println("1번 정수를 입력하시오. > ");
		int num1 = sc.nextInt();
		System.out.println("2번 정수를 입력하시오. > ");
		int num2 = sc.nextInt();
		// 예외처리 : 예외 상황을 감지, 상황 발생시 비정상적인 종료를 방지하며 적절한 조취를 취하는 모든 절차

		if (num2 != 0) {
			System.out.print("나눗셈 결과 : " + num1 / num2);
		} else {
			System.out.println("0은 나누기 연산을 수행할 수 없다.");
		}
		/*
		 * 예외처리 구문 사용법 try ~ catch문 try { num / num2 <= 예외가 발생할수도 있는 구문 }
		 * catch(발생할예외클래스명 변수명) { 해당하는 예외 상황이 발생할 경우 실행될 구문을 작성한다.
		 */
		try {
			System.out.println("연산 결과 : " + num1 / num2);
			System.out.println("참 잘했어요");
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("두 번째 정수에 0을 입력할 수 없습니다");
			System.out.println("메소드 호출 끝");
		}
		sc.close(); // 자원반납 => 개발자들끼리 약속
	}

	public void input() {
		// 정수를 입력 받아햐 하는데, 사용자가 실수 또는 문자열을 입력.
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("메뉴를 추가해주세요.");
			System.out.println("1. 추가하기");
			System.out.println("2. 삭제하기");
			System.out.println("3. 종료하기");
			System.out.println("1번 또는 2번을 선택해주세요. > ");
			int menu = 0;
			try {
				menu = sc.nextInt(); // IputMistmatchException 오류. 런타임에러
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요");
			}
			sc.nextLine();
			System.out.println(menu + "번을 선택하셨습니다. > ");

		}
	}
	/*
	 * <<프로그램 실행 시 발생할 수 있는 오류들>> • ArithmeticException : 나누기 연산을 0으로 나누면 발생하는 예외 •
	 * InputMismatchException : 입력 버퍼의 값이 자료형과 일치하지 않을 때 발생하는 예외 •
	 * NullPointerException : 주소값이 있을 것이라 예상하고 객체를 참조 했더니 null 값일 경우 발생하는 예외. (NPE)
	 * • ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스에 접근할 때 발생하는 예외 •
	 * ClassCastException : 허용할 수 없는 형변환을 진행할 경우 발생하는 예외 개발자들이 예측할 수 있음 =>
	 * RuntimeException.
	 */

	public int multiCatch() { // int형 자료형은 반환값을 필요로 한다.
		Scanner sc = new Scanner(System.in);
		// 사용자에게 정수값을 하나 받아서, 100을 사용자가 입력한 정수값으로 나누는 메소드
		System.out.println("정수를 입력해주세요. > ");
		/*
		 * int num = sc.nextInt(); sc.close(); // sc.nextLine(); -> Exception in thread
		 * "main" java.lang.IllegalStateException: Scanner closed return (100 / num);
		 */
		try {
			int num = sc.nextInt();
			System.out.println(100 / num);
			return (100 / num);
		} catch (InputMismatchException e) {
			System.out.println("숫자값을 입력해주세요.");
			return 0;
		} catch (ArithmeticException e) {
			System.out.println("0이 아닌 정수값을 입력하시오.");
			return 0;
		} finally { // return 실행 징전에 무조건 finally Systax 수행
			sc.close();
		}
	}

	public void orderByCatch() {
		// 배열
		// 사용자에게 정수값을 입력받아, 입력받은 만큼의 크기를 가진 배열을 생성 및 할당 받고,
		// 이 배열의 100번째 인덱스에 대입된 기본값을 출력하시오.

		Scanner sc = new Scanner(System.in);
		System.out.println("원하시는 정수값을 100 ~ 999999까지 입력하시오.");
		/*
		 * try { int[] nums = new int[sc.nextInt()]; System.out.println(nums[99]);
		 * nums[99] = 150; System.out.println(nums[99]); } catch
		 * (ArrayIndexOutOfBoundsException e) {
		 * System.out.println("100 이상의 값을 입력해주세요."); } catch (NegativeArraySizeException
		 * e){ System.out.println("음수를 기입하지마세요~"); } catch (InputMismatchException e){
		 * System.out.println("숫자만 입력해주세요!"); } finally { sc.close(); }
		 */

		try {
			int[] nums = new int[sc.nextInt()];
			System.out.println(nums[99]);
		} catch (InputMismatchException e) {
			System.out.println("아무것도 못하겠쥐~");
		} catch (RuntimeException e) {
			System.out.println("이게 뭘까아아앙~?");
		} finally {
			sc.close();
		}
	}

	public void bomb() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력하시오. > ");
		int num = sc.nextInt();
		// never input '5'!!!!!!!!!!!!!
		if (num == 5) {
			throw new EnterFiveException("User input '5' !!!!! Dangerous!!!!");
		}

	}
}
