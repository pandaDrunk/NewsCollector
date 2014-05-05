package NewsCollector;

import java.awt.*;
import java.io.IOException;
import java.net.*;

public class runBrowser {
	public void runBrowser(String webSite) {
		URI uri = null;
		Desktop desktop = Desktop.getDesktop();
        try {
            // ������ַΪwebSite������
            uri = new URI(webSite);
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            // ���uri��ַ����ҳ
            desktop.browse(uri);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
