package reader;

import java.awt.FlowLayout;

import javax.swing.JPanel;

class KnoppenView extends JPanel {

	public KnoppenView() {


		FlowLayout experimentLayout = new FlowLayout();
		setLayout(experimentLayout);
		// Maak de tekstvakken

		// maak knop
		MooieKnop categorie1 = new MooieKnop("Voetbal");
		MooieKnop categorie2 = new MooieKnop("Tennis");
		MooieKnop categorie3 = new MooieKnop("Sport Vissen");
		MooieKnop categorie4 = new MooieKnop("Golf");
		MooieKnop categorie5 = new MooieKnop("Gymnastiek");
		MooieKnop categorie6 = new MooieKnop("Hockey");

		// Voeg de componenten toe aan het paneel
		add(categorie1);
		add(categorie2);
		add(categorie3);
		add(categorie4);
		add(categorie5);
		add(categorie6);

	}
}
