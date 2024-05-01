package ch06;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiniGame2 extends JFrame {
	private JLabel backgroundMap;
	private JLabel player; 
	JLabel rightPlayer;
	private final int BACKGROUND_WIDTH = 900;
	private final int BACKGROUND_HITGH = 482;
	private final String PLAYER_NAME ="해골";
	private final int PLAYER_WIDTH = 100;
	private final int PLAYER_HIGHT = 100;
	private final int MOVDE_DISTANCE = 30;
	int playerX = 100;
	int playerY = 100;

	public MiniGame2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(BACKGROUND_WIDTH, BACKGROUND_HITGH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Icon icon = new ImageIcon("images/background.jpg");
		backgroundMap = new JLabel(icon);
		backgroundMap.setSize(900, 482);
		backgroundMap.setLocation(0,0);
		
		player = new JLabel(new ImageIcon("images/player1.png"));
		player.setSize(PLAYER_WIDTH , PLAYER_HIGHT);
		player.setLocation(100,100);
	}

	private void setInitLayout() {
		setLayout(null);
		add(backgroundMap);
		backgroundMap.add(player);
		setVisible(true);
		player.setLocation(100, 100);
	}

	private void addEventListener() {
		
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					// 변수는 변하는 수이기도 하다.
					
					System.out.println("위");
					playerY -=MOVDE_DISTANCE;
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					System.out.println("왼쪽");
					playerX-=MOVDE_DISTANCE;
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					System.out.println("오른쪽");
					playerX+=MOVDE_DISTANCE;
					
					
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					System.out.println("아래");
					playerY+=MOVDE_DISTANCE;
				}
				player.setLocation(playerX, playerY);
			}
		});

	}
	
	public static void main(String[] args) {
		new MiniGame2();
	}
}
