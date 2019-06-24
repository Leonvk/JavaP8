package reader;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitelView extends JPanel {

	public TitelView() {

		// labels
		JLabel newsAppLabel = new JLabel("NewsApp");
		newsAppLabel.setHorizontalAlignment(JLabel.CENTER);
		add(newsAppLabel);

	}
}
