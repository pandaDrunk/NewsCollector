package NewsCollector;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



@SuppressWarnings("serial")
public class window extends JFrame implements ActionListener {
	JButton sina=new JButton("sina");
	JButton sohu=new JButton("sohu");
	JButton exit=new JButton("Exit");
	JTextArea[] url=new JTextArea[100];
	JLabel title1=new JLabel("Choose one website:");
	JLabel[] titles=new JLabel[100];
	JPanel pane=new JPanel();
	
	public window(){
		super("News Collector");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sina.addActionListener(this);
		exit.addActionListener(this);
//		JPanel pane=new JPanel();
		pane.add(title1);
		pane.add(sina);
		pane.add(sohu);
		pane.add(exit);
//		pane.add(url);
		setContentPane(pane);
	}
	public void actionPerformed(ActionEvent evt){
		Object source=evt.getSource();
		
		if (source==sina){
			SinaSports sinasports=new SinaSports();
			sinasports.show();
		}
		if(source==exit){
			System.exit(0);
		}
	}
	
}
