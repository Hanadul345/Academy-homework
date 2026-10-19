package com.kh.chap03.model.dto;

public class LoyalSalute extends Beverage {
	// Field //
	private String alc;
	private String years;
	// Construtor //
	public LoyalSalute() {
		super();
	}
	public LoyalSalute(String name, String volume, String color, String alc, String years) {
		super(name, volume, color);
		this.alc = alc;
		this.years = years;
	}
	// Method //
	public String getAlc() {
		return alc;
	}
	public String getYears() {
		return years;
	}
	public void setAlc(String alc) {
		this.alc = alc;
	}
	public void setYears(String years) {
		this.years = years;
	}
	public String info() {
		return super.info() + " | 도수: " + alc + " | " + years + "년산";
	}
}
