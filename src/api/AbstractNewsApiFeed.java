package api;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class AbstractNewsApiFeed {

	public static final String SRC = "https://newsapi.org/v2/top-headlines";
	public static String APIKEY = "4985ad8292d24e61a6a19f34292e6240";

	protected Map<String, String> parameters;
	protected URL url;

	public AbstractNewsApiFeed() {
		parameters = new HashMap<>();
		if (!APIKEY.isEmpty()) {
			setParameter("apiKey", APIKEY);
		}
		setParameter("q", "Sport");
	}

	public void setUrl() {
		try {
			url = new URL(SRC + "?" + ParameterStringBuilder.getParamsString(parameters));
		} catch (UnsupportedEncodingException e) {
			System.out.println("Error while creating parameters: " + e.getMessage());
		} catch (MalformedURLException e) {
			System.out.println("Error while creating url: " + e.getMessage());
		}
	}

	public String getUrl() {
		return url.toString();
	}

	public String request() {
		String json = "";

		setUrl();

		try {
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json");
			con.setConnectTimeout(5000);
			con.setReadTimeout(5000);

			if (con.getResponseCode() != 200)
				throw new RuntimeException("HttpResponseCode: " + con.getResponseCode());
			else {

				Scanner scanner = new Scanner(url.openStream());
				while (scanner.hasNext()) {
					json += scanner.nextLine();
				}
				scanner.close();
				con.disconnect();

			}
		} catch (UnsupportedEncodingException e) {
			System.out.println("Error while creating parameters: " + e.getMessage());
		} catch (MalformedURLException e) {
			System.out.println("Error while creating url: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error while reading url: " + e.getMessage());
		}

		return json;

	}

	public void setParameter(String key, String value) {
		parameters.put(key, value);
	}
}
