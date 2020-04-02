
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


public class Map6 extends JPanel {	
	Image bg;
	@Override
	public void paintComponent(Graphics g){		
		ImageIcon i = new ImageIcon("images/BG.png");
		bg = i.getImage();
		g.drawImage(bg,0, 0, getWidth(), getHeight(), null);				
	}
	Map6(){
		GamePlay.count=60;
		setLayout(null);	
		CarX myCar=new CarX(new ImageIcon("images/MyCar.png"),150,225);
		CarX GreenCarX=new CarX(new ImageIcon("images/DarkGreenCarX.png"),75,75);
		
		CarY BlueCarY=new CarY(new ImageIcon("images/BlueCarY.png"),225,75);
		
		Car3X BlueTruckX=new Car3X(new ImageIcon("images/BlueTruckX.png"),150,300);
		Car3X RedTruckX=new Car3X(new ImageIcon("images/RedTruckX.png"),300,450);
		
		Car3Y VanY=new Car3Y(new ImageIcon("images/VanY.png"),300,75);
		Car3Y VanY2=new Car3Y(new ImageIcon("images/VanY.png"),75,150);
		myCar.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
			
				Rule.CheackXY(myCar, BlueCarY);
				Rule.CheackX3Y(myCar, VanY);
				Rule.CheackX3Y(myCar, VanY2);
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
		
		GreenCarX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				
				Rule.CheackXY(GreenCarX, BlueCarY);
				Rule.CheackX3Y(GreenCarX, VanY);
				Rule.CheackX3Y(GreenCarX, VanY2);

			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		BlueCarY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				
				
				Rule.CheackYX(BlueCarY, myCar);
				Rule.CheackYX(BlueCarY, GreenCarX);
				Rule.CheackY3X(BlueCarY, RedTruckX);
				Rule.CheackY3X(BlueCarY, BlueTruckX);
			
	
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		
		VanY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.Cheack3YX(VanY, myCar);
				Rule.Cheack3YX(VanY, GreenCarX);
				Rule.Cheack3Y3X(VanY, RedTruckX);
				Rule.Cheack3Y3X(VanY, BlueTruckX);
			
				
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		VanY2.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.Cheack3YX(VanY2, myCar);
				Rule.Cheack3YX(VanY2, GreenCarX);
				Rule.Cheack3Y3X(VanY2, RedTruckX);
				Rule.Cheack3Y3X(VanY2, BlueTruckX);
			
				
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		
		
		BlueTruckX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
			
				Rule.Cheack3XY(BlueTruckX, BlueCarY);
				Rule.Cheack3X3Y(BlueTruckX, VanY);
				Rule.Cheack3X3Y(BlueTruckX, VanY2);
				
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		RedTruckX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
			
				Rule.Cheack3XY(RedTruckX, BlueCarY);
				Rule.Cheack3X3Y(RedTruckX, VanY);
				Rule.Cheack3X3Y(RedTruckX, VanY2);
				
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		
		
		add(myCar);
		add(GreenCarX);
		add(BlueCarY);
		add(BlueTruckX);
		add(RedTruckX);
		add(VanY);
		add(VanY2);
		GamePlay.t.start();
		
		
	}
	
}