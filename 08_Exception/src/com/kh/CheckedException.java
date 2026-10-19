package com.kh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {
	public void readString() {
		System.out.println("나는 Checked the Exception!");
		// 사용자에게 문자열을 받아서 입력받은 문자열의 길이를 출력
		// Break, Continue, return 할 때 length 문법 배웠음.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	/*
	 * CheckedException
	 * 예외 처리를 반드시 해야한다는 사실을 체크해주는 예외사항들
	 */
	try {
		String str = br.readLine();
		System.out.println(str.length());
	} catch(IOException e) { // 주로 외부매체 입/출력 시
	}
}
	public void bang() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
	}
}
