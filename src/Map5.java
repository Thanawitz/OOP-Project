
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


public class Map5 extends JPanel {	
	Image bg;
	@Override
	public void paintComponent(Graphics g){		
		ImageIcon i = new ImageIcon("images/BG.png");
		bg = i.getImage();
		g.drawImage(bg,0, 0, getWidth(), getHeight(), null);				
	}
	Map5(){
		GamePlay.count=60;
		setLayout(null);	
		CarX myCar=new CarX(new ImageIcon("images/MyCar.png"),150,225);
		CarX GreenCarX=new CarX(new ImageIcon("images/DarkGreenCarX.png"),75,75);
		CarX BrownCarX=new CarX(new ImageIcon("images/BrownCarX.png"),375,375);
		CarX PinkCarX=new CarX(new ImageIcon("images/PinkCarX.png"),375,450);
		
		CarY LightGreenCarY=new CarY(new ImageIcon("images/LightGreenCarY.png"),450,225);
		CarY YellowCarY=new CarY(new ImageIcon("images/YellowCarY.png"),450,75);
		CarY BlueCarY=new CarY(new ImageIcon("images/BlueCarY.png"),75,375);
		
		Car3X BlueTruckX=new Car3X(new ImageIcon("images/BlueTruckX.png"),150,300);
		
		
		Car3Y VanY=new Car3Y(new ImageIcon("images/VanY.png"),300,75);
		Car3Y RedTruckY=new Car3Y(new ImageIcon("images/RedTruckY.png"),375,150);
		Car3Y BlueTruckY=new Car3Y(new ImageIcon("images/BlueTruckY.png"),75,150);
		myCar.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackXY(myCar, LightGreenCarY);
				Rule.CheackXY(myCar, YellowCarY);
				Rule.CheackXY(myCar, BlueCarY);
				Rule.CheackX3Y(myCar, VanY);
				Rule.CheackX3Y(myCar, RedTruckY);
				Rule.CheackX3Y(myCar, BlueTruckY);
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
				Rule.CheackXY(GreenCarX, LightGreenCarY);
				Rule.CheackXY(GreenCarX, YellowCarY);
				Rule.CheackXY(GreenCarX, BlueCarY);
				Rule.CheackX3Y(GreenCarX, VanY);
				Rule.CheackX3Y(GreenCarX, RedTruckY);
				Rule.CheackX3Y(GreenCarX, BlueTruckY);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		BrownCarX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackXY(BrownCarX, LightGreenCarY);
				Rule.CheackXY(BrownCarX, YellowCarY);
				Rule.CheackXY(BrownCarX, BlueCarY);
				Rule.CheackX3Y(BrownCarX, VanY);
				Rule.CheackX3Y(BrownCarX, RedTruckY);
				Rule.CheackX3Y(BrownCarX, BlueTruckY);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		PinkCarX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackXY(PinkCarX, LightGreenCarY);
				Rule.CheackXY(PinkCarX, YellowCarY);
				Rule.CheackXY(PinkCarX, BlueCarY);
				Rule.CheackX3Y(PinkCarX, VanY);
				Rule.CheackX3Y(PinkCarX, RedTruckY);
				Rule.CheackX3Y(PinkCarX, BlueTruckY);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		
		
		
		LightGreenCarY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackYY(LightGreenCarY, YellowCarY);
				Rule.CheackYX(LightGreenCarY, myCar);
				Rule.CheackYX(LightGreenCarY, GreenCarX);
				Rule.CheackYX(LightGreenCarY, BrownCarX);
				Rule.CheackYX(LightGreenCarY, PinkCarX);
				Rule.CheackY3X(LightGreenCarY, BlueTruckX);
			
	
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		YellowCarY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				
				Rule.CheackYY(YellowCarY, LightGreenCarY);
				Rule.CheackYX(YellowCarY, myCar);
				Rule.CheackYX(YellowCarY, GreenCarX);
				Rule.CheackYX(YellowCarY, BrownCarX);
				Rule.CheackYX(YellowCarY, PinkCarX);
				Rule.CheackY3X(YellowCarY, BlueTruckX);
			
	
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		BlueCarY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				
				Rule.CheackY3Y(BlueCarY, BlueTruckY);
				Rule.CheackYX(BlueCarY, myCar);
				Rule.CheackYX(BlueCarY, GreenCarX);
				Rule.CheackYX(BlueCarY, BrownCarX);
				Rule.CheackYX(BlueCarY, PinkCarX);
				Rule.CheackY3X(BlueCarY, BlueTruckX);
			
	
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		
		
		
		
		RedTruckY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				
				Rule.Cheack3YX(RedTruckY, myCar);
				Rule.Cheack3YX(RedTruckY, GreenCarX);
				Rule.Cheack3YX(RedTruckY, BrownCarX);
				Rule.Cheack3YX(RedTruckY, PinkCarX);
				Rule.Cheack3Y3X(RedTruckY, BlueTruckX);
			
			
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
			
		
		
		VanY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.Cheack3YX(VanY, myCar);
				Rule.Cheack3YX(VanY, GreenCarX);
				Rule.Cheack3YX(VanY, BrownCarX);
				Rule.Cheack3YX(VanY, PinkCarX);
				Rule.Cheack3Y3X(VanY, BlueTruckX);
			
				
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		BlueTruckY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.Cheack3YY(BlueTruckY, BlueCarY);
				Rule.Cheack3YX(BlueTruckY, myCar);
				Rule.Cheack3YX(BlueTruckY, GreenCarX);
				Rule.Cheack3YX(BlueTruckY, BrownCarX);
				Rule.Cheack3YX(BlueTruckY, PinkCarX);
				Rule.Cheack3Y3X(BlueTruckY, BlueTruckX);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		BlueTruckX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.Cheack3XY(BlueTruckX, LightGreenCarY);
				Rule.Cheack3XY(BlueTruckX, YellowCarY);
				Rule.Cheack3XY(BlueTruckX, BlueCarY);
				Rule.Cheack3X3Y(BlueTruckX, VanY);
				Rule.Cheack3X3Y(BlueTruckX, RedTruckY);
				Rule.Cheack3X3Y(BlueTruckX, BlueTruckY);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		
		
		add(myCar);
		add(GreenCarX);
		add(BrownCarX);
		add(PinkCarX);
		add(LightGreenCarY);
		add(YellowCarY);
		add(BlueCarY);
		add(BlueTruckX);
		add(BlueTruckY);
		add(VanY);
		add(RedTruckY);
		GamePlay.t.start();
		
		
	}
	
}