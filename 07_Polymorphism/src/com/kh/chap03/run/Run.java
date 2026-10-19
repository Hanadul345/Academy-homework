package com.kh.chap03.run;

import java.util.Scanner;

import com.kh.chap03.service.BlackBeanSauceNoodles;
import com.kh.chap03.service.HongChineseRestaurant;
import com.kh.chap03.service.PalGongChineseRestaurant;


/*
 * Interface 란?
 * 추상클래스의 레벨 UP! 버전
 * 인터페이스는 표현할 때, [구현(implements)] 한다고 이야기한다.
 * 
 * [특징] like 규격화, 계약서. A, B, C 에 대한 프로세스를 반드시 진행
 * 필드를 작성하면 상수필드
 * 메소드를 작성하면 추상메소드
 * -> 무조건 구현하는 기능 이 있을 경우 쓰임
 * ->   
 * 클래스는 단 하나의 상속을 받을 수 있음
 * [사용법]
 * 인터페이스에 있는 메소드를 온전하게 사용하고 싶을 경우
 * default 키워드를 붙여 구현한다.
 */

public class Run {
	
	
	public static void main(String[] args) {
		
		//blackBeanSauceNoodels 시키기 프로그램
		System.out.println("짜장 전문 [짜짜장]에 오신것을 환영합니다.");
		System.out.println("주문하실 중국집을 선택하시기 바랍니다.");
		System.out.println("1. 홍반점" + " | " + "2. 팔공반점");
		System.out.println("메뉴를 선택해주세요 > ");
		Scanner sc = new Scanner(System.in);
		int menuNo = sc.nextInt();
		BlackBeanSauceNoodles bbsn = null;
		
		switch(menuNo) {
		case 1 : bbsn = new HongChineseRestaurant(); break;
		case 2 : bbsn = new PalGongChineseRestaurant(); break;
		}
	}
}
