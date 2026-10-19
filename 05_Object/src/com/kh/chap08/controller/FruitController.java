package com.kh.chap08.controller;

import com.kh.chap08.model.dto.Fruit;
import com.kh.chap08.service.FruitService;

public class FruitController {
	// View랑 Service의 중간다리. 매니저 역할 수행.
	
	FruitService fs = new FruitService();
	
	/* public void 사과가져오기(String 사과) {
		System.out.println(사과)
	}*/
	
	public void saveFruit(String name, String species) { // View에서 받은 Fruit 의 정보를 가공하는 메소드
		//System.out.println("view로 부터 전달받은 name: " + name);
		//System.out.println("view로 부터 전달받은 species: " + species);
		Fruit f = new Fruit(name, species); // 이 항목은 편하게 하기 위함인거지?
		System.out.println(f.info()); // 왜 안뜨노? 복습할 것.
		fs.saveFruit(f);
	}
	public Fruit findFruit() {
		// 여기서 public void는 return 값으로 반환할 값이 없기 때문에
		// findFruit 에 대한 값이 fruit 임으로 fs에 작성한 자료형을 적어야
		return fs.findFruit();
	}
	public Fruit fertilize() {
		return fs.fertilize();
	}
	public Fruit harvest() {
		return fs.harvest();
	}
}	
