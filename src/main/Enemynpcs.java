package main;

public class Enemynpcs extends NPCs {
	
	boolean isEnemy = true;
	boolean alive = true;
	int x = 1;
	int y = 1;
	

	public Enemynpcs(String name, int health, int attack, int defense, int exp, boolean isEnemy, boolean alive, int x,
			int y) {
		super(name, health, attack, defense, exp);
		this.isEnemy = isEnemy;
		this.alive = alive;
		this.x = x;
		this.y = y;
	}

	public boolean isEnemy() {
		return isEnemy;
	}
	
	public String checkEnemy()
	{
		return new String ("Health:"+health+" Attack:"+attack+" Defense:"+defense+" X:"+x+" Y:"+y);
	}
	
}
