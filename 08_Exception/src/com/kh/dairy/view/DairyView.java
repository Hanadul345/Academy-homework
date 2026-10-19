package com.kh.dairy.view;

import java.util.Scanner;

import com.kh.dairy.controller.DiaryController;

// View 입력은 어쩔 수 없이 지금 단계에서 하는...
public class DairyView {
	private Scanner sc = new Scanner(System.in);
	private DiaryController dc = new DiaryController();
	
	public void mainMenu() {
		System.out.println("❤️ 다이어리 꾸미기에 오신 것을 환영합니다 ❤️");
		while(ture) {
			System.out.println("메뉴를 선택해주세요 (❁´◡`❁)");
			System.out.println("1. 📗 다이어리 꾸미기 📗");
			System.out.println(" > ");
			int menuNo = 0;
			try {
				menuNo = sc.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("아냐 아냐... 숫자를 입력해야지~");
				continue;
			} finally
				sc.nextLine();
			
		}
		
	}
	
	
	

}
