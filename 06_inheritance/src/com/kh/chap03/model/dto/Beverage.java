package com.kh.chap03.model.dto;

public class Beverage { // To use Super Class
	
	// Field //
	private String name;
	private String volume;
	private String color;
		
	// Construtor //
	public Beverage() {
		super();
	}
	public Beverage(String name, String volume, String color) {
		super();
		this.name = name;
		this.volume = volume;
		this.color = color;
	}
	// Method //
	public String getName() {
		return name;
	}
	public String getVolume() {
		return volume;
	}
	public String getColor() {
		return color;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String info() {
		return "음료의 정보 = 제품명: " + name + " | 용량: " + volume + " | 색상: " + color; 
	}
	//public String toString() {
		// return "하이^^;"; / toString이란 변수명의 객체(class)가 어느 위치인지를
	// getClass().getName() 을 통해 호출한 뒤 + "@" + hashcode 를 입력하는 명령문
	
}
