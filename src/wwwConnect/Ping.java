package wwwConnect;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by brprashant on 3/26/17.
 */
public class Ping {

    URL url;

    public Ping() {
        try {
            url = new URL("http://www.google.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
