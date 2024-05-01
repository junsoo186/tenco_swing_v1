package ch07;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LottoFrame extends JFrame implements ActionListener {
	private JButton button;
	private LottoRandomNumber lottoRandom;
	private boolean isStart = true;
	
	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("Lotto Game");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("Game Start");
		lottoRandom = new LottoRandomNumber();
	}
	private void setInitLayout() {
		add(button, BorderLayout.NORTH);
		setVisible(true);
	}
	private void addEventListener() {
		button.addActionListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("그림그려!");
		// 이벤트가 일어나면 그림을 다시 그려라
		
		
		
		isStart = false;
		repaint(); // 다시 그림을 그려라 요청하는 명령어 // F5
	}
	
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		Font f = new Font("궁서체", Font.BOLD, 20);
		g.setFont(f);
		
		int [] getNumers = lottoRandom.createNumber();
		if(isStart) {
			g.drawString("로또 번호를 클릭 하세요", 230, 200);
		}else  {
			g.drawString(getNumers[0] + " ", 100, 300);
			g.drawString(getNumers[1] + " ", 120, 300);
			g.drawString(getNumers[2] + " ", 140, 300);
			g.drawString(getNumers[3] + " ", 160, 300);
			g.drawString(getNumers[4] + " ", 180, 300);
			g.drawString(getNumers[5] + " ", 200, 300);
		}
		
		
	}
	
	 // main
	public static void main(String[] args) {
		new LottoFrame();
	} // end of main
}
