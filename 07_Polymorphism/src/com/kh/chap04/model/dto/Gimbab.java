package com.kh.chap04.model.dto;

public class Gimbab {
	private String name;
	private String mainMenu;
	private int price;
	public Gimbab() {
		super();
	}
	public Gimbab(String name, String mainMenu, int price) {
		super();
		this.name = name;
		this.mainMenu = mainMenu;
		this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMainMenu(String mainMenu) {
		this.mainMenu = mainMenu;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getMainMenu() {
		return mainMenu;
	}
	public int getPrice() {
		return price;
	}
	
	
	

}
