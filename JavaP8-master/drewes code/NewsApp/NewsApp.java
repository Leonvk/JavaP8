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
		JLabel fav = new JLabel("Favorieten");
		// maak knop
		JButton categorie1 = new JButton("categorie1");
		JButton categorie1 = new JButton("categorie2");
		JButton categorie1 = new JButton("categorie3");
		JButton categorie1 = new JButton("categorie4");
		JButton categorie1 = new JButton("categorie5");
		// Maak de labels
		JLabel newsAppLabel = new JLabel("NewsApp");
		newsAppLabel.setHorizontalAlignment(JLabel.CENTER);
		// Voeg de componenten toe aan het paneel
		//yeettest
		add(newsAppLabel, BorderLayout.NORTH);
		add(fav);
		add(categorie1, BorderLayout.EAST);
		add(categorie2, BorderLayout.EAST);
		add(categorie3, BorderLayout.SOUTH);
		
	}

}
