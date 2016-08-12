package day3;

import org.jointheleague.graphical.robot.Robot;

public class day3test {
	public static void main(String[] args) {
		Robot Tommy= new Robot();
		int tri=3;
		int heh=1000000000;
		while(heh>=2){
			Tommy.setRandomPenColor();
			Tommy.setSpeed(10);
			Tommy.penDown();
			Tommy.move(tri);
			Tommy.turn(tri);
			tri=tri*3;
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
