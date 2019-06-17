package reader;

import java.util.List;

import javax.swing.JPanel;

import article.Article;

public class ArticleListView extends JPanel {

public ArticleListView(List<Article> articles) {
		
		for (Article article : articles) {
			System.out.println("Show article " + article.getTitle());
			add(new ArticleView(article));
		}
	}
}
