package com.kh.chap08.model.dto;

public class Fruit {
	// 과일이름, 품종, 당도 등 과일에 대한 정보를 저장하는 기능
	private String name; // 과일이름
	private String species; // 품종
	private int brix; //당도
	
	// 생성자부
	public Fruit(String name, String species) {
		this.name = name;
		this.species = species;
		this.brix = (int)(Math.random()*25) + 1; // 왜 int 에 ( ) 를 사용하지?
	// random 의 반환타입이 double(0.0xxxx). 실수*정수는 불가능
	// 이 때, 정수 25를 실수로 치환해서 25.0으로 치환해서 곱하기 시작. random*25.0 = 실수	
	// int * 실수는 불가능하니 int 자료형에 '( )' 을 추가하면, 실수를 정수로 변환시켜줌.
	}
	
	// 메소드부
	public void setName(String name) {
		this.name = name;	
	}
	public String getName() {
		return name;		
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getSpecies() {
		return species;
	}
	public void setBrix(int birx) {
		this.brix = brix;
	}
	public int getBrix() {
		return brix;
	}
	public String info() {
		return "과일의 정보 = [이름: " + name + ", 품종: " + species + ", 당도: " + brix +"]";	
	}
}
