
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


public class Map2 extends JPanel {	
	Image bg;
	@Override
	public void paintComponent(Graphics g){		
		ImageIcon i = new ImageIcon("images/BG.png");
		bg = i.getImage();
		g.drawImage(bg,0, 0, getWidth(), getHeight(), null);				
	}
	Map2(){
		GamePlay.count=60;
		setLayout(null);	
		CarX myCar=new CarX(new ImageIcon("images/MyCar.png"),75,225);
		CarX GreenCarX=new CarX(new ImageIcon("images/DarkGreenCarX.png"),75,450);
		CarX BrownCarX=new CarX(new ImageIcon("images/BrownCarX.png"),300,450);
		CarX PinkCarX=new CarX(new ImageIcon("images/PinkCarX.png"),375,375);
		
		CarY PinkCarY=new CarY(new ImageIcon("images/PinkCarY.png"),75,75);
		CarY LightGreenCarY=new CarY(new ImageIcon("images/LightGreenCarY.png"),225,375);
		CarY YellowCarY=new CarY(new ImageIcon("images/YellowCarY.png"),300,150);
		CarY BlueCarY=new CarY(new ImageIcon("images/BlueCarY.png"),375,225);
		
		Car3X BlueTruckX=new Car3X(new ImageIcon("images/BlueTruckX.png"),75,300);
		Car3X VanX=new Car3X(new ImageIcon("images/VanX.png"),300,75);
		Car3Y RedTruckY=new Car3Y(new ImageIcon("images/RedTruckY.png"),450,150);
		
		myCar.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackXY(myCar, PinkCarY);
				Rule.CheackXY(myCar, LightGreenCarY);
				Rule.CheackXY(myCar, YellowCarY);
				Rule.CheackXY(myCar, BlueCarY);
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
		
		GreenCarX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackXX(GreenCarX, BrownCarX);
				Rule.CheackXY(GreenCarX, PinkCarY);
				Rule.CheackXY(GreenCarX, LightGreenCarY);
				Rule.CheackXY(GreenCarX, YellowCarY);
				Rule.CheackXY(GreenCarX, BlueCarY);
				Rule.CheackX3Y(GreenCarX, RedTruckY);
				
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		BrownCarX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackXX(BrownCarX, GreenCarX);
				Rule.CheackXY(BrownCarX, PinkCarY);
				Rule.CheackXY(BrownCarX, LightGreenCarY);
				Rule.CheackXY(BrownCarX, YellowCarY);
				Rule.CheackXY(BrownCarX, BlueCarY);
				Rule.CheackX3Y(BrownCarX, RedTruckY);
				
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		PinkCarX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackXY(PinkCarX, PinkCarY);
				Rule.CheackXY(PinkCarX, LightGreenCarY);
				Rule.CheackXY(PinkCarX, YellowCarY);
				Rule.CheackXY(PinkCarX, BlueCarY);
				Rule.CheackX3Y(PinkCarX, RedTruckY);
				
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		PinkCarY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackY3X(PinkCarY, VanX);
				Rule.CheackY3X(PinkCarY, BlueTruckX);
				Rule.CheackYX(PinkCarY, myCar);
				Rule.CheackYX(PinkCarY, PinkCarX);
				Rule.CheackYX(PinkCarY, GreenCarX);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		LightGreenCarY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackY3X(LightGreenCarY, VanX);
				Rule.CheackY3X(LightGreenCarY, BlueTruckX);
				Rule.CheackYX(LightGreenCarY, myCar);
				Rule.CheackYX(LightGreenCarY, PinkCarX);
				Rule.CheackYX(LightGreenCarY, GreenCarX);
				Rule.CheackYX(LightGreenCarY, BrownCarX);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		YellowCarY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackY3X(YellowCarY, VanX);
				Rule.CheackY3X(YellowCarY, BlueTruckX);
				Rule.CheackYX(YellowCarY, myCar);
				Rule.CheackYX(YellowCarY, PinkCarX);
				Rule.CheackYX(YellowCarY, GreenCarX);
				Rule.CheackYX(YellowCarY, BrownCarX);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		BlueCarY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackY3X(BlueCarY, VanX);
				Rule.CheackY3X(BlueCarY, BlueTruckX);
				Rule.CheackYX(BlueCarY, myCar);
				Rule.CheackYX(BlueCarY, PinkCarX);
				Rule.CheackYX(BlueCarY, GreenCarX);
				Rule.CheackYX(BlueCarY, BrownCarX);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		RedTruckY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.Cheack3Y3X(RedTruckY, VanX);
				Rule.Cheack3Y3X(RedTruckY, BlueTruckX);
				Rule.Cheack3YX(RedTruckY, myCar);
				Rule.Cheack3YX(RedTruckY, PinkCarX);
				Rule.Cheack3YX(RedTruckY, BrownCarX);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
			
		BlueTruckX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.Cheack3XY(BlueTruckX, PinkCarY);
				Rule.Cheack3XY(BlueTruckX, LightGreenCarY);
				Rule.Cheack3XY(BlueTruckX, YellowCarY);
				Rule.Cheack3XY(BlueTruckX, BlueCarY);
				Rule.Cheack3X3Y(BlueTruckX, RedTruckY);
				
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		VanX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.Cheack3XY(VanX, PinkCarY);
				Rule.Cheack3XY(VanX, LightGreenCarY);
				Rule.Cheack3XY(VanX, YellowCarY);
				Rule.Cheack3XY(VanX, BlueCarY);
				Rule.Cheack3X3Y(VanX, RedTruckY);
				
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		add(myCar);
		add(GreenCarX);
		add(BrownCarX);
		add(RedTruckY);
		add(PinkCarY);
		add(PinkCarX);
		add(BlueTruckX);
		add(YellowCarY);
		add(BlueCarY);
		add(VanX);
		add(LightGreenCarY);
		GamePlay.t.start();
		
		
	}
	
}

