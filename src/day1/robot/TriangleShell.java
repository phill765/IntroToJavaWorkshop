package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot r2d2= new Robot();

	
	void go() {
		// 3. delete this line (used only for testing)

		// 6. Make the robot go as fast as possible
		r2d2.setSpeed(10);

		// 4. make a variable to hold the length of the triangle and set it to 50
		int length=50;

		// 7. Do the following (up to step 10) 60 times
		int opa=0;
		while(opa<=61){
			
		

			// 9. Change the color of the pen to a random color
			r2d2.setRandomPenColor();
	
			// 8. Increase the length of the side by 10 pixels
			
	
			// 5. call your drawTriangle() method using your length variable
		drawTriangle(length+10);
	
			// 10. Turn the tortoise 6 degrees to the right
		r2d2.turn(6);
		}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
		int i=0; while(i<=4){
		r2d2.penDown();	
		r2d2.move(100);
		r2d2.turn(90);
		i=i+1;
		}
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
