package ch05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JFrame implements ActionListener{
	private JPanel panel1;
	private JPanel panel2;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	
	public Rainbow() {
		
		inItData();
		
		setOutLayout();
		addEventListener();
	}

	private void inItData() {
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel1.setBackground(Color.CYAN);
		panel2.setBackground(Color.gray);
		button1 = new JButton("빨강");
		button2 = new JButton("주황");
		button3 = new JButton("노랑");
		button4 = new JButton("초록");
		
		
	}
	private void setOutLayout() {
		add(panel1, BorderLayout.CENTER); 
		add(panel2, BorderLayout.SOUTH);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		
		setVisible(true);
	
	}

	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	}

	public static void main(String[] args) {
		new Rainbow();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== button1 ) {
			panel1.setBackground(Color.red);
		}if(e.getSource()== button2) {
			panel1.setBackground(Color.orange);
		}if(e.getSource()== button3) {
			panel1.setBackground(Color.yellow);
		}if(e.getSource()== button4) {
			panel1.setBackground(Color.green);
		}
	}
	
	
}
