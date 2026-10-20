package com.kh.chap01.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		// 코드를 작성해서 파일을 만들어보기.
		File file1 = new File("사랑해❤️.png");
		// 파일 만들기(method) //
		// file1.createNewFile(); unhandled
		// IOException 은 Checked 처리
		try {
			file1.createNewFile();
		} catch(IOException e) {
			e.printStackTrace();
		}
		// 폴더 만들기(method) //		
		try {
			file1.createNewFile();
			File folder = new File("Nancy❤️Hoe");
			folder.mkdir(); // make directory
			
			// 경로지정 //
			File file2 = new File("Nancy❤️Hoe/We are One.txt");
			file2.createNewFile();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
/*
 * IO 란?
 * Input & Output => 입/출력
 * 기준 : 자신의 소스코드
 * 내 소스코드가 밖으로 가면 출력.
 * => 프로그램 상 데이터를 외부 매체(모니터, 스피커, DB, 프로세스, 콘솔, "파일")로 출력
 * 
 * 내 소스코드로 밖에 있는 무엇인가를 가지고 오면 입력.
 * => 입력장치(마우스, 키보드, 마이크, DB, 프로세스, "파일")로 입력
 * 
 * IO를 진행하고 싶다면 먼저 프로그램하고 외부매체간의 "통로"를 만들어야함.
 * => 이를 "스트림" 이라고 명칭
 * 
 * [스트림의 특징]
 * 단방향이다. 입력은 입력 / 출력은 출력 각각 따로 존재해야 함.
 * 선입 선출(First in First Out = FIFO) => 시간지연 문제가 발생할 수 있음.
 * 
 * [스택의 경우]
 * (Last in First Out = LIFO)
 * 
 * [스트림의 구분]
 * 1. Size
 * Byte 스트림 : 1Byte 짜리 데이터가 이동할 수 있는 스트림(영어,문자,숫자)
 * 				=> 입력 (XXX InputStream) / 출력 (XXX OutputStream)
 * 문자 스트림 : 2Byte짜리 데이터가 이동할 수 있는 스트림(일본어, 한국어, 중국어 등)
 * 				=> 입력 (XXX Reader) / 출력 (XXX Writer)
 * 
 * 2. 외부매체와 직접적인 연결 여부
 * 기반 스트림 : 외부매체와 직접적으로 연결되는 스트림
 * 
 * 보조 스트림 : 기반 스트림의 성능을 향상시키기 위한 용도의 스트림
 * 				=> 단독으로 사용이 불가능
 * 				=> 속도 향상, 자료형에 맞춰 변환, 객체단위 입출력, 바이트 <==> 문자
 * 
 * 
 */

}
