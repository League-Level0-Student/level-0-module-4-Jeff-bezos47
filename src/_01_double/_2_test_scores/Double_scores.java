package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Double_scores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String score = JOptionPane.showInputDialog("What did you get on your test");
		double scoreDble = Double.parseDouble(score);
		if(scoreDble >=85) {
			JOptionPane.showMessageDialog(null, "Great job!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You gotta lock in next time!");
		}
	}

}
