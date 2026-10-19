package com.kh.chap02.model.dto;


public class Bracelet extends Treasure {
	
	// Field //
	private String diameter;

	// Constutor //

	public Bracelet(String name, double weight, String purity, String diameter) {
		super(name, weight, purity);
		this.diameter = diameter;
	}
	
	// Method //
	public String getDiameter() {
		return diameter;
	}

	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}
	public String info() {
		return super.info() + " | 지름: " + diameter + "]";
	}
	
}
