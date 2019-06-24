
package reader;

import javax.swing.JFrame;

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
