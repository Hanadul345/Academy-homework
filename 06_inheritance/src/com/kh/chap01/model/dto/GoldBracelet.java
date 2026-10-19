package com.kh.chap01.model.dto;

public class GoldBracelet {
	//필드부
	private String name;
	private double weight;
	private String purity;
	private double diameter;

	//생성자부
	public GoldBracelet() {
	}
	public GoldBracelet(String name, double weight, String purity, double diameter) {
		this.name = name;
		this.weight = weight;
		this.purity = purity;
		this.diameter = diameter;
	}
	// 메소드부
	// Setter && Getter 생성 (Alt + Shift + S > r)
	
	public void setName(String name) {
		this.name = name;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void GoldBracelet(String purity) {
		this.purity = purity;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
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
	public double getDiameter() {
		return diameter;
	}
	
	
	
	
}

