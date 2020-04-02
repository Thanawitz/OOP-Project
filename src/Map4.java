
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


public class Map4 extends JPanel {	
	Image bg;
	@Override
	public void paintComponent(Graphics g){		
		ImageIcon i = new ImageIcon("images/BG.png");
		bg = i.getImage();
		g.drawImage(bg,0, 0, getWidth(), getHeight(), null);				
	}
	Map4(){
		GamePlay.count=60;
		setLayout(null);	
		CarX myCar=new CarX(new ImageIcon("images/MyCar.png"),150,225);
		
		CarY LightGreenCarY=new CarY(new ImageIcon("images/LightGreenCarY.png"),225,300);
		CarY YellowCarY=new CarY(new ImageIcon("images/YellowCarY.png"),450,375);
		
		Car3X BlueTruckX=new Car3X(new ImageIcon("images/BlueTruckX.png"),300,300);
		Car3X VanX=new Car3X(new ImageIcon("images/VanX.png"),225,450);
		
		Car3Y VanY=new Car3Y(new ImageIcon("images/VanY.png"),75,75);
		Car3Y RedTruckY=new Car3Y(new ImageIcon("images/RedTruckY.png"),300,75);
		
		myCar.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackXY(myCar, LightGreenCarY);
				Rule.CheackXY(myCar, YellowCarY);
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
		
		
		
		
		LightGreenCarY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				
				Rule.CheackYX(LightGreenCarY, myCar);
				Rule.CheackY3X(LightGreenCarY, BlueTruckX);
				Rule.CheackY3X(LightGreenCarY, VanX);
	
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		YellowCarY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				
				Rule.CheackYX(YellowCarY, myCar);
				Rule.CheackY3X(YellowCarY, BlueTruckX);
				Rule.CheackY3X(YellowCarY, VanX);
	
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		
		
		
		
		RedTruckY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				
				Rule.Cheack3YX(RedTruckY, myCar);
				Rule.Cheack3Y3X(RedTruckY, BlueTruckX);
				Rule.Cheack3Y3X(RedTruckY, VanX);
			
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
			
		
		
		VanY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.Cheack3YX(VanY, myCar);
				Rule.Cheack3Y3X(VanY, BlueTruckX);
				Rule.Cheack3Y3X(VanY, VanX);
				
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		BlueTruckX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.Cheack3XY(BlueTruckX, LightGreenCarY);
				Rule.Cheack3XY(BlueTruckX, YellowCarY);
				Rule.Cheack3X3Y(BlueTruckX, VanY);
				Rule.Cheack3X3Y(BlueTruckX, RedTruckY);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		VanX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.Cheack3XY(VanX, LightGreenCarY);
				Rule.Cheack3XY(VanX, YellowCarY);
				Rule.Cheack3X3Y(VanX, VanY);
				Rule.Cheack3X3Y(VanX, RedTruckY);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		add(myCar);
		add(LightGreenCarY);
		add(YellowCarY);
		add(BlueTruckX);
		add(VanX);
		add(VanY);
		add(RedTruckY);
		GamePlay.t.start();
		
		
	}
	
}