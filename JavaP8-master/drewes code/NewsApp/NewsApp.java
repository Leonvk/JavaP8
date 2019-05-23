import java.awt.BorderLayout;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NewsApp {

	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setSize(1200, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("NewsApp");
		frame.setContentPane(new paneel());
		frame.setVisible(true);

	}
}

// Het paneel
class paneel extends JPanel {

	public paneel() {
		setLayout(new BorderLayout());
		// Maak de tekstvakken

		// maak knop

		// Maak de labels
		JLabel newsAppLabel = new JLabel("NewsApp");
		newsAppLabel.setHorizontalAlignment(JLabel.CENTER);
		// Voeg de componenten toe aan het paneel
		//yeet
		add(newsAppLabel, BorderLayout.NORTH);
		
	}

}
