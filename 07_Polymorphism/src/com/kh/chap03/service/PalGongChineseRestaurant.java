package com.kh.chap03.service;

public class PalGongChineseRestaurant extends BlackBeanSauceNoodles implements DeliverySevice {

	@Override
	public void makeNoodles() {
		System.out.println("기계면이지만, 맛은 혁신적인 팔공 ♥");
	}
	@Override
	public void delivery() {
		System.out.println("팔공은 드론으로 슝!");
	}
}
