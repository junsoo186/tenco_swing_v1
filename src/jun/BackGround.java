package jun;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import bubble.test.ex07.Bubble;

public class BackGround extends JFrame {

	private JLabel backgroundMap;

	private Player player;
	private PlayerItem playerItem;

	public BackGround() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {

		// todo 배경 이미지 삽입
		backgroundMap = new JLabel(new ImageIcon("pjs/images.jpg"));
		
		setSize(1500, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap);

		player = new Player();

	}

	private void setInitLayout() {
		// 좌표값으로 배치
		setLayout(null);
		setLocationRelativeTo(null); // JFrame 여러분 모니터 가운데 자동 배치
		setVisible(true);

		add(player);

	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {

				switch (e.getKeyCode()) {

				case KeyEvent.VK_LEFT:
					if (!player.isLeft() ) {
                        player.left();
                    }
					
					player.setBagFlag(true);

					break;

				case KeyEvent.VK_RIGHT:

					if (!player.isRight() ) {
						player.right();
                    }
					player.setBagFlag(true);

					break;
				case KeyEvent.VK_UP:
					if (!player.isUp() ) {
                        player.up();
                    }
					player.setBagFlag(true);
					break;
				case KeyEvent.VK_DOWN:
				
					player.down();
					System.out.println("아래로");
					player.setBagFlag(true);
					break;
				case KeyEvent.VK_B:
					
					player.playerBag();
					player.setBagFlag(false);
					break;
				case KeyEvent.VK_1:
					
					
					break;
					
				default:
					break;

				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {

				case KeyEvent.VK_RIGHT:
					// 오른쪽으로 가는 상태 멈춤
					player.setRight(false);
					player.rightStay();
					// 구현
					break;
				case KeyEvent.VK_LEFT:
					
					player.setLeft(false);
					player.leftStay();
					// 구현
					break;
					
				case KeyEvent.VK_DOWN:
					// 오른쪽으로 가는 상태 멈춤
					player.setDown(false);

					player.stay();
					// 구현
					break;
				case KeyEvent.VK_UP:
					// 오른쪽으로 가는 상태 멈춤
					player.setUp(false);
					player.upStay();
					// 구현
					break;
				default:
					break;
				
				}
				
			}
		});
	}

} // end of BackGround
