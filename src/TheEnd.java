
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class TheEnd extends JPanel{
	Image bg;
	TheEnd(){
		sound.music2.stop();
		sound.win();
	}
	@Override
	public void paintComponent(Graphics g){		
		ImageIcon i = new ImageIcon("images/TheEnd.png");
		bg = i.getImage();
		g.drawImage(bg,0, 0, getWidth(), getHeight(), null);				
	}
}
