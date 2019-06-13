package reader;

import article.Article;

public class ArticleListView {

public ArticleListView(list<Article> articles) {
		
		for (Article article : articles) {
			System.out.println("Show article " + article.getTitle());
			add(new ArticleView(article));
		}
	}
}
