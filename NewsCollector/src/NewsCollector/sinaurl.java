package NewsCollector;

import java.io.IOException;


import org.jsoup.Jsoup; 
import org.jsoup.nodes.Document; 
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements; 
  

public class sinaurl {
	 public void parseUrl() { 
		 String[] urls=new String[100];
	        try { 
	            Document doc = Jsoup.connect("http://www.sina.com.cn/").get(); 
	            Elements hrefs = doc.select("a[href*=http://sports]");  
	            Elements hrefs1 = hrefs.select("a[href$=.shtml");   
	          
	            for (Element element : hrefs1) {
	            	
	                System.out.println("链接地址：" + element.attr("href") + " 链接文本：" + element.text());
//	            	urls= element.attr("href") ;
//	            	return element.attr("href"); 
//	            	int i=0;
//	            	if(urls[i]!="a"){
//	            		urls[i]=element.attr("href");
//	            		i++;
//	            	}
	        }
	            
	        } catch (IOException e) { 
	            e.printStackTrace(); 
	        }      
	      
	    } 
}
