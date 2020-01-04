package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();

	public void run() {
		setup();
		house("small");
		house("medium");
		house("large");
		

	}
	void setup() {
		rob.miniaturize();
		rob.setSpeed(500);
		rob.setPenColor(0,255,0);
		rob.setPenWidth(10);
		rob.penDown();
		rob.setX(900);
		rob.setY(400);
	}
	void house(String height) {
		int tall = 0;
	
		if(height.equals("small")) {
			tall = 60;
		}
		if(height.equals("medium")) {
			tall = 120;
		}
		if(height.equals("large")) {
			tall = 250;
		}
		rob.turn(-90);
		rob.move(20);
		rob.turn(90);
		rob.setPenColor(150,255,100);
		rob.move(tall);
		rob.turn(-90);
		rob.move(50);
		rob.turn(-90);
		rob.move(tall);
		rob.turn(90);
		rob.move(20);
		rob.turn(90);
	}
}
