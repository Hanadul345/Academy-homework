package com.kh.diary.controller;

import com.kh.diary.dto.Diary;
import com.kh.diary.exception.DiaryBoomException;

public class DiaryController {
	private Diary d;
	
	// 외부에서 호출을 해야만 하기 때문에 접근제한자는 public 확정.
	public void decoDiary(String logo, String title, String signature) {
		Diary diary = new Diary(logo, title, signature);
		// Q. 다이어리 기본 생성자 못 쓰는 이유가 무엇?
		// A. 다이어리 기본생성자를 못 쓰는 이유는
		// => 다이어리 dto 클래스에 매개변수 생성자를 구현했기 떄문에
		// 	  JVM이 기본 생성자를 만들어 주지 않습니다. 그래서 기본 생성자로는 호출이 불가하고
		//    꼭 String 타입의 인자로 전달하는 매개변수 생성자를 호출해야 합니다.
		// 트렌드, Ai 활용 필수 // 똘똘해 보이는 인상.
		
		/* 1. 유효값 검증 => 값이 존재하는지, 적절한 값인지... 검증
		 * 2. 중복 검사 등
		 * 얕은 복사
		 */
		// d = diary;
		d = diary;
	}
	
	public Diary writeDiary() {
		return d;
	}
	public void boom() {
		// 90%확률로 문제없음, 10%확률로 대폭발하면 다이어리 꾸미기 한거 다 날아감
		int rand = (int)(Math.random()*100)+1; // 이거 이해 못하고 있음.
		if(rand < 11) {
			d = null;
			throw new DiaryBoomException("다이어리가 Boom!!!! Boom!!");
		}
	}

	
}
