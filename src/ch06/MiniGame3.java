package ch06;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiniGame3 extends JFrame {

	private JLabel jPlayer;
	int jPlayerX = 100;
	int jPlayerY = 100;
	private final int MOVDE_DISTANCE = 50;
	private final int FRAME_WIDTH = 500;
	private final int FRAME_HEIGHT = 500;
	private final String PLAYER_NAME = "야스오";
	private final int PLAYER_WIDTH = 100;
	private final int PLAYER_HIGHT = 100;
	
	
	

	public MiniGame3() {
		intitData();
		setInitLayout();
		addEventListener();
	}

	private void intitData() {
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jPlayer = new JLabel(PLAYER_NAME);
		jPlayer.setSize(PLAYER_WIDTH , PLAYER_HIGHT);
		
	}

	private void setInitLayout() {
		// 좌표 기반으로 배치 관리자 변경
		setLayout(null);
		add(jPlayer);
		setVisible(true);
		jPlayer.setLocation(100, 100);

	}

	private void addEventListener() {
		// jPlayer 객체에게만 KeyListener 동작을 시키고자 한다면
		// 익명 구현 클래스로 KeyListener 인터페이스를 재 정의 할수 있다.
		// jPlayer.addKeyListener(this);

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
					jPlayerY -=MOVDE_DISTANCE;
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					System.out.println("왼쪽");
					jPlayerX-=MOVDE_DISTANCE;
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					System.out.println("오른쪽");
					jPlayerX+=MOVDE_DISTANCE;
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					System.out.println("아래");
					jPlayerY+=MOVDE_DISTANCE;
				}
				jPlayer.setLocation(jPlayerX, jPlayerY);
			}
		});
	}

	// code test
	public static void main(String[] args) {
		new MiniGame3();
	} // end of main
} // end of class
