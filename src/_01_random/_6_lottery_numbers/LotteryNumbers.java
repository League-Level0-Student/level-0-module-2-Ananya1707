package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		Random ran = new Random();
		int randomNumber = ran.nextInt(100);
		
		String lottery = "";
		
		for (int i = 0; i < 6; i++) {
			randomNumber = ran.nextInt(100);
			lottery += randomNumber + " ";
			JOptionPane.showMessageDialog(null, lottery, "Lottery Ticket", JOptionPane.INFORMATION_MESSAGE);
		}
		 JOptionPane.showMessageDialog(null, "Winning Numbers: 41 58 22 17 6 92");
	}

}
