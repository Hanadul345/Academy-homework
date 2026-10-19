package com.kh.chap08.view;

import java.util.Scanner;

import com.kh.chap08.controller.FruitController;
import com.kh.chap08.model.dto.Fruit;

public class FruitView {
	// 카운터 직원(화면의 입출력을 담당) 프로그램 시작 시 메인 메뉴를 출력해주는 메소드
	// 모든 코딩은 저장과 출력으로 이야기할 수 있다. 그게 코딩의 전부이다.
	// 필드값? 클래스의 정보 저장을 위해서
	// 생성자부? 클래스 정보에 대한 수치값(요리에 필요한 재료의 신선도, 규격 등)을 저장

	// [필드부]
	private Scanner sc = new Scanner(System.in);
	private FruitController fc = new FruitController();

	// [메소드1]
	public void mainMenu() {
		while (true) {
			System.out.println("과수원 관리 프로그램입니다.");
			System.out.println("1.과일심기");
			System.out.println("2.과일정보확인하기");
			System.out.println("3.비료주기");
			System.out.println("4.과일수확하기");
			System.out.println("5.프로그램 종료하기");

			System.out.println("원하시는 메뉴를 선택해주세요 > ");
			int no = sc.nextInt();
			sc.nextLine(); // <- 이게 왜 필요한거지? 검색할 필요성 있음.

			switch (no) {
			case 1:
				saveFruit();
				break;
			case 2:
				findFruit();
				break;
			case 3:
				fertilize();
				break;
			// case 4 : havest();break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("없는 메뉴를 선택했습니다.");
				System.out.println(" ");

			}
		}
	}

// ★★★★★ 과일을 심을 수 있는 화면을 출력해주는 기능에 대한 메소드를 구현할 예정.
	// [메소드2] 과일의 정보를 저장해주는 액션
	private void saveFruit() { // 과일 정보를 sc를 통해 저장하는 메소드.
		// 과일의 존재 유무를 조건절로 먼저 호출
		// 과일이 존재하는가?
		if (fc.findFruit() != null) {
			System.out.println("과일이 존재합니다!!");
			System.out.println("먼저 과일을 재배해주세요.");
		}
		System.out.print("과일명을 입력하시오. > ");
		String name = sc.nextLine();
		System.out.print("품종을 입력하시오. > ");
		String species = sc.nextLine();

		fc.saveFruit(name, species);
	}

	// [메소드3] 심은 사과의 정보를 보고 싶음. 출력을 위한 기능
	private void findFruit() { //
		Fruit fruit = fc.findFruit(); // view에서 주소값을 가지고 와야함.
		if (fruit != null) {
			String info = fruit.info(); // Fruit에서 info 값을 String 자료형으로 저장
			System.out.println(info);
		} else {
			System.out.println("아직 심은 과일이 없어요~");
			System.out.println("과일을 먼저 심어보세요!");
		}
	}

	private void fertilize() {
		// 비료를 주면 당도가 올라간다.
		// 기능 호출 시, 당도 ++ 해야겠다.
		if (fc.findFruit() != null) {
			// 과일이 있다.
			System.out.print("비료로 인해 당도가 +1 증가했어요");
			// 필드 값을 제어하고 싶을
			fc.fertilize();
		} else {
			System.out.println("아직 심은 과일이 없어요~");
			System.out.println("과일을 먼저 심어보세요!");
			return;
		}
	}

	private void havest() {
		// 수확하기 위해선 조건이 식물이 심어져있어야 되고
		// 당도가 충분히 익어있어야지
		// 이러한 과정을 설계라고 한다. 어떻게 만들지? 에 중점
		// 기획은 뭘 만들지?
		if(fc.findFruit() != null) {
			System.out.println("정말 수확하고 싶으신가요?");
			findFruit();
			System.out.println("수확을 원하신다면 수확하기를 입력 > ");
			String answer = sc.nextLine();
			
			if(answer.equals("수확하기")) {
				fc.harvest();
			} else {
				System.out.println("메인메뉴로 돌아갑니다.");
			}
			
			} else {
				System.out.println("아직 과일이 존재하지 않습니다.");
				System.out.println("먼저, 과일을 심어주세요.");
			}
		}
