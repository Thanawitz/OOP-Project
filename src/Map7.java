
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


public class Map7 extends JPanel {	
	Image bg;
	@Override
	public void paintComponent(Graphics g){		
		ImageIcon i = new ImageIcon("images/BG.png");
		bg = i.getImage();
		g.drawImage(bg,0, 0, getWidth(), getHeight(), null);				
	}
	Map7(){
		GamePlay.count=120;
		setLayout(null);	
		CarX myCar=new CarX(new ImageIcon("images/MyCar.png"),300,225);
		CarX LightGreenCarX=new CarX(new ImageIcon("images/LightGreenCarX.png"),75,75);
		CarX BlueCarX=new CarX(new ImageIcon("images/BlueCarX.png"),75,450);
		CarX PinkCarX=new CarX(new ImageIcon("images/PinkCarX.png"),225,75);
		CarX YellowCarX=new CarX(new ImageIcon("images/YellowCarX.png"),225,150);
		
		CarY GreenCarY=new CarY(new ImageIcon("images/DarkGreenCarY.png"),75,150);
		CarY BrownCarY=new CarY(new ImageIcon("images/BrownCarY.png"),150,225);
		CarY BlueCarY=new CarY(new ImageIcon("images/BlueCarY.png"),375,75);
		
		Car3X BlueTruckX=new Car3X(new ImageIcon("images/BlueTruckX.png"),300,300);
		
		
		Car3Y VanY=new Car3Y(new ImageIcon("images/VanY.png"),450,75);
		Car3Y RedTruckY=new Car3Y(new ImageIcon("images/RedTruckY.png"),225,225);
		
		myCar.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackXY(myCar, GreenCarY);
				Rule.CheackXY(myCar, BrownCarY);
				Rule.CheackXY(myCar, BlueCarY);
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
		
		LightGreenCarX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackXX(LightGreenCarX, PinkCarX);
				Rule.CheackXY(LightGreenCarX, GreenCarY);
				Rule.CheackXY(LightGreenCarX, BrownCarY);
				Rule.CheackXY(LightGreenCarX, BlueCarY);
				Rule.CheackX3Y(LightGreenCarX, VanY);
				Rule.CheackX3Y(LightGreenCarX, RedTruckY);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		BlueCarX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackXY(BlueCarX, GreenCarY);
				Rule.CheackXY(BlueCarX, BrownCarY);
				Rule.CheackXY(BlueCarX, BlueCarY);
				Rule.CheackX3Y(BlueCarX, VanY);
				Rule.CheackX3Y(BlueCarX, RedTruckY);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		PinkCarX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackXX(PinkCarX, LightGreenCarX);
				Rule.CheackXY(PinkCarX, GreenCarY);
				Rule.CheackXY(PinkCarX, BrownCarY);
				Rule.CheackXY(PinkCarX, BlueCarY);
				Rule.CheackX3Y(PinkCarX, VanY);
				Rule.CheackX3Y(PinkCarX, RedTruckY);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		
		YellowCarX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackXY(YellowCarX, GreenCarY);
				Rule.CheackXY(YellowCarX, BrownCarY);
				Rule.CheackXY(YellowCarX, BlueCarY);
				Rule.CheackX3Y(YellowCarX, VanY);
				Rule.CheackX3Y(YellowCarX, RedTruckY);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		GreenCarY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackYX(GreenCarY, myCar);
				Rule.CheackYX(GreenCarY, LightGreenCarX);
				Rule.CheackYX(GreenCarY, PinkCarX);
				Rule.CheackYX(GreenCarY, YellowCarX);
				Rule.CheackYX(GreenCarY, BlueCarX);
				Rule.CheackY3X(GreenCarY, BlueTruckX);
	
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		
		BrownCarY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackYX(BrownCarY, myCar);
				Rule.CheackYX(BrownCarY, LightGreenCarX);
				Rule.CheackYX(BrownCarY, PinkCarX);
				Rule.CheackYX(BrownCarY, YellowCarX);
				Rule.CheackYX(BrownCarY, BlueCarX);
				Rule.CheackY3X(BrownCarY, BlueTruckX);
	
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		BlueCarY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackYX(BlueCarY, myCar);
				Rule.CheackYX(BlueCarY, LightGreenCarX);
				Rule.CheackYX(BlueCarY, PinkCarX);
				Rule.CheackYX(BlueCarY, YellowCarX);
				Rule.CheackYX(BlueCarY, BlueCarX);
				Rule.CheackY3X(BlueCarY, BlueTruckX);
	
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		
		
		
		
		RedTruckY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				
				Rule.Cheack3YX(RedTruckY, myCar);
				Rule.Cheack3YX(RedTruckY, LightGreenCarX);
				Rule.Cheack3YX(RedTruckY, PinkCarX);
				Rule.Cheack3YX(RedTruckY, YellowCarX);
				Rule.Cheack3YX(RedTruckY, BlueCarX);
				Rule.Cheack3Y3X(RedTruckY, BlueTruckX);
			
			
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
			
		
		
		VanY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.Cheack3YX(VanY, myCar);
				Rule.Cheack3YX(VanY, LightGreenCarX);
				Rule.Cheack3YX(VanY, PinkCarX);
				Rule.Cheack3YX(VanY, YellowCarX);
				Rule.Cheack3YX(VanY, BlueCarX);
				Rule.Cheack3Y3X(VanY, BlueTruckX);
			
				
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		
		
		BlueTruckX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.Cheack3XY(BlueTruckX, GreenCarY);
				Rule.Cheack3XY(BlueTruckX, BrownCarY);
				Rule.Cheack3XY(BlueTruckX, BlueCarY);
				Rule.Cheack3X3Y(BlueTruckX, VanY);
				Rule.Cheack3X3Y(BlueTruckX, RedTruckY);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		
		
		add(myCar);
		add(LightGreenCarX);
		add(BlueCarX);
		add(YellowCarX);
		add(PinkCarX);
		
		add(GreenCarY);
		add(BrownCarY);
		add(BlueCarY);
		
		add(BlueTruckX);
		add(VanY);
		add(RedTruckY);
		GamePlay.t.start();
		
		
	}
	
}