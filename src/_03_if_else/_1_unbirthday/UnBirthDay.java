package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class UnBirthDay {
	public static void main(String[] args) {
		
		String birthday = JOptionPane.showInputDialog("When is your birthday?");
		if(birthday.equals("11/28")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}else {
			JOptionPane.showMessageDialog(null, "Happy UNbirthday!");
		}
		
		
	}
}
