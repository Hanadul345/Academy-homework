package com.kh.chap02.model.dto;

public class Treasure { //상속이란 개념을 구현할 예정.
	// 기존에 정의 내린 클래스를 활용해서 새로운 클래스를 만드는 기술
	
	// 공통필드
	private String name;
	private double weight;
	private String purity;
	
	public Treasure() {
		System.out.println("나는 부모클래스다.");
	}
	public Treasure(String name, double weight, String purity) {
		this.name = name;
		this.weight = weight;
		this.purity = purity;
	}
	public String getName() {
		return name;
	}
	public double getWeight() {
		return weight;
	}
	public String getPurity() {
		return purity;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setPurity(String purity) {
		this.purity = purity;
	}
	public String info() {
		return "보물정보 = [보물명: " + name + " | 무게: " + weight + " | 순도: " + purity + "]";
	}
}
