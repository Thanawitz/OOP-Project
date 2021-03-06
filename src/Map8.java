
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

public class Map8 extends JPanel{	
	Image bg;
	@Override
	public void paintComponent(Graphics g){		
		ImageIcon i = new ImageIcon("images/BG.png");
		bg = i.getImage();
		g.drawImage(bg,0, 0, getWidth(), getHeight(), null);				
	}
	Map8(){
		GamePlay.count=120;
		setLayout(null);	
		CarX myCar=new CarX(new ImageIcon("images/MyCar.png"),150,225);
		CarX GreenCarX=new CarX(new ImageIcon("images/DarkGreenCarX.png"),375,300);
		CarX BrownCarX=new CarX(new ImageIcon("images/BrownCarX.png"),225,375);
		CarX BlueCarX=new CarX(new ImageIcon("images/BlueCarX.png"),375,150);
		CarY PinkCarY=new CarY(new ImageIcon("images/PinkCarY.png"),450,375);
		CarY LightGreenCarY=new CarY(new ImageIcon("images/LightGreenCarY.png"),225,75);
		CarY YellowCarY=new CarY(new ImageIcon("images/YellowCarY.png"),75,150);
		CarY BlueCarY=new CarY(new ImageIcon("images/BlueCarY.png"),150,300);
		CarY GreenCarY=new CarY(new ImageIcon("images/DarkGreenCarY.png"),75,375);
		Car3X VanX=new Car3X(new ImageIcon("images/VanX.png"),300,75);
		Car3X BlueTruckX=new Car3X(new ImageIcon("images/BlueTruckX.png"),150,450);
		Car3Y RedTruckY=new Car3Y(new ImageIcon("images/RedTruckY.png"),300,150);
		
		
		myCar.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackXY(myCar, PinkCarY);
				Rule.CheackXY(myCar, LightGreenCarY);
				Rule.CheackXY(myCar, YellowCarY);
				Rule.CheackXY(myCar, GreenCarY);
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
				Rule.CheackXY(GreenCarX, PinkCarY);
				Rule.CheackXY(GreenCarX, LightGreenCarY);
				Rule.CheackXY(GreenCarX, YellowCarY);
				Rule.CheackXY(GreenCarX, GreenCarY);
				Rule.CheackXY(GreenCarX, BlueCarY);
				Rule.CheackX3Y(GreenCarX, RedTruckY);
			
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		BrownCarX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackXY(BrownCarX, PinkCarY);
				Rule.CheackXY(BrownCarX, LightGreenCarY);
				Rule.CheackXY(BrownCarX, YellowCarY);
				Rule.CheackXY(BrownCarX, GreenCarY);
				Rule.CheackXY(BrownCarX, BlueCarY);
				Rule.CheackX3Y(BrownCarX, RedTruckY);
				
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		BlueCarX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackXY(BlueCarX, PinkCarY);
				Rule.CheackXY(BlueCarX, LightGreenCarY);
				Rule.CheackXY(BlueCarX, YellowCarY);
				Rule.CheackXY(BlueCarX, GreenCarY);
				Rule.CheackXY(BlueCarX, BlueCarY);
				Rule.CheackX3Y(BlueCarX, RedTruckY);
				
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		RedTruckY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				
				Rule.Cheack3YX(RedTruckY, myCar);
				Rule.Cheack3YX(RedTruckY, GreenCarX);
				Rule.Cheack3YX(RedTruckY, BrownCarX);
				Rule.Cheack3YX(RedTruckY, BlueCarX);
				Rule.Cheack3Y3X(RedTruckY, VanX);
				Rule.Cheack3Y3X(RedTruckY, BlueTruckX);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		PinkCarY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackYX(PinkCarY, myCar);
				Rule.CheackYX(PinkCarY, BlueCarX);
				Rule.CheackYX(PinkCarY, GreenCarX);
				Rule.CheackYX(PinkCarY, BrownCarX);
				Rule.CheackY3X(PinkCarY, VanX);
				Rule.CheackY3X(PinkCarY, BlueTruckX);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		GreenCarY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackYY(GreenCarY, YellowCarY);
				Rule.CheackYX(GreenCarY, myCar);
				Rule.CheackYX(GreenCarY, BlueCarX);
				Rule.CheackYX(GreenCarY, GreenCarX);
				Rule.CheackYX(GreenCarY, BrownCarX);
				Rule.CheackY3X(GreenCarY, VanX);
				Rule.CheackY3X(GreenCarY, BlueTruckX);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		LightGreenCarY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackYX(LightGreenCarY, myCar);
				Rule.CheackYX(LightGreenCarY, BlueCarX);
				Rule.CheackYX(LightGreenCarY, GreenCarX);
				Rule.CheackYX(LightGreenCarY, BrownCarX);
				Rule.CheackY3X(LightGreenCarY, VanX);
				Rule.CheackY3X(LightGreenCarY, BlueTruckX);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		BlueCarY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackYX(BlueCarY, myCar);
				Rule.CheackYX(BlueCarY, BlueCarX);
				Rule.CheackYX(BlueCarY, GreenCarX);
				Rule.CheackYX(BlueCarY, BrownCarX);
				Rule.CheackY3X(BlueCarY, VanX);
				Rule.CheackY3X(BlueCarY, BlueTruckX);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		YellowCarY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackYY(YellowCarY, GreenCarY);
				Rule.CheackYX(YellowCarY, myCar);
				Rule.CheackYX(YellowCarY, BlueCarX);
				Rule.CheackYX(YellowCarY, GreenCarX);
				Rule.CheackYX(YellowCarY, BrownCarX);
				Rule.CheackY3X(YellowCarY, VanX);
				Rule.CheackY3X(YellowCarY, BlueTruckX);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		BlueTruckX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.Cheack3XY(BlueTruckX, PinkCarY);
				Rule.Cheack3XY(BlueTruckX, LightGreenCarY);
				Rule.Cheack3XY(BlueTruckX, YellowCarY);
				Rule.Cheack3XY(BlueTruckX, GreenCarY);
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
				Rule.Cheack3XY(VanX, GreenCarY);
				Rule.Cheack3XY(VanX, BlueCarY);
				Rule.Cheack3X3Y(VanX, RedTruckY);

			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		add(myCar);
		add(GreenCarX);
		add(BrownCarX);
		add(BlueCarX);
		add(PinkCarY);
		add(BlueCarY);
		add(GreenCarY);
		add(LightGreenCarY);
		add(YellowCarY);
		add(RedTruckY);
		add(BlueTruckX);
		add(VanX);
	}
}