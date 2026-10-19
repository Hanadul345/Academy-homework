package com.kh.chap03.model.dto;

public class Water extends Beverage {
	// Field //
	private String waterSource;
	// Construtor //
	public Water() {
		super();
	}
	public Water(String name, String volume, String color, String waterSource) {
		super(name, volume, color);
		waterSource = waterSource;
	}
	// Method // 
	public String getWaterSource() {
		return waterSource;
	}
	public void setWaterSource(String waterSource) {
		waterSource = waterSource;
	}


}
