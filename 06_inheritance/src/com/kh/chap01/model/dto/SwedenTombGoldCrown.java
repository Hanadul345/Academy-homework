package com.kh.chap01.model.dto;

public class SwedenTombGoldCrown {
	//필드부
	private String name;
	private double weight;
	private String purity;
	private int price;
	
	//생성자부
	public SwedenTombGoldCrown() {
	}
	public SwedenTombGoldCrown(String name, double weight, String purity) {
		this.name = name;
		this.weight = weight;
		this.purity = purity;
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
	public String getName() {
		return name;
	}
	public double getWeight() {
		return weight;
	}
	public String getPurity() {
		return purity;
	}
	public String info() {
		return "보물정보 = [보물명: " + name + "무게: " + weight + "순도: " + purity + "]";
	}

	
	
	
}
