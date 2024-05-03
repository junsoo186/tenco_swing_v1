package bubble.test.ex06;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {

	private JLabel backgroundMap;
	// 포함 관계
	private Player player;
	

	public BubbleFrame() {
		initData();
		setInitLayout();
		addEventListener();

		// Player 백그라운드 서비스 시작

		new Thread(new BackgroundPlayerService(player)).start();
	}

	private void initData() {
		// todo 이미지 변경
		backgroundMap = new JLabel(new ImageIcon("img/backgroundMap.png"));
		// backgroundMap = new JLabel(new ImageIcon("img/test.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Frame --> root Panel
		setContentPane(backgroundMap); // add 처리
		setSize(1000, 640);

		player = new Player();
		

	}

	private void setInitLayout() {
		// 좌표값으로 배치
		setLayout(null);
		setResizable(false); // 프레임 조절 불가
		setLocationRelativeTo(null); // JFrame 여러분 모니터 가운데 자동 배치
		setVisible(true);

		add(player);
	
	}

	private void addEventListener() {

		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("key code : " + e.getKeyCode());

				switch (e.getKeyCode()) {

				case KeyEvent.VK_LEFT:
					// 구현

					// 왼쪾으로 방향키 누르고 있다면
					// key 이벤트가 계속 <- <- <- <-
					// 왼쪽 상태가 아니라면
					// 왼쪽 벽에 충동 한게 아니라면
					if (!player.isLeft() && !player.isLeftWallCrash()) {
						player.left();
					}
					break;

				case KeyEvent.VK_RIGHT:
					if (!player.isRight() && !player.isRightWallCrash()) {
						player.right();
					}
					// 구현
					break;
				case KeyEvent.VK_UP:
					player.up();
					// 구현
					break;
				case KeyEvent.VK_SPACE:
					
					
					add(new Bubble(player));
					
					break;
				default:
					break;
				}
			} // end of key

			@Override
			public void keyReleased(KeyEvent e) {

				switch (e.getKeyCode()) {

				case KeyEvent.VK_LEFT:
					// 구현
					// 왼쪽으로 가는 상태 멈춤
					player.setLeft(false);
					break;

				case KeyEvent.VK_RIGHT:
					// 오른쪽으로 가는 상태 멈춤
					player.setRight(false);
					// 구현
					break;
				default:
					break;
				case KeyEvent.VK_UP:
				}

			} // end of KeyReleased

		});
	}

	// 코드 테스트
	public static void main(String[] args) {
		new BubbleFrame();
	} // end of main
}
