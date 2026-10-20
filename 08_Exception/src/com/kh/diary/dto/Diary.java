package com.kh.diary.dto;

public class Diary {
	// 다이어리를 꾸민 뒤, 꾸민 모양으로 출력이 되는 시스템.
	
	// Field //
	private String logo;
	private String title;
	private String signature;
	// Constructor //
	public Diary(String logo, String title, String signature) {
		super();
		this.logo = logo;
		this.title = title;
		this.signature = signature;
	}
	// Method //
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getLogo() {
		return logo;
	}
	public String getTitle() {
		return title;
	}
	public String getSignature() {
		return signature;
	}
	
	
}
