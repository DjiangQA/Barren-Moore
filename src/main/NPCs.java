package main;

public abstract class NPCs {
	String name;
	int health;
	int attack;
	int defense;
	int exp;
	
	
	public NPCs(String name, int health, int attack, int defense, int exp) {
		super();
		this.name = name;
		this.health = health;
		this.attack = attack;
		this.defense = defense;
		this.exp = exp;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public int getAttack() {
		return attack;
	}


	public void setAttack(int attack) {
		this.attack = attack;
	}


	public int getDefense() {
		return defense;
	}


	public void setDefense(int defense) {
		this.defense = defense;
	}


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
	

	
	
}
