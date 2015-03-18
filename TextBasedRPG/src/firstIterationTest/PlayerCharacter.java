package firstIterationTest;

import firstIterationTest.playerClassTypes.ControlMage;
import firstIterationTest.playerClassTypes.Duelist;
import firstIterationTest.playerClassTypes.Mage;
import firstIterationTest.playerClassTypes.Paladin;
import firstIterationTest.playerClassTypes.Rogue;
import firstIterationTest.playerClassTypes.Tank;

public class PlayerCharacter {

	public static String name;
	public static PlayClass playerClass = null;
	public Integer[] attArray = new Integer[6];

	 public PlayerCharacter(String name, int classID) {
		this.name = name;

		switch (classID) {
		case (1):
			playerClass = new Tank();
			break;
		case (2):
			playerClass = new Rogue();
			break;
		case (3):
			playerClass = new Mage();
			break;
		case (4):
			playerClass = new ControlMage();
			break;
		case (5):
			playerClass = new Paladin();
			break;
		case (6):
			playerClass = new Duelist();
			break;
		default:
			System.out.println("Invalid class ID, please enter a valid class ID: ");

		}
		
		for(int i  = 0; i < 6; i++){
			attArray[i] = playerClass.getAttArray(i);
		}

	}
	 
	 public int getAttribute(String attString){
		 switch(attString){
		 case("eng"):
			 return attArray[0];
		 case("agi"):
			 return attArray[1];
		 case("body"):
			 return attArray[2];
		 case("will"):
			 return attArray[3];
		 case("strength"):
			 return attArray[4];
		 case("spirit"):
			 return attArray[5];
		 default:
			 return -1;
		 }
	 }
	 
	 

}
