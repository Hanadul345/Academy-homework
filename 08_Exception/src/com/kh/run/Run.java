package com.kh.run;

import com.kh.CheckedException;
import com.kh.controller.UnCheckedException;

public class Run {
	public static void main(String[] args) {
		/*
		 * Error
		 * 
		 * 시스템 에러 : 컴퓨터의 오작동으로 발생
		 * 				=> (심각) 개발자가 해결할 수 없음.
		 * 
		 * 컴파일 에러 : 프로그램 실행 전 소스코드상에서 문법적인 문제로 발생하는 에러
		 * 
		 * 런타임 에러 : 프로그램 실행 중 발생하는 에러. 문법적으로는 문제가 없음.
		 * 				=> 개발자가 의도한 대로 값을 입력하지 않았을 경우가 많음
		 * 				=> 개발자가 이런 상황을 미리 예측해서 처리해주는 것이 원칙
		 * 
		 * 로지컬 에러 : 소스 코드 상 문제는 없음, 실행했을 때도 문제가 없이 돌아감
		 * 				=> 의도와는 다르게 동작.
		 * 
		 * 예외(Exception) : 
		 * 
		 * ArtithmeticException
		 */
		
		UnCheckedException ue = new UnCheckedException();
		// ue.divZero();
		// ue.input();
		//ue.multiCatch();
		//ue.orderByCatch();
		//ue.bomb();
		CheckedException ce = new CheckedException();
		//ce.readString();
		ce.bang();
}
}
