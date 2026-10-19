package com.kh.chap03.service;

public class HongChineseRestaurant extends BlackBeanSauceNoodles implements DeliverySevice { //구체 클래스, 실체 클래스

	@Override
	public void makeNoodles() {
		System.out.println("니치팔러마");
	}
	
	@Override
	public void delivery() {
		System.out.println("홍반점은 오토바이로 슝!");
	}
}
