package api;

import java.util.HashMap;

public class MyNewsApiFeed extends AbstractNewsApiFeed{
/**
 * ApiKey word aangeroepen
 */
	public static String APIKEY = "4985ad8292d24e61a6a19f34292e6240";

	public MyNewsApiFeed() {
		parameters = new HashMap<>();
		if (!APIKEY.isEmpty()) {
			
			/**
			 * Parameters worden gezet (apikey, sport)
			 */
			setParameter("apiKey", APIKEY);
		}
		setParameter("q", "Sport");
	}
}
