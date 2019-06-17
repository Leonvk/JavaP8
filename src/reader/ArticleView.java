package reader;

import javax.swing.JLabel;
import javax.swing.JPanel;

import article.Article;

public class ArticleView extends JPanel {
	
	// Creates Article
	public ArticleView(Article article) {
		System.out.println("create article " + article.getTitle());
		add(new JLabel(article.getTitle()));
	}

}
