
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

public class Map10 extends JPanel{	
	Image bg;
	@Override
	public void paintComponent(Graphics g){		
		ImageIcon i = new ImageIcon("images/BG.png");
		bg = i.getImage();
		g.drawImage(bg,0, 0, getWidth(), getHeight(), null);				
	}
	Map10(){
		GamePlay.count=120;
		setLayout(null);	
		CarX myCar=new CarX(new ImageIcon("images/MyCar.png"),300,225);
		CarX GreenCarX=new CarX(new ImageIcon("images/DarkGreenCarX.png"),75,75);
		CarX BrownCarX=new CarX(new ImageIcon("images/BrownCarX.png"),225,75);
		CarX BlueCarX=new CarX(new ImageIcon("images/BlueCarX.png"),225,150);
		CarX YellowCarX=new CarX(new ImageIcon("images/YellowCarX.png"),75,450);
		CarY PinkCarY=new CarY(new ImageIcon("images/PinkCarY.png"),75,150);
		CarY LightGreenCarY=new CarY(new ImageIcon("images/LightGreenCarY.png"),150,150);
		CarY YellowCarY=new CarY(new ImageIcon("images/YellowCarY.png"),375,75);
		Car3X BlueTruckX=new Car3X(new ImageIcon("images/BlueTruckX.png"),300,300);
		Car3Y RedTruckY=new Car3Y(new ImageIcon("images/RedTruckY.png"),225,300);
		Car3Y VanY=new Car3Y(new ImageIcon("images/VanY.png"),450,75);
		
		
		myCar.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackXY(myCar, PinkCarY);
				Rule.CheackXY(myCar, LightGreenCarY);
				Rule.CheackXY(myCar, YellowCarY);
				Rule.CheackX3Y(myCar, RedTruckY);
				Rule.CheackX3Y(myCar, VanY);
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
				Rule.CheackX3Y(GreenCarX, RedTruckY);
				Rule.CheackX3Y(GreenCarX, VanY);
			
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
				Rule.CheackX3Y(BrownCarX, RedTruckY);
				Rule.CheackX3Y(BrownCarX, VanY);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		BlueCarX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackXY(BlueCarX, PinkCarY);
				Rule.CheackXY(BlueCarX, LightGreenCarY);
				Rule.CheackXY(BlueCarX, YellowCarY);
				Rule.CheackX3Y(BlueCarX, RedTruckY);
				Rule.CheackX3Y(BlueCarX, VanY);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		YellowCarX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackXY(YellowCarX, PinkCarY);
				Rule.CheackXY(YellowCarX, LightGreenCarY);
				Rule.CheackXY(YellowCarX, YellowCarY);
				Rule.CheackX3Y(YellowCarX, RedTruckY);
				Rule.CheackX3Y(YellowCarX, VanY);
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
				Rule.Cheack3YX(RedTruckY, YellowCarX);
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
				Rule.CheackYX(PinkCarY, YellowCarX);
				Rule.CheackY3X(PinkCarY, BlueTruckX);
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
				Rule.CheackYX(LightGreenCarY, YellowCarX);
				Rule.CheackY3X(LightGreenCarY, BlueTruckX);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
	
		YellowCarY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackYX(YellowCarY, myCar);
				Rule.CheackYX(YellowCarY, BlueCarX);
				Rule.CheackYX(YellowCarY, GreenCarX);
				Rule.CheackYX(YellowCarY, BrownCarX);
				Rule.CheackYX(YellowCarY, YellowCarX);
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
				Rule.Cheack3X3Y(BlueTruckX, RedTruckY);
				Rule.Cheack3X3Y(BlueTruckX, VanY);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		VanY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.Cheack3YX(VanY, myCar);
				Rule.Cheack3YX(VanY, GreenCarX);
				Rule.Cheack3YX(VanY, BrownCarX);
				Rule.Cheack3YX(VanY, BlueCarX);
				Rule.Cheack3YX(VanY, YellowCarX);
				Rule.Cheack3Y3X(VanY, BlueTruckX);

			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		
		
		add(myCar);
		add(GreenCarX);
		add(BrownCarX);
		add(BlueCarX);
		add(YellowCarX);
		add(PinkCarY);
		add(LightGreenCarY);
		add(YellowCarY);
		add(RedTruckY);
		add(BlueTruckX);
		add(VanY);
		
		
	}
	
	
}