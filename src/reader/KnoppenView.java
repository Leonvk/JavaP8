package reader;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

class KnoppenView extends JPanel {
private ReaderController controller;
	public KnoppenView(ReaderController controller) {

this.controller = controller;

FlowLayout experimentLayout = new FlowLayout();
		setLayout(experimentLayout);
		// Maak de tekstvakken

		// maak knop
		JButton categorie1 = new JButton("Voetbal"); {
			categorie1.setBorderPainted(false);
			categorie1.setFocusPainted(false);
			categorie1.setFont(new Font("Courier New", Font.ITALIC, 12));
		}
		JButton categorie2 = new JButton("Tennis");
		JButton categorie3 = new JButton("Sport Vissen");
		JButton categorie4 = new JButton("Golf");
		JButton categorie5 = new JButton("Gymnastiek");
		JButton categorie6 = new JButton("Hockey");
		
		categorie2.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hallo dit is alles van tennis");
				controller.jurgen("tennis");
			}
			
		});
		
		add(categorie1);
		add(categorie2);
		add(categorie3);
		add(categorie4);
		add(categorie5);
		add(categorie6);

	}
}
