//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot A = new Robot();
		for(int a=0;a<10;a++) {
		//3. Ask the user what color they would like the robot to draw
		String input = JOptionPane.showInputDialog("What color would you like the robot to draw?");
		//5. Use an if/else statement to set the pen color that the user requested
		if(input.equals("red")) {
			A.setPenColor(Color.red);
		}
		else if(input.equals("orange")) {
			A.setPenColor(Color.orange);
		}
		else if(input.equals("yellow")) {
			A.setPenColor(Color.yellow);
		}
		else if(input.equals("green")) {
			A.setPenColor(Color.green);
		}
		else if(input.equals("blue")) {
			A.setPenColor(Color.blue);
		}
		else if(input.equals("magenta")) {
			A.setPenColor(Color.MAGENTA);
		}
		
        //6. If the user doesn’t enter anything, choose a random color
		//0-200; 
		int r = 0;
		int g = 0;
		int b = 0;
		Random red = new Random();
		r=red.nextInt(256);
		Random green = new Random();
		g=green.nextInt(256);
		Random blue = new Random();
		b=blue.nextInt(256);
		if(input.equals("")) {
			A.setPenColor(r,g,b);
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		A.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		A.penDown();
		for(int i=0;i<4;i++) {
			A.setSpeed(200);
			A.move(200);
			A.turn(90);
		}
		}
	}
}
