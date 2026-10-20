package com.kh.diary.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.diary.controller.DiaryController;
import com.kh.diary.dto.Diary;

// View 입력은 어쩔 수 없이 지금 단계에서 하는...
public class DiaryView {
	private Scanner sc = new Scanner(System.in);
	private DiaryController dc = new DiaryController();

	public void mainMenu() {
		System.out.println("❤️ 다이어리 꾸미기에 오신 것을 환영합니다 ❤️");
		while (true) {
			System.out.println("메뉴를 선택해주세요 (❁´◡`❁)");
			System.out.println("1. 📗 다이어리 꾸미기 📗");
			System.out.println("2. 📗 다이어리 작성하기 📗");
			System.out.println("내용을 입력하세요! > ");
			int menuNo = 0;
			try {
				menuNo = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("아냐 아냐... 숫자를 입력해야지~");
				continue;
			} finally {
				sc.nextLine();
			}

			switch (menuNo) {
			case 1:
				decoDiary();
				break;
			case 2:
				writeDiary();
				break;
			default:
				System.out.println("없는 메뉴입니다.");
			}

		}

	}

	private void decoDiary() {
		System.out.println("상단 로고를 입력하세요! > ");
		String logo = sc.nextLine();
		sc.nextLine();
		System.out.println("상단 타이틀을 입력하세요! > ");
		String title = sc.nextLine();
		System.out.println("하단 서명을 입력하세요! > ");
		String signature = sc.nextLine();
		dc.decoDiary(logo, title, signature);

		System.out.println("다이어리 꾸미기 성공!");
	}

	// 다이어리를 작성할 수 있는 화면을 보여주는 기능
	private void writeDiary() {

		System.out.println("내용을 작성해주세요 > ");
		String content = sc.nextLine();
		// 작성하다가 터지는 기능이 추가 됨 10%확률
		try { 
		dc.boom();
		} catch(DiaryBoomException e) {
			System.out.println("다이어리가 폭발했습니다! 다시 꾸며주세요. ㅠ_ㅜ")
			return;
		}
		
		System.out.println("\n\n\n\n\n\n\n\n\n");
		Diary diary = dc.writeDiary();
		if(diary == null) {
			System.out.println("1번. 다이어리 꾸미기를 먼저 진행해주세요.");
		}
		System.out.print(diary.getLogo());
		
		System.out.println("==============본문=============");
		System.out.println(content);
		System.out.println("서명 | \t\t" + diary.getSignature());
	}
	// 이 친구의 할 일은 일단 끝
	// 값들을 저장
	
	

}
