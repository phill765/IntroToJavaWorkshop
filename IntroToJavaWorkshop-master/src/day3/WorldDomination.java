package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String ans=JOptionPane.showInputDialog("Do you even code?");

		// 2. If they say "yes", tell them they will rule the world.
		if(ans.equals("yes")){
			JOptionPane.showMessageDialog(null, "you are gonna rule the world someday.");
			
		}

		// 3. Otherwise, wish them good luck washing dishes.
		if(ans.equals("no")){
		JOptionPane.showMessageDialog(null, "Have fun washing dishes living in your parents basement!");}	
		else{ JOptionPane.showMessageDialog(null, "Ancwer the question, stupid!");
			
			
		}
		}
		
		}

	


