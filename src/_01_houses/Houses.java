package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run() {
		Robot rob = new Robot();
		rob.miniaturize();
		rob.setSpeed(500);
		rob.setPenColor(0,255,0);
		rob.setPenWidth(10);
		rob.penDown();
		rob.setX(800);
		rob.setY(400);
		rob.turn(-90);
		rob.move(50);
		rob.turn(90);
		rob.setPenColor(150,255,100);
		rob.move(200);
		rob.turn(-90);
		rob.move(50);
	}
}
