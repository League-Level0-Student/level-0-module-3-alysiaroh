import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {


	//Make an obedient robot that will obey commands to draw shapes.
	static Robot A = new Robot();
	//1. Make a new class, create a main method, and show the robot.

	//2. Have the robot draw a square.
	static void drawSquare() {
	for(int i=0;i<4;i++) {
	A.penDown();
	A.setSpeed(100);
	A.move(200);
	A.turn(90);
	}
	}
	//3. Extract this code into a drawSquare() method.

	//4. Have the robot draw a triangle.
	static void drawTriangle() {
	for(int i=0;i<3;i++) {
	A.penDown();
	A.setSpeed(100);
	A.move(200);
	A.turn(120);
	}
	}
	//5. Extract this code into a drawTriangle() method.

	//6. Have the robot draw a circle.
	static void drawCircle() {
	for(int i=0;i<360;i++) {
	A.penDown();
	A.setSpeed(1000);
	A.move(1);
	A.turn(1);
	}
	}
	//7. Extract this code into a drawCircle() method.
public static void main(String[] args) {

	//8. Ask the user which shape they want. Draw the appropriate shape depending on their answer.
String colorInput = JOptionPane.showInputDialog("What color do you want?");
	if(colorInput.equals("red")) {
		A.setPenColor(Color.red);
	}
	else if(colorInput.equals("green")) {
		A.setPenColor(Color.GREEN);
	}

	else if(colorInput.equals("blue")) {
		A.setPenColor(Color.blue);
	}
			String input = JOptionPane.showInputDialog("What shape do you want?");
	if(input.equals("square")) {
		drawSquare();
	}
	else if(input.equals("triangle")) {
		drawTriangle();
	}
	else if(input.equals("circle")) {
		drawCircle();
	}
	//9. Ask the user which color they want. Color the the shape depending on their answer.
	
	
	}
}
