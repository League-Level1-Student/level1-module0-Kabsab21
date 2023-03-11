package _01_methods._1_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob = new Robot();
	int small = 60;
	int medium = 120;
	int large = 250;
		public void run() {
		
		// Check the recipe to find out what code to put here
			rob.setX(10);
			pointyHouse(small, small, 0, 0, 255);
			flatHouse(medium, small, 0, 0, 255);
			pointyHouse(medium, small, 0, 0, 255);
			flatHouse(large, medium, 0, 0, 255);
			pointyHouse(small, small, 0, 0, 255);
	}

//dfsl;dfm

	void flatHouse(int i, int e, int r, int b, int d){
    	rob.setSpeed(10);
		rob.setPenColor( r, b, d );
		rob.penDown();
		rob.setAngle(0);
		rob.move(i);
		rob.turn(90);
		rob.move(e);
		rob.turn(90);
		rob.move(i);
		rob.turn(-90);
		rob.setPenColor(0,255,50);
		rob.move(10); 
		rob.hide();    	
    	
    }
	void pointyHouse(int i, int e, int r, int b, int d){
    	rob.setSpeed(10);
		rob.setPenColor( r, b, d );
		rob.penDown();
		rob.setAngle(0);
		rob.move(i);
		rob.turn(45);
		rob.move(e);
		rob.turn(90);
		rob.move(e);
		rob.turn(45);
		rob.move(i);
		rob.turn(-90);
		rob.setPenColor(0,255,50);
		rob.move(10); 
		rob.hide();    	
    	
    }
}
