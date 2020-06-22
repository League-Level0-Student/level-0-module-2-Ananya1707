package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("Enter your age");
		int ageAsInt = Integer.parseInt(age);
		
		if(ageAsInt >= 18) {
			JOptionPane.showMessageDialog(null, "Who should be the next president?");
		}
		else {
			JOptionPane.showMessageDialog(null, "You are too young to vote");
		}
	}

}
