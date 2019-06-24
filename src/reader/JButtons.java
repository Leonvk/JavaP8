package reader;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JButton;

public class JButtons extends JButton {
	
	public JButtons(String string) {
		this.setText(string);
		this.setBorderPainted(false);
		this.setFocusPainted(false);
		this.setFont(new Font("Courier New", Font.BOLD, 12));
		this.setBackground(Color.WHITE);
	}

}
