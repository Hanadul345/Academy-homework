package com.kh.chap02.model.factory;

import com.kh.chap02.model.Fried.Fried;
import com.kh.chap02.model.Fried.FriedPork;
import com.kh.chap02.model.Fried.FriedRice;

public class CookFactory {
		
	private Fried createRice() {
		return new FriedRice();
	}
	private Fried createPork() {
		return new FriedPork();
	}
	public Fried create() {
		return createRice();
	}
	// 1. 교체와 변경이 용이함
	// 2. 또 다른 타입 Fried타입을 추가하는 것도 쉬워짐
	// 3.CookFactory를 거치면 모두 다 같은

}
