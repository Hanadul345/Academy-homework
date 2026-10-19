package Practice;

public class PlayerStatus {
	private String name;
	private int age;
	private int charm;
	private int affection;

	// Constructor //
	public PlayerStatus() {
		super();
	}
	public PlayerStatus(String name, int age, int charm, int affection) {
		super();
		this.name = name;
		this.age = age;
		this.charm = charm;
		this.affection = affection;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setCharm(int charm) {
		this.charm = charm;
	}
	public void setAffection(int affection) {
		this.affection = affection;
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public int getCharm() {
		return charm;
	}
	public int getAffection() {
		return affection;
	}
	public String info() {
		return "플레이어정보 [이름: " + name + " | 나이: " + age + " | 매력: " +  charm + " | 몸무게: " + affection + "]";
	}
	
}
