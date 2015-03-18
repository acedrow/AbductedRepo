package firstIterationTest;

import java.util.Scanner;

public class Game {

	static Scanner info = new Scanner(System.in);
	static PlayerCharacter playChar;

	public static void main(String[] args) {

		System.out.println("starting new game");

		createCharacter();
		
		beginAdventure();
		
		

	}

	public static void createCharacter() {
		System.out.println("Enter a name for your character: ");
		String tempName = info.nextLine();
		int tempClass;
		
		do{
		System.out
				.println("Enter a class for character (1 for tank, 2 for rogue, 3 for mage, 4 for control mage, 5 for paladin, 6 for duelist)");
		tempClass = info.nextInt();
		
		if(tempClass > 6 || tempClass < 1){
			System.out.println("Invalid class ID number, please retry");
		}
		
		} while (tempClass > 6 || tempClass < 1);

		playChar = new PlayerCharacter(tempName, tempClass);
		
		

	}
	
	public static void beginAdventure(){
		
	}

}
