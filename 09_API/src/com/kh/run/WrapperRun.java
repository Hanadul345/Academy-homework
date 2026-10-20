package com.kh.run;

public class WrapperRun {
	// wrap 포장하다. 감싸다
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Wrapper Class : 기볹자료형을 참조자료형으로 포장해주는 클래스
		
		/* [기본자료형]		<------>		[Wrapper Class]
		 * boolean							Boolean
		 * char								Character
		 * byte								Byte
		 * short							Short
		 * int								Integer
		 * long								Long
		 * float							Float
		 * double							Double
		 * 
		 * 기본자료형을 객체로 취급해야하는 경우. // 통장 잔고 표기할 때
		 * 다형성을 적용시키고 싶은 경우
		 * 매개변수 자료형이 기본자료형은 못 받는 경우
		 * => 뭔소리고?
		 * 
		 * Integer i1 = 15;
		 * Double d1 = 2.2;
		 * 
		 * 이런식으로 사용
		 */
		String str1 = "11";
		String str2 = "1.1";
		//System.out.println(i1+str1);
		
		int num = Integer.parseInt(str1);
		System.out.println(num);
		double d = Double.parseDouble(str2);
		//String str = d + "";
		String str = String.valueOf(d);
		
		
		// 파싱(parsing) : 특정 데이터를 규칙에 따라 분석하는 과정.
	}

}
