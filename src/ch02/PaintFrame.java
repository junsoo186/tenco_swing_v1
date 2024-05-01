package ch02;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

//내부 활용해서 코드를 완성해주세요
public class PaintFrame extends JFrame {

	imDrawPanel imDrawPanel;
	
	public PaintFrame() {
		initData();
		setInitLayout();
		
	}
	
	private void initData() {
		setTitle("치원이그리기");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		imDrawPanel = new imDrawPanel();
	}
	
	private void setInitLayout() {
		add(imDrawPanel);
		setVisible(true);
	}
	
	class imDrawPanel extends JPanel{
		public void paint(Graphics g) {
			super.paint(g);
			g.clearRect(100, 10, 100, 10);
			g.clearRect(10, 10, 100, 10);
			g.clearRect(100, 10, 90, 10);
			g.clearRect(110, 10, 100, 10);
			g.clearRect(10, 10, 100, 10);
			g.clearRect(100, 10, 100, 50);
			
		
		}
	}
	
	
}
