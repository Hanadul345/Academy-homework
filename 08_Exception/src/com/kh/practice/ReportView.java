package com.kh.practice;

import java.util.Scanner;

public class ReportView {
	
	private Scanner sc = new Scanner(System.in);
	private BookReportController bc = new BookReportController();
	
	public void mainMenu() {
		while (true) {
		System.out.println("독서 관리 프로그램, '리드북'에 오신것을 환영해요❤️");
		System.out.println("어떤 메뉴를 선택하시겠어요? 📗");
		System.out.println("1. 읽은 책 저장하기");
		System.out.println("2. 저장한 책 목록 불러오기");
		System.out.println("3. 저장한 목록 편집하기");
		System.out.println("4. 종료하기");
		System.out.println("===========================");
		System.out.print("메뉴를 선택해주세요 (❁´◡`❁) > ");
		int answer = sc.nextInt();
		sc.nextLine();
		
		switch(answer) {
		case 1 : saveTheBook(); break;
		case 2 : loadTheBook(); break;
		//case 3 : editTheBook(); break;
		//case 4 : exit(); break;
		}
		}
	}
		
	private void saveTheBook() {
		System.out.println("읽은 책 저장하기를 선택하셨습니다!");
		
		System.out.println("저장하실 책의 이름이 무엇인가요? 😊");
		String title = sc.nextLine();
		sc.nextLine();
		
		System.out.println("책의 저자는 누구인가요?");
		String writer = sc.nextLine();
		
		System.out.println("언제 읽으신 책인가요?");
		String date = sc.nextLine();
		bc.saveTheBook(title, writer, date);
	}
	private void loadTheBook() {
		System.out.println("읽으신 책 목록을 불러오겠습니다.");
		bc.loadTheBook();
		
	
	}
	
}
