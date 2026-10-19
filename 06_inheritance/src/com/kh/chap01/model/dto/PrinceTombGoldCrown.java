package com.kh.chap01.model.dto;

public class PrinceTombGoldCrown {
	//필드부
	private String name;
	private double weight;
	private String purity;
	private String source;
	
	//생성자부
	//1. 기본 생성자 (Alt + Shift + S > o) 2. 모든 필드를 매개변수로 갖는 생성자
	public PrinceTombGoldCrown() {
	}

	public PrinceTombGoldCrown(String name, double weight, String purity, String source) {
		this.name = name;
		this.weight = weight;
		this.purity = purity;
		this.source = source;
	}
	// 메소드부
	// Setter && Getter 생성 (Alt + Shift + S > r)

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setPurity(String purity) {
		this.purity = purity;
	}

	public void setSource(String source) {
		this.source = source;
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

	public String getSource() {
		return source;
	}
	public String info() {
		return "보물정보 = [보물명: " + name + "무게: " + weight + "순도: " + purity + "출처: " + source + "]";
	}
}

