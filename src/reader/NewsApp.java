
package reader;

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
		frame.setContentPane(new ReaderController());
		frame.setVisible(true);

	}
}

// Het paneel
class paneel extends JPanel {

	public paneel() {
		setLayout(null);
		// Maak de tekstvakken

		// maak knop
		JButton categorie1 = new JButton("Voetbal");
		categorie1.setBounds(920, 200, 100, 40);
		JButton categorie2 = new JButton("Tennis");
		categorie2.setBounds(1020, 200, 100, 40);
		JButton categorie3 = new JButton("Sport Vissen");
		categorie3.setBounds(920, 240, 100, 40);
		JButton categorie4 = new JButton("Golf");
		categorie4.setBounds(1020, 240, 100, 40);
		JButton categorie5 = new JButton("Gymnastiek");
		categorie5.setBounds(920, 280, 100, 40);
		JButton categorie6 = new JButton("Hockey");
		categorie6.setBounds(1020, 280, 100, 40);
		// Maak de labels
		JLabel newsAppLabel = new JLabel("NewsApp");
		newsAppLabel.setHorizontalAlignment(JLabel.CENTER);
		newsAppLabel.setBounds(550, 20, 100, 30);
		JLabel fav = new JLabel("Favorieten");
		fav.setBounds(1000, 150, 400, 20);
		// Voeg de componenten toe aan het paneel
		add(newsAppLabel);
		add(fav);
		add(categorie1);
		add(categorie2);
		add(categorie3);
		add(categorie4);
		add(categorie5);
		add(categorie6);

	}

}
