package jun;

import javax.swing.JLabel;

public class PlayerItem extends JLabel {
	
	private Player player;
	
	
	
	private void weponOne() {

		// 0 !- 1 -- toggle
		new Thread(() -> {
			
			while (true) {
				
					try {
						Thread.sleep(800);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			
			}
		}).start();
		}

	}


