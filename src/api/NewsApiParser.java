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
		return ((Gson) new GsonBuilder().create()).fromJson(json, ArticleContainer.class);
	}
}