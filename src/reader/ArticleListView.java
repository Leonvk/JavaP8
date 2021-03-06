package reader;

import java.awt.GridLayout;
import java.util.List;

import javax.swing.JPanel;

import article.Article;

public class ArticleListView extends JPanel {

	GridLayout experimentLayout = new GridLayout(0, 1);

	ArticleListView(){
		System.out.println("articlelistview maken");
	}

	public ArticleListView(List<Article> articles) {

		setLayout(experimentLayout);
		for (Article article : articles) {
			System.out.println("Show article " + article.getTitle());
			//String ArticleString = "" + article.getTitle();
			add(new ArticleView(article));
		}
	}
}
