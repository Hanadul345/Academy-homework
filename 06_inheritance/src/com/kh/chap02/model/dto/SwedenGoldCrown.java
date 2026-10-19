package com.kh.chap02.model.dto;

public class SwedenGoldCrown extends Treasure {
	
	// 필드부
	private int price; // 가격만 추가.

	// 생성자부
	public SwedenGoldCrown() {
		super();
	}
	public SwedenGoldCrown(String name, double weight, String purity, int price) {
		super(name, weight, purity);
		// setName(name); setWeight(weight) 이런 방식도 가능.
		this.price = price;
	}
	// 메소드부
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
