package main;

public class Friendlynpcs extends NPCs {
	
	boolean isEnermy = false;
	int x = 0;
	int y = 0;

	
	public Friendlynpcs(String name, int health, int attack, int defense, int exp, boolean isEnermy, int x, int y) {
		super(name, health, attack, defense, exp);
		this.isEnermy = isEnermy;
		this.x = x;
		this.y = y;
	}


	public boolean isEnermy() {
		return isEnermy;
	}

}
