package com.kh.chap02.run;

import com.kh.chap02.model.Fried.Fried;
import com.kh.chap02.model.factory.CookFactory;
import com.kh.chap02.model.info.JjamBbong;

public class Run {
	public static void main(String[] args) {
		/*Main m = new Main("조규철");
		m.cooking();
		Salad s = new Salad("이승철");
		s.cooking();
		
		Cook[] c = {m, s, new Event("이벤트왕")}; // 다형성 작용 // 내가 배열을 잘 모르고 있구나.
		c[0].cooking();
		c[1].cooking();
		c[2].breakTime();
		
		for(int i = 0; i < c.length; i++) {
			c[i].cooking(); // 여기서 0,1 인덱스는 일하고 2인덱스는 쉬게 하고 싶다면?
			// 교대근무를 시키고 싶은거임. 10명이라고 했을때 5명씩 돌아가면서 근무하기.
		}
		 
		*/
		
		/*for (int i = 0; i < c.length; i++) {
		    // 3명이므로 '현재 턴을 3으로 나눈 나머지'와 인덱스가 같은 사람이 이번에 쉬기.
		    if (i == (currentTurn % c.length)) {
		        c[i].breakTime(); // 이번 턴의 휴무자
		    } else {
		        c[i].cooking();   // 나머지 인원은 근무
		    } */
		
		JjamBbong jb = new JjamBbong(); // 짬뽕클래스에 100% 의존
		jb.makeJjamBbong();
	
		//Fried f = new FriedRice();
		//f.fried();
		//f = new FriedPork();
		//f.fried();
		
		CookFactory cf = new CookFactory();
		Fried f = cf.create();
		f.fried();
		// 부모타입으로 자료형을 상속받은 객체들을 다룰 수 있는 기술
		// 이를 위해, abstract를 쓴다
		// 정보 은닉을 통한 유연성 확보
		// 1. 유지 보수가 쉬워진다.
		// => 코드의 수정, 기능 추가, 기능 교체가 쉬워짐
	}	
	
}
