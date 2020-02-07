package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {

	Robot rob = new Robot();

	public void run() {
	
		setup();
		background("black");
		flatHouse("small", "red");
		pointHouse("medium", "green");
		flatHouse("large", "red");
		flatHouse("large", "blue");
		flatHouse("large", "green");
		flatHouse("small", "blue");
		flatHouse("large", "red");
		pointHouse("medium", "red");
		pointHouse("small", "green");
		pointHouse("medium", "blue");
		
		
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
	void flatHouse(String height, String color) {
		int tall = 0;
		Color boi = Color.white;
		if(height.equalsIgnoreCase("small")) {
			tall = 60;
		}
		else if(height.equalsIgnoreCase("medium")) {
			tall = 120;
		}
		else if(height.equalsIgnoreCase("large")) {
			tall = 250;
		}

		
		if(color.equalsIgnoreCase("red")) {
			boi = Color.red;
		}
		else if(color.equalsIgnoreCase("green")) {
			boi = Color.green;
		}
		else if(color.equalsIgnoreCase("blue")) {
			boi = Color.blue;
		}
		
		rob.turn(-90);
		rob.move(20);
		rob.turn(90);
		rob.setPenColor(boi);
		rob.move(tall);
		rob.turn(-90);
		rob.move(50);
		rob.turn(-90);
		rob.move(tall);
		rob.turn(90);
		rob.move(10);
		rob.setPenColor(0,255,0);
		rob.move(20);
		rob.turn(90);
	}

	void pointHouse(String height, String color) {
		int talll = 0;
		Color boi = Color.white;
		if(height.equalsIgnoreCase("small")) {
			talll = 60;
		}
		else if(height.equalsIgnoreCase("medium")) {
			talll = 120;
		}
		else if(height.equalsIgnoreCase("large")) {
			talll = 250;
		}
		
		if(color.equalsIgnoreCase("red")) {
			boi = Color.red;
		}
		else if(color.equalsIgnoreCase("green")) {
			boi = Color.green;
		}
		else if(color.equalsIgnoreCase("blue")) {
			boi = Color.blue;
		}
		rob.turn(-90);
		rob.move(20);
		rob.turn(90);
		rob.setPenColor(boi);
		rob.move(talll);
		rob.turn(-45);
		rob.move(25);
		rob.turn(-90);
		rob.move(25);
		rob.turn(-45);
		rob.move(talll);
		rob.turn(90);
		rob.move(10);
		rob.setPenColor(0,255,0);
		rob.move(10);
		rob.turn(90);
	}
	
	void background(String back) {
	if (back.equalsIgnoreCase("black")){
		rob.setWindowColor(Color.black);
		}
	if (back.equalsIgnoreCase("white")){
		rob.setWindowColor(Color.white);
		}
	}
}
