package api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import article.ArticleContainer;

/*
 * Used tutorials:
 * https://futurestud.io/tutorials/gson-mapping-of-arrays-and-lists-of-objects
 * https://www.baeldung.com/gson-deserialization-guide
 */

public class NewsApiParser {

	public static ArticleContainer parseJson(String json) {
		Gson gson =  ((Gson) new GsonBuilder().create());
		ArticleContainer container = gson.fromJson(json, ArticleContainer.class);
		return container;
	}
}