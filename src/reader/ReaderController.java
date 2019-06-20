package reader;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import api.MyNewsApiFeed;
import api.NewsApiParser;
import article.ArticleContainer;

public class ReaderController extends JPanel {

	private MyNewsApiFeed feed;

	private ArticleListView view;

	public ReaderController() {
		BorderLayout layout = new BorderLayout();
		this.setLayout(layout);

		add(new TitelView(), BorderLayout.NORTH);
		add(new KnoppenView(), BorderLayout.EAST);

		feed = new MyNewsApiFeed();
		String json = feed.request();
		System.out.println(json);
		ArticleContainer container = NewsApiParser.parseJson(json);
		view = new ArticleListView(container.getArticles());
		add(view, BorderLayout.CENTER);

	}
}
