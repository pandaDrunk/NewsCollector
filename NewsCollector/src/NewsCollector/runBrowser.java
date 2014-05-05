package NewsCollector;

import java.awt.*;
import java.io.IOException;
import java.net.*;

public class runBrowser {
	public void runBrowser(String webSite) {
		URI uri = null;
		Desktop desktop = Desktop.getDesktop();
        try {
            // 定义网址为webSite的内容
            uri = new URI(webSite);
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            // 浏览uri网址的网页
            desktop.browse(uri);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
