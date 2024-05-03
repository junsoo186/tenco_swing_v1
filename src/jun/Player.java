package jun;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements MoveAble {

	private int x;
	private int y;
	private ImageIcon playerR, playerL, playerU, playerD;
	
	public Player() {

	
	}

	@Override
	public void left() {
		
	}

	@Override
	public void right() {

	}

	@Override
	public void up() {

	}

	@Override
	public void down() {

	}
	
	private void initData() {
		
		playerD = new ImageIcon("pjs/playerDown.png");
		playerU = new ImageIcon("pjs/playerUp.png");
		playerR = new ImageIcon("pjs/playerRight.png");
		playerL = new ImageIcon("pjs/playerLeft.png");
	}

}
