package com.kh.chap01.abstration.run;

import java.util.Scanner;

import com.kh.chap01.abstration.model.vo.일렌시아;

public class 일렌시아Run {
	
	public static void main(String[] args) {
		
		/*public String name1; // 캐릭터이름 저장해야겠쥐?
		public String tendency1; // 성향
		public int age1; // 나이
		public char sex1; // 성별을 저장
		public int hp1; // 체력 총량
		public int mana1; // 마나 총량
		
		public String name2; // 캐릭터이름 저장해야겠쥐?
		public String tendency2; // 성향
		public int age2; // 나이
		public char sex2; // 성별을 저장
		public int hp2; // 체력 총량
		public int mana2; // 마나 총량
		*/
		
		일렌시아 c = new 일렌시아();
		c.hp1 = 40;
		c.mana1 = 20;
				
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요. > ");
		c.name1 = sc.nextLine();
		
		System.out.println("성향을 고르시오.");
		System.out.println("선 / 악");
		c.tendency1 = sc.nextLine();
		
		System.out.println("나이를 적으시오.");
		System.out.println("숫자로 입력하세요. ex)14, 32, 999...");
		c.age1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("성별을 선택하시오.");
		System.out.println("남 / 여");
		c.sex1 = sc.nextLine().charAt(0);
		
		while(true) {
		System.out.println("당신의 이름은 " + c.name1 + "입니다.");
		System.out.println("성향 " + c.tendency1 + "입니다.");
		System.out.println("나이 " + c.age1 + " 세");
		System.out.println("성별 " + c.sex1);
		
		System.out.println("Hp " + c.hp1);
		System.out.println("Mp" + c.mana1);
		
		System.out.println("메뉴를 선택하시오");
		System.out.println("1. 공격 // 2. 방어");
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		if(menuNo ==1) {
			c.attack();
		} else if(menuNO == 2) {
			c.defence()
		}
		
		switch(menuNo) {
		case 1: c.attack(); break;
		case 2: c.defence(); break;
		}
	
		
	
			
		}
	
		
	}
	
			
	
	
	
}
