
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Start extends JFrame{
	Start(){
		add(new StartPanel());
		setSize(800, 630);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setVisible(true);
		}
			
	
	class StartPanel extends JPanel implements MouseListener{
		Image bg;
		StartPanel(){
			JLabel sbtn=new JLabel(new ImageIcon("images/StartButton.png"));
			sbtn.setBounds(400, 75, 260, 100);
			sbtn.addMouseListener(this);
			sbtn.setBorder(null);
			setLayout(null);
			add(sbtn);
			sound.music1();
		}
		@Override
		public void paintComponent(Graphics g){		
			ImageIcon i = new ImageIcon("images/JOJO.png");
			bg = i.getImage();
			g.drawImage(bg,0, 0, getWidth(), getHeight(), null);				
		}
		@Override
		public void mouseClicked(MouseEvent arg0) {// TODO Auto-generated method stub
			new GamePlay();
			dispose();
			sound.music1.stop();
			sound.click();
			
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
	public static void start(){
		new Start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start();
	}
}
	
