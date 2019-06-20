
package reader;

import java.awt.GridLayout;

import javax.swing.JButton;
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
//class paneel extends JPanel {
//
//	public paneel() {
//
//
//		GridLayout experimentLayout = new GridLayout(0,2);
//		setLayout(experimentLayout);
//		// Maak de tekstvakken
//
//		// maak knop
//		JButton categorie1 = new JButton("Voetbal");
//		JButton categorie2 = new JButton("Tennis");
//		JButton categorie3 = new JButton("Sport Vissen");
//		JButton categorie4 = new JButton("Golf");
//		JButton categorie5 = new JButton("Gymnastiek");
//		JButton categorie6 = new JButton("Hockey");
//		// Maak de labels
//		JLabel newsAppLabel = new JLabel("NewsApp");
//		newsAppLabel.setHorizontalAlignment(JLabel.CENTER);
//		JLabel fav = new JLabel("Favorieten");
//		// Voeg de componenten toe aan het paneel
//		add(newsAppLabel);
//		add(fav);
//		add(categorie1);
//		add(categorie2);
//		add(categorie3);
//		add(categorie4);
//		add(categorie5);
//		add(categorie6);
//
//	}
