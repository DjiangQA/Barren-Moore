package main;

import java.util.Scanner;
//System.out.print("");
//playerclass = Integer.parseInt(scanner.nextLine());


public class Main { //-------------------------------------------------------------------------------------------MAIN LOOP-----------------------------------------

	Scanner scanner = new Scanner(System.in);

	boolean playerDead = false;
	boolean playerReachedEnd = false;
	boolean tryToBreakGame = false;
	boolean isInCombat = false;
	int playerclass = 0;

	NPCmanager N = new NPCmanager();
	Locationmanager L = new Locationmanager();
	Player P = new Player();

	public static void main(String[] args) {
		Main main = new Main();
		main.generateMap();
		main.generateNPCs();
		main.generateItems();
		main.generatePointOfInterest();
		main.gameStart();
		while (main.playerDead == false | main.playerReachedEnd == false) {
			main.playerMovement();
			main.combatChecker();
			if(main.isInCombat == true)
			{
				main.combat();
			}
			
			if(main.playerDead == true | main.playerReachedEnd == true)
			{
				break;
			}
			
		}
		main.endGame();
	}//----------------------------------------------------------------------------------------------------------MAIN LOOP-----------------------------------------

	public void gameStart() {

		System.out.println("-------------------- Welcome to Barren Moore the Adventure Game --------------------");
		System.out.print("Please enter Player name:");
		P.playerName = scanner.nextLine();
		System.out.println("Please Select a class");
		System.out.println("Fighter");
		System.out.println("Mage   *Not yet implemented");
		System.out.println("Cleric *Not yet implemented");
		P.playerClass = scanner.nextLine();
		
		if(P.playerClass.equals("Fighter"))
		{
			System.out.println("Character creation complete, player info :");
			System.out.println(P.playerClass("Fighter"));
		}
		else
		{
			System.out.println("Are you trying to break my game... PUNK");
			playerDead = true;
			tryToBreakGame = true;
		}
		
		System.out.println("\nThe players current position is: X" + P.playerX + " Y" + P.playerY);

		System.out.println("The first point of interest is at: X" + L.L.pointOfInterest1X + " Y" + L.L.pointOfInterest1Y);
		System.out.println("The final destination is at: X" + L.L.finalDestinationX + " Y" + L.L.finalDestinationY);
	}

	public void generateMap() {
		L.L.finalDestinationX = 5;
		L.L.finalDestinationY = 5;

		P.playerX = 0;
		P.playerY = 0;

	}

	public void generateNPCs() {
		N.addNPC(N.e1);
		
	}

	public void generateItems() {

	}

	public void generatePointOfInterest() {
		L.L.pointOfInterest1X = 4;
		L.L.pointOfInterest1Y = 4;
	}

	public void playerMovement() {
		String direction;
		String Action = "0";
		boolean playerAction = true;
		System.out.println("You are at X:"+P.playerX+" Y:"+ P.playerY+", Where do you want to move ?");
		System.out.println("North(Fowards),East(Right),South(Backwards),West(Left),Stay");

		while (playerAction == true) {
			direction = scanner.nextLine();

			if (direction.equals("North") | direction.equals("Fowards")) {
				P.playerY = P.playerY + 1;
			} else if (direction.equals("East") | direction.equals("Right")) {
				P.playerX = P.playerX + 1;
			} else if (direction.equals("South") | direction.equals("Backwards")) {
				P.playerY = P.playerY - 1;
			} else if (direction.equals("West") | direction.equals("Left")) {
				P.playerX = P.playerX - 1;
			} else if (direction.equals("Stay")) {
				;
			} else {
				System.out.println("Invalid input, try again.");
			}

			System.out.println("The players current position is: X" + P.playerX + " Y" + P.playerY);
			System.out.println(P.playerName + ",Do you want to do a action here? yes or no");
			Action  = scanner.nextLine();
			if (Action.equals("yes")) 
			{
				System.out.println("There is nothing to do, keep going");
				break;
			} 
			else if (Action.equals("no")) 
			{
				break;
			} 
			else 
			{
				System.out.println("Are you trying to break my game... PUNK");
				tryToBreakGame = true;
				break;
			}

		}
	}
	
	public void combatChecker(){
		if(P.playerX == N.e1.x & P.playerY == N.e1.y)
		{
			if (N.e1.alive == true)
			{
				isInCombat = true;
				System.out.println("Enemy "+N.getName()+" Encountered!");
				System.out.println("Prepar to fight!");
			}
			else
			{
				isInCombat = false;
				System.out.println("Just a dead guy... nothing to worry about.");
			}
		}
	}
	
	public void combat()
	{
		String playerOption = null;
		int tempPlayerHP = P.playerhealth;
		int tempEnemyHP = N.e1.health;
		int result1 = 0;
		int result2 = 0;
		System.out.println(P.playerName+" HP:"+tempPlayerHP+" Attack:"+P.playerAttack+" Defense:"+P.playerDefense);
		System.out.println(N.e1.name+ " HP:"+N.e1.health+" Attack:"+N.e1.attack+" Defense:"+N.e1.defense);
		System.out.println(P.playerName+", You are now in combat, what do you want to do ?");
		
		System.out.println("Attack "+N.e1.name);
		System.out.println("Defend");
		System.out.println("Run away");
		playerOption = scanner.nextLine();
		
		if (playerOption.equals("Attack"))
		{
			result1 = tempEnemyHP - P.playerAttack;
			if (result1 <0)
			{
				result2 = tempPlayerHP - N.e1.attack;
			}
			else
			{
				System.out.println("You WIN");
				N.e1.alive = false;
			}
			
		}
		else if (playerOption.equals("Defend"))
		{
			
		}
		else if (playerOption.equals("Run away"))
		{
			
		}
		else
		{
			
		}
		
	}

	public void endGame() {
		if (playerReachedEnd == true) {
			System.out.println("Congratulations, you finished the game");
		}
		if (playerDead == true & tryToBreakGame == true){
			System.out.println("U DED, this is what you get for trying to break things");
		}
		else if (playerDead == true) {
			System.out.println("U DED, better luck next time");
		}
	}

}