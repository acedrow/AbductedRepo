package firstIterationTest;

public class PlayClass {
	
	
	public Integer[] attArray = new Integer[6];
	
	public PlayClass(int eng, int agi, int body, int will, int strength, int spirit){
		attArray[0] = eng;
		attArray[1] = agi;
		attArray[2] = body;
		attArray[3] = will;
		attArray[4] = strength;
		attArray[5] = spirit;
		
	}
	
	public int getAttArray(int i){
		return attArray[i];
	}
	
	//public 

}
