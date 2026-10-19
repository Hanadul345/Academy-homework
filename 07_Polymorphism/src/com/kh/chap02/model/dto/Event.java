package com.kh.chap02.model.dto;

public class Event extends Cook {
	public Event(String name) {
		super(name);
	}

	public void cooking() {
		System.out.println("이벤트 경품 추천을 하시려면 이쪽으로 오세요.");
	}
	
}
