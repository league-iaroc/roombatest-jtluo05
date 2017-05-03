package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {	
		goStraight(2000);
		turnLeft(250);
		goStraight(2000);
		
		
		
		
		
		
		
		
	}

	public void loop() {
	
	}

	
	
	private void goStraight(int howLong){
		driveDirect(500,500);
		sleep(howLong);
		
		
}
	
	
	private void turnLeft(int howLong){
		driveDirect(0,500);
		sleep(howLong);
		
		
}
	
	
	
	
	private void turnRight(int howLong){
		driveDirect(500,0);
		sleep(howLong);
		
		
}
}
