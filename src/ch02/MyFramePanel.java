package ch02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFramePanel  extends JFrame {

	private JButton button1; 
	private JButton button2;

	// 패널 추가하기 
	private JPanel panel1;
	private JPanel panel2;
	
	public MyFramePanel() {
		initData();
		setInitLayotu();
	}
	
	private void initData() {
		setTitle("패널추가 연습");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setBackground(Color.ORANGE);
		panel2 = new JPanel();
		panel2.setBackground(Color.BLACK);
		button1 = new JButton("button1");
		button2 = new JButton("button2");
	}
	
	private void setInitLayotu() {
		// 루트 패널 --> BorderLayout
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		
		panel1.add(button1);
		panel1.setLayout(new FlowLayout(2));
		panel2.add(button2);
		panel2.setLayout(new FlowLayout(3));
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new MyFramePanel();
	}
	
}
