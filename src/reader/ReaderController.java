package reader;

import javax.swing.JPanel;

import api.MyNewsApiFeed;
import api.NewsApiParser;
import article.ArticleContainer;

public class ReaderController extends JPanel {
	
	private MyNewsApiFeed feed;
	
	private ArticleListView view;
	
	public ReaderController() {
		
		feed = new MyNewsApiFeed();
		String json = feed.request();
		System.out.println(json);
		ArticleContainer container = NewsApiParser.parseJson(json);
		
		view = new ArticleListView(container.getArticles());
		add(view);
	}
}
