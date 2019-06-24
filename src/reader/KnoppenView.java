package reader;

import java.awt.FlowLayout;

import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

class KnoppenView extends JPanel {
private ReaderController controller;
	public KnoppenView(ReaderController controller) {

this.controller = controller;

FlowLayout experimentLayout = new FlowLayout();
		setLayout(experimentLayout);
		// Maak de tekstvakken

		// maak knop
		JButtons categorie1 = new JButtons("Voetbal");
		JButtons categorie2 = new JButtons("Tennis");
		JButtons categorie3 = new JButtons("Sport Vissen");
		JButtons categorie4 = new JButtons("Golf");
		JButtons categorie5 = new JButtons("Gymnastiek");
		JButtons categorie6 = new JButtons("Hockey");

		// Voeg de componenten toe aan het paneel

		add(categorie1);
		add(categorie2);
		add(categorie3);
		add(categorie4);
		add(categorie5);
		add(categorie6);

	}
}
