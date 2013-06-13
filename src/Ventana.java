import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import twitter4j.Status;
import twitter4j.TwitterException;


public class Ventana extends JFrame{


	
	miTwitterControlador mtc;
//	JLabel post;
	JTextField post2;
	
	public Ventana() throws TwitterException{
		
		this.setLayout(null);
		this.setSize(800,700);
		this.setTitle("Ventana");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		mtc = new miTwitterControlador();
	
		List<Status> st=mtc.getTimeLine();
		int y=10;
	
		for(Status stu:st){
			post2=new JTextField(stu.getUser().getName());
			post2.setBounds(10, y+=60, 300, 100);
			//post=new JLabel(stu.getUser().getName());
			//post.setBounds(150, y+=60, 300, 100);
			this.add(post2);
			
		}
		
		
		
	
	
		
	}

	
	

}
