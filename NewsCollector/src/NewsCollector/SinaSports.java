package NewsCollector;

import java.awt.Desktop;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


@SuppressWarnings("serial")
public  class SinaSports extends JFrame implements ActionListener{
	Desktop desktop = Desktop.getDesktop();
	JTextArea[] url=new JTextArea[100];
	JLabel title1=new JLabel("Sina Sports:");
	JButton[] titles=new JButton[100];
	JPanel pane=new JPanel();
//	JButton test=new JButton("test");
	String[] link=new String[100];
	public SinaSports(){
		super("News Collector");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		pane.add(title1);		
//		pane.add(test);
//		test.addActionListener(this);
		setContentPane(pane);	
	        try { 
	            Document doc = Jsoup.connect("http://www.sina.com.cn/").get(); 
	            Elements hrefs = doc.select("a[href*=http://sports]");  
	            Elements hrefs1 = hrefs.select("a[href$=.shtml");   
	            int i=0;
	            for (Element element : hrefs1) {
	            	
	            	url[i]=new JTextArea(1,15);
	            	titles[i]=new JButton(element.text());
	            	//pane.add(url[i]);
	            	pane.add(titles[i]);
	            	setContentPane(pane);
	            	titles[i].addActionListener(this);
	            	url[i].setText(element.attr("href"));
	            	link[i]=new String(element.attr("href"));
	            	i++;
//	                System.out.println("链接地址：" + element.attr("href") + " 链接文本：" + element.text());           
	        }
	            
	        } catch (IOException e) { 
	            e.printStackTrace(); 
	        }  

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int number=0;
		Object source=e.getSource();
		for(int i=0;i<titles.length;i++){
			if(titles[i]!=null){
				number=i+1;
			}
		}
//		if(source== test){
//			for(int i=0; i<link.length;i++){
//				if(link[i]!=null)
//					System.out.println(link[i]);
//			}
//		}
		for(int n=0;n<number;n++){
			if (source==titles[n]){
				runBrowser open=new runBrowser();
				open.runBrowser(link[n]);
			}
		}
	}
	
}
	

