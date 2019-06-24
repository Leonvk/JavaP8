package reader;

import java.awt.Font;

import javax.swing.JButton;

public class MooieKnop extends JButton{
	
	MooieKnop(String string){
		this.setFont(new Font("Courier New", Font.ITALIC, 12));
		this.setBorderPainted(false);
		this.setFocusPainted(false);
		this.setText(string);
	}

}
