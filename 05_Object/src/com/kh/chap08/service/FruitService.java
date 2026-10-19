package com.kh.chap08.service;

import com.kh.chap08.model.dto.Fruit;

public class FruitService { // 연산을 위한 클래스
/*	private Fruit fruit;
	private Fruit secondFruit;
	private Fruit thirdFruit;
	*/
	private Fruit[] fruits = new Fruit[10];
		
	public void saveFruit(Fruit f) { // setter 역할.
		/* if(fruit == null) {
			this.fruit = f;
		} else if(secondFruit == null) {
			this.secondFruit = f;
		} else if(thirdFruit == null) { //경우의 수
			this.thirdFruit = f;
		} */
		for(int i=0; i < fruits.length; i++) {
			if(fruits[i] == null) {
				fruits[i] = f;
				return;
	}
		}
	}
	public Fruit findFruit() { // 사과 정보에 대한 주소값이 저장되야함
		// return fruit;
		// 빈과일이 하나라도 존재한다면 null을 반환
		if(fruit == null || secondFruit == null || thirdFruit == null) {
			return null;
		} else if(secondFruit == null) {
			this.secondFruit = f;
		} else if(thirdFruit == null) { // 경우의 수
			this.thirdFruit = f;
		}
			return null;
			
		/*return fruit != null ? fruit : secondFruit != null
							 ? secondFruit : thirdFruit != null
							 ? thirdFruit : null;
		} */ // 위에 문법 ??? 뭔 소리야 이거 
	}
	public Fruit fertilize() {//당도를 올리려고함. 
		// 당도 +1 // 당도 필드로 가지고 있는 과일의 주소 : fruit
		// 주소를 알기 떄문에 당도를 올리면 됨.
		fruit.setBrix(fruit.getBrix() + 1);
		return fruit;
	}
	public Fruit harvest() {
		// 식물뽑기
		fruit = null;
	}
}
