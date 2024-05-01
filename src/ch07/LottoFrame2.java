package ch07;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LottoFrame2 extends JFrame implements ActionListener {
	private JButton button;
	private LottoRandomNumber lottoRandom;
	private boolean isStart = true;
	private final int NUMBER_DISTAMCE =60; 
	private JLabel backgroundMap;
	private JLabel skull; 
	private JLabel skull2; 
	private JLabel skull3; 
	private JLabel skull4; 
	private JLabel skull5; 
	private JLabel skull6; 
	private JLabel skull11; 
	
	public LottoFrame2() {
		initData();
		setInitLayout();
		addEventListener();
		
	}
	
	private void initData() {
		setTitle("Lotto Game");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("예언");
		lottoRandom = new LottoRandomNumber();
		Icon icon = new ImageIcon("images/table1.png");
		backgroundMap = new JLabel(icon);
		backgroundMap.setSize(600, 400);
		backgroundMap.setLocation(0,0);
		
		skull = new JLabel(new ImageIcon("images/lotto1.png"));
		skull.setSize(100, 100);
		skull.setLocation(100,190);
		skull11 = new JLabel(new ImageIcon("images/lotto2.png"));
		skull11.setSize(100, 100);
		skull11.setLocation(100,190);
		skull2 = new JLabel(new ImageIcon("images/lotto1.png"));
		skull2.setSize(100, 100);
		skull2.setLocation(160,190);
		skull3 = new JLabel(new ImageIcon("images/lotto1.png"));
		skull3.setSize(100, 100);
		skull3.setLocation(220,190);
		skull4 = new JLabel(new ImageIcon("images/lotto1.png"));
		skull4.setSize(100, 100);
		skull4.setLocation(280,190);
		skull5 = new JLabel(new ImageIcon("images/lotto1.png"));
		skull5.setSize(100, 100);
		skull5.setLocation(340,190);
		skull6 = new JLabel(new ImageIcon("images/lotto1.png"));
		skull6.setSize(100, 100);
		skull6.setLocation(400,190);
		
	}
	private void setInitLayout() {
		add(button, BorderLayout.NORTH);
		add(backgroundMap);
		backgroundMap.add(skull);
		backgroundMap.add(skull2);
		backgroundMap.add(skull3);
		backgroundMap.add(skull4);
		backgroundMap.add(skull5);
		backgroundMap.add(skull6);
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
		g.setColor(Color.red);
		g.setFont(f);
		
		int [] getNumers = lottoRandom.createNumber();
		if(isStart) {
			g.drawString("로또 번호를 클릭 하세요", 230, 200);
		}else  {
			for (int i = 0; i < getNumers.length; i++) {
				g.drawString(getNumers[i] + " ", 151 + (i * NUMBER_DISTAMCE), 280);
				if(i <20) {
					skull.add(skull11);
					
				}
			}
//			g.drawString(getNumers[1] + " ", 120, 300);
//			g.drawString(getNumers[2] + " ", 140, 300);
//			g.drawString(getNumers[3] + " ", 160, 300);
//			g.drawString(getNumers[4] + " ", 180, 300);
//			g.drawString(getNumers[5] + " ", 200, 300);
		}
		
		
	}
	
	 // main
	public static void main(String[] args) {
		new LottoFrame2();
	} // end of main
}
