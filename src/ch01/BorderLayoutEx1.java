package ch01;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// 단축키 습관 -  ctrl + shift + s, f, o
public class BorderLayoutEx1 extends JFrame {

	public BorderLayoutEx1() {

		initData();
		setInutLayout();

	}

	public void initData() {
		setTitle("borderLayout 연습");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void setInutLayout() {
		// 배치 관리자 선정
		// BorderLayout -- 컴포넌트들을 동서남북가운데로 배치 시켜주는 레이아웃이다.
		setLayout(new BorderLayout());
		add(new JButton(">"), BorderLayout.EAST);
		add(new JButton("<"), BorderLayout.WEST);
		add(new JButton("∨"), BorderLayout.SOUTH);
		add(new JButton("∧"), BorderLayout.NORTH);
		add(new JButton("o"), BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new BorderLayoutEx1();
	} // end of main

}
