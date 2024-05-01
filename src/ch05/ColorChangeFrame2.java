package ch05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChangeFrame2 extends JFrame implements ActionListener{

	private JPanel panel;
	private JButton button1;
	private JButton button2;
	
	public ColorChangeFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());//BorderLayout
		panel = new JPanel();
		panel.setBackground(Color.green);
		button1 = new JButton("치원이발짝버튼");
		button2 = new JButton("이제형님 발짝 버튼");
		
	}
	private void setInitLayout() {
		add(button1,BorderLayout.NORTH);
		add(panel,BorderLayout.CENTER);
		add(button2,BorderLayout.SOUTH);
		setVisible(true);
	}
	// 이 메서드에 책임은 이벤트 리스너만 등록
	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new ColorChangeFrame2()
;	}
	// 오버라이드 : 이벤트가 일어나면 호출 되어지는 메서드
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()== button1 ) {
			panel.setBackground(Color.pink);
			System.out.println("치원 발짝");
		}if(e.getSource()== button2) {
			System.out.println("형님 발짝");
			panel.setBackground(Color.green);
		}
		
		
	}
}
