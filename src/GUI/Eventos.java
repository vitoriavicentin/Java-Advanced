package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Eventos extends JFrame implements ActionListener {
	
	public Eventos() {
		super("Meus Eventos");
		
		JButton botao = new JButton("Clique");
		botao.addActionListener(this);
		
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[]args) {
		new Eventos();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Você clicou!");
	}

}
