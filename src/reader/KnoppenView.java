package reader;

import java.awt.FlowLayout;

import javax.swing.JPanel;

class KnoppenView extends JPanel {

	public KnoppenView() {


		FlowLayout experimentLayout = new FlowLayout();
		setLayout(experimentLayout);
		// Maak de tekstvakken

		// maak knop
		JButton categorie1 = new JButtons("Voetbal");
		JButton categorie2 = new JButtons("Tennis");
		JButton categorie3 = new JButtons("Sport Vissen");
		JButton categorie4 = new JButtons("Golf");
		JButton categorie5 = new JButtons("Gymnastiek");
		JButton categorie6 = new JButtons("Hockey");

		// Voeg de componenten toe aan het paneel
		add(categorie1);
		add(categorie2);
		add(categorie3);
		add(categorie4);
		add(categorie5);
		add(categorie6);

	}
}
