package com.kh.Practice;

public class Player {

	/* 이름
	 * HP
	 * 공격력
	 * 레벨
	 * 스킬
	 */
	private String name;
	private int hp = 40;
	private int damage;
	private int level;
	private String[] skill;
	
	// 생성자부
	public Player() {}
	public Player(String name, int hp, int damage, int level, String[] skill) {
		this.name = name;
		this.hp = hp;
		this.damage = 5 + (level*5);
		this.level = level;
		this.skill = skill;
	}
	
	// 메소드부
	public void 공격하기() {
		this.damage = Player.damage();
		Goblin.hp -= this.damage;
		System.out.println(Goblin.hp);
		return Goblin.hp;
				
	public void 스킬사용() {
		System.out.println(1.배쉬);
		System.out.println(2.방패치기);
		System.out.println(3.양날의검);
		
	}
	
	}
	private static int damage() {
		// TODO Auto-generated method stub
		return 0;
	}
}

