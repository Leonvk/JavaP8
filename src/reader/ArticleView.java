package reader;

import java.util.list;

import javax.swing.JPanel;

import article.Article;

public class ArticleView extends JPanel {
	
	public ArticleListView(list<Article> articles) {
		
		for (Article article : articles) {
			System.out.println("Show article " + article.getTitle());
			add(new ArticleView(article));
		}
	}

}
