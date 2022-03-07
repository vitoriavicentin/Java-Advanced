package GUI;


import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Container;

public class Layouts extends JFrame{
		
	public Layouts() {
		super ("New Layout");
		
		Container c = getContentPane();

		
		c.add(BorderLayout. NORTH, new JButton("Bot�o Norte"));
		c.add(BorderLayout. SOUTH, new JButton("Bot�o Sul"));
		c.add(BorderLayout. SOUTH, new JButton("Bot�o Centro"));
		c.add(BorderLayout. SOUTH, new JButton("Bot�o Leste"));
		c.add(BorderLayout. SOUTH, new JButton("Bot�o Oeste"));
		
		setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
		
	public static void main(String[] args) {
		new Layouts();
	}

}
