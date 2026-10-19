package com.kh.chap03.run;

import com.kh.chap03.model.dto.Beverage;
import com.kh.chap03.model.dto.LoyalSalute;
import com.kh.chap03.model.dto.Water;

public class Run {
	public static void main(String[] args) {
		
		Beverage b = new Beverage("박카스", "355 ml", "Yellow");
		System.out.println(b.info());
		Water w = new Water("삼다수", "500 ml", "transparency", "제주도 한라산");
		System.out.println(w.info());
		LoyalSalute ls = new LoyalSalute("Loyal Salute", "700 ml", "Brown", "40도", "21");
		System.out.println(ls.info());
		System.out.println(b); // object.toString(); 메소드를 호출
		// 해당 메소드의 return 값이 getClass().getName() + "@" + 10진수 to 16진수로 변경한 문자열
	}
}
