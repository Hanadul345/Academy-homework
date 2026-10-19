package com.kh.chap04.run;

import com.kh.chap04.model.dto.Gimbab;
import com.kh.chap04.model.service.PorkFilter;
import com.kh.chap04.service.ExpensiveFilter;
import com.kh.chap04.service.GimbabFilter;

public class Run {

	public static void main(String[] args) {

		Gimbab[] gim = { new Gimbab("날치알김밥", "날치알", 1000), new Gimbab("제육김치마리", "제육", 1500),
				new Gimbab("햄치즈마리", "햄", 1000), new Gimbab("불닭마리", "닭고기", 2000), new Gimbab("떙초마리", "땡초", 1500),
				new Gimbab("종합마리", "제육, 닭고기, 땡초", 3000) };

		GimbabFilter filter = new ExpensiveFilter();

		for (int i = 0; i < gim.length; i++) {
			if (filter.filter(gim[i])) {
				System.out.println(gim[i].getName());
			}
		}
		// 문법임.ex) for(int i = 0, i < nums.length, i++) { System.out.println(nums[i];}
		// => for(int n : nums) { System.out.println(n);}
		for (Gimbab b : gim) {
			System.out.println(b.getName());
		}

		GimbabFilter pf = new PorkFilter();
		for (Gimbab b : gim) {
			if (pf.filter(b))
				System.out.println("제육이 포함된 김밥: " + b.getName());
		}

		// 클래스를 새로 만들지 않고, 필요한 시점에 인터페이스를 구현할 수 있는 방법

		GimbabFilter cheapFilter = new GimbabFilter() { // 인터페이스 클래스를 생성하면서 스코프 안에 오버라이딩을 함으로서 생성. "익명 클래스" 라고 이야기함
			@Override
			public boolean filter(Gimbab b) {
				return b.getPrice() <= 1500;
			}
		};
		for (Gimbab b : gim) {
			if (cheapFilter.filter(b)) {
				System.out.println("1500원 보다 저렴한 김밥: " + b.getName());
			}
		}

		// 익명클래스를 사용해보자: 김밥 이름에 "치"가 포함된 김밥 찾기 //
		GimbabFilter filter1 = new GimbabFilter() {
			@Override
			public boolean filter(Gimbab g) {
				// TODO Auto-generated method stub
				return g.getName().contains("치");
			}
		};
		for (Gimbab b : gim) {
			if (filter1.filter(b)) {
				System.out.println("이름에 '치'가 포함된 김밥: " + b.getName());
			}
		}

		// 2단계 : 인터페이스, 에노테이션, 접근제한자, 반환형, 메소드명까지 안써도 돼.
		// (매개변수) -> { 실행문 }
		GimbabFilter filter2 = (Gimbab g) -> {
			return g.getName().contains("치");
		};
	}

	// 3단계 : 매개변수의 자료형 제거 : 타입추론이라고 명칭함. 매개 변수가 한개라면 괄호도 생략가능
	GimbabFilter filter3 = g -> {
			return g.getName().contains("알");
			};
			
	// 4단계 : 중괄호 안의 실행문이 한 줄이라면 중괄호 + return 생략 가능
	GimbabFilter filter4 = g -> g.getName().contains("햄");
	//	System.out.println("이름에 '햄'가 포함된 김밥: "+ b.getName());

}