package reader;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitelView extends JPanel {

	public TitelView() {

		// labels
		JLabel newsAppLabel = new JLabel("NewsApp");
		newsAppLabel.setHorizontalAlignment(JLabel.CENTER);
		newsAppLabel.setFont(new Font("Serif", Font.PLAIN, 40));
		add(newsAppLabel);

	}
}
