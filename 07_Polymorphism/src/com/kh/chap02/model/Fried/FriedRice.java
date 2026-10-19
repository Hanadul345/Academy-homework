package com.kh.chap02.model.Fried;

public class FriedRice extends Fried {
	private void rice() {
		System.out.println("볶음밥 나왔드아");
	}
	@Override
	public void fried() {
		rice();
	}

}
