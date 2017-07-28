package main;

public class Player {
	
	String playerName;
	int playerLevel;
	int playerhealth;
	int playerAttack;
	int playerDefense;
	int playerExp;
	String playerClass;
	
	int playerX;
	int playerY;
	
	
	public String playerClass(String playerClass)
	{
		if(playerClass.equals("Fighter"))
		{
			playerClass = "Fighter";
			playerhealth =20;
			playerAttack = 5;
			playerDefense = 5;
		}
		
		return "Player Name: "+playerName+" Class:"+playerClass+" Health:"+playerhealth+" Attack:"+playerAttack+" Defense:"+playerDefense;
	}
	
	public void magicCompass(){
		
	}
	
	public void playerActions(){
		
	}
	
	public void playerCombat(){
		
	}
	
	
	
	
	
	
	
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerClass() {
		return playerClass;
	}

	public void setPlayerClass(String playerClass) {
		this.playerClass = playerClass;
	}

	public int getPlayerLevel() {
		return playerLevel;
	}

	public void setPlayerLevel(int playerLevel) {
		this.playerLevel = playerLevel;
	}

	public int getPlayerAttack() {
		return playerAttack;
	}

	public void setPlayerAttack(int playerAttack) {
		this.playerAttack = playerAttack;
	}

	public int getPlayerDefense() {
		return playerDefense;
	}

	public void setPlayerDefense(int playerDefense) {
		this.playerDefense = playerDefense;
	}

	public int getPlayerExp() {
		return playerExp;
	}

	public void setPlayerExp(int playerExp) {
		this.playerExp = playerExp;
	}
	
	

}
