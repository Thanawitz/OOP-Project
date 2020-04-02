
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Map3 extends JPanel {	
	Image bg;
	@Override
	public void paintComponent(Graphics g){		
		ImageIcon i = new ImageIcon("images/BG.png");
		bg = i.getImage();
		g.drawImage(bg,0, 0, getWidth(), getHeight(), null);				
	}
	Map3(){
		GamePlay.count=60;
		setLayout(null);	
		CarX myCar=new CarX(new ImageIcon("images/MyCar.png"),150,225);
		CarX BrownCarX=new CarX(new ImageIcon("images/BrownCarX.png"),150,300);
		CarX BlueCarX=new CarX(new ImageIcon("images/BlueCarX.png"),225,450);
		
		CarY PinkCarY=new CarY(new ImageIcon("images/PinkCarY.png"),150,375);
	
		Car3Y VanY=new Car3Y(new ImageIcon("images/VanY.png"),300,225);
		Car3Y RedTruckY=new Car3Y(new ImageIcon("images/RedTruckY.png"),450,300);
		
		myCar.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackXY(myCar, PinkCarY);
				Rule.CheackX3Y(myCar, VanY);
				Rule.CheackX3Y(myCar, RedTruckY);
				if(myCar.getX()>=375){
					GamePlay.t.stop();
					GamePlay.move=false;
					GamePlay.C.repaint();
					sound.pass();
					GamePlay.nextbtn.setVisible(true);
				}
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		
		BrownCarX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackXY(BrownCarX, PinkCarY);
				Rule.CheackX3Y(BrownCarX, VanY);
				Rule.CheackX3Y(BrownCarX, RedTruckY);
				
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		BlueCarX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackXY(BlueCarX, PinkCarY);
				Rule.CheackX3Y(BlueCarX, VanY);
				Rule.CheackX3Y(BlueCarX, RedTruckY);
				
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		PinkCarY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				
				Rule.CheackYX(PinkCarY, myCar);
				Rule.CheackYX(PinkCarY, BlueCarX);
				Rule.CheackYX(PinkCarY, BrownCarX);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		
		
		
		
		RedTruckY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				
				Rule.Cheack3YX(RedTruckY, myCar);
				Rule.Cheack3YX(RedTruckY, BlueCarX);
				Rule.Cheack3YX(RedTruckY, BrownCarX);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
			
		
		
		VanY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.Cheack3YX(VanY, myCar);
				Rule.Cheack3YX(VanY, BlueCarX);
				Rule.Cheack3YX(VanY, BrownCarX);
				
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		add(myCar);
		add(BrownCarX);
		add(RedTruckY);
		add(PinkCarY);
		add(BlueCarX);
		add(VanY);
		GamePlay.t.start();
		
		
	}
	
}

