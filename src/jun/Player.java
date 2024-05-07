package jun;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements MoveAble {

	private int x;
	private int y;
	private ImageIcon playerStay, playerDownStep1, playerDownStep2,
	playerRightStep1,playerRightStep2,playerRightStep3,playerRightStay,
	playerLeftStep1,playerLeftStep3,playerLeftStay,
	playerUpStep1,playerUpStep3,playerUpStay; // Down
	
	// 움직임
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public ImageIcon getPlayerStay() {
		return playerStay;
	}

	public void setPlayerStay(ImageIcon playerStay) {
		this.playerStay = playerStay;
	}

	public ImageIcon getPlayerDownStep1() {
		return playerDownStep1;
	}

	public void setPlayerDownStep1(ImageIcon playerDownStep1) {
		this.playerDownStep1 = playerDownStep1;
	}

	public ImageIcon getPlayerDownStep2() {
		return playerDownStep2;
	}

	public void setPlayerDownStep2(ImageIcon playerDownStep2) {
		this.playerDownStep2 = playerDownStep2;
	}

	public boolean isLeft() {
		return left;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	public int getSPEED() {
		return SPEED;
	}

	// 플레이어 속도
	private final int SPEED = 4;

	public Player() {
		initData();
		setInitLayout();

	}

	@Override
	public void left() {
		setIcon(playerLeftStep1);
		left = true;
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (left) {
					x = x - SPEED;
					if( x / 10%4 == 2 ) {

						setIcon(playerLeftStep1);
						
					}else {
						setIcon(playerLeftStep3);						
					} 
				 
					
					
					setLocation(x, y);
					
					try {
						Thread.sleep(25);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

	@Override
	public void right() {
		setIcon(playerRightStep1);
		right = true;
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (right) {
					x = x + SPEED;
					if( x / 10%4 == 2 ) {

						setIcon(playerRightStep1);
						
					}else {
						setIcon(playerRightStep3);						
					} 
				 
					
					
					setLocation(x, y);
					
					try {
						Thread.sleep(25);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		
	}

	@Override
	public void up() {
		setIcon(playerDownStep1);
		up = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (up) {
					y = y - SPEED;
					if( y / 10 % 2 == 0 ) {
						setIcon(playerUpStep1);
					}else {
						
						setIcon(playerUpStep3);
					}
				 
					
					
					setLocation(x, y);
					
					try {
						Thread.sleep(60);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();

	}

	@Override
	public void down() {
		setIcon(playerDownStep1);
		down = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (down) {
					y = y + SPEED;
					if( y / 10 % 2 == 0 ) {
						setIcon(playerDownStep1);
					}else {
						
						setIcon(playerDownStep2);
					}
				 
					
					
					setLocation(x, y);
					
					try {
						Thread.sleep(60);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
	@Override
	public void stay() {
		while(true) {
			setIcon(playerStay);
			
		}
	}
	public void rightStay() {
		setIcon(playerRightStay);
	}
	public void leftStay() {
		setIcon(playerLeftStay);
	}
	public void upStay() {
		setIcon(playerUpStay);
	}

	private void initData() {

		playerStay = new ImageIcon("pjs/player_ver3.png");
		playerDownStep1 = new ImageIcon("pjs/player_ver3_down_1.png");
		playerDownStep2 = new ImageIcon("pjs/player_ver3_down_2.png");
		playerRightStep1 = new ImageIcon("pjs/player_ver3_Right_1.png");
		playerRightStep2 = new ImageIcon("pjs/player_ver3_Right_2.png");
		playerRightStep3 = new ImageIcon("pjs/player_ver3_Right_3.png");
		playerRightStay = new ImageIcon("pjs/player_ver3_Right_Stay.png");
		playerLeftStep1 = new ImageIcon("pjs/player_ver3_Left_1.png");
		playerLeftStep3 = new ImageIcon("pjs/player_ver3_Left_3.png");
		playerLeftStay = new ImageIcon("pjs/player_ver3_Left_Stay.png");
		playerUpStep1 = new ImageIcon("pjs/player_ver3_Up_step1.png");
		playerUpStep3 = new ImageIcon("pjs/player_ver3_Up 2.png");
		playerUpStay = new ImageIcon("pjs/player_ver3__head_+_body_UpStay.png");
		left = false;
		right = false;
		up = false;
		down = false;

	}

	private void setInitLayout() {
		setIcon(playerStay);
		setSize(70, 100);
		setLocation(x, y);

	}


} // end of player class
