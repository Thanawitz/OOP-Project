
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.FileInputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class Map extends JPanel{	
	Image bg;
	@Override
	public void paintComponent(Graphics g){		
		ImageIcon i = new ImageIcon("images/BG.png");
		bg = i.getImage();
		g.drawImage(bg,0, 0, getWidth(), getHeight(), null);
	}
	Map(){
		GamePlay.count=60;
		setLayout(null);	
		CarX myCar=new CarX(new ImageIcon("images/MyCar.png"),150,225);
		CarX GreenCarX=new CarX(new ImageIcon("images/DarkGreenCarX.png"),75,75);
		CarX BrownCarX=new CarX(new ImageIcon("images/BrownCarX.png"),375,375);
		Car3Y RedTruckY=new Car3Y(new ImageIcon("images/RedTruckY.png"),75,150);
		CarY PinkCarY=new CarY(new ImageIcon("images/PinkCarY.png"),75,375);
		Car3X BlueTruckX=new Car3X(new ImageIcon("images/BlueTruckX.png"),225,450);
		Car3Y VanY=new Car3Y(new ImageIcon("images/VanY.png"),450,75);
		Car3Y BlueTruckY=new Car3Y(new ImageIcon("images/BlueTruckY.png"),300,150);
		
		
		myCar.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackX3Y(myCar, RedTruckY);
				Rule.CheackX3Y(myCar, BlueTruckY);
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
				Rule.CheackX3Y(GreenCarX, RedTruckY);
				Rule.CheackX3Y(GreenCarX, BlueTruckY);
				Rule.CheackX3Y(GreenCarX, VanY);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		BrownCarX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackXY(BrownCarX, PinkCarY);
				Rule.CheackX3Y(BrownCarX, BlueTruckY);
				Rule.CheackX3Y(BrownCarX, VanY);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		RedTruckY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.Cheack3YY(RedTruckY, PinkCarY);
				Rule.Cheack3YX(RedTruckY, myCar);
				Rule.Cheack3YX(RedTruckY, GreenCarX);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		PinkCarY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.CheackY3Y(PinkCarY, RedTruckY);
				Rule.CheackY3X(PinkCarY, BlueTruckX);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		BlueTruckX.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.Cheack3XY(BlueTruckX, PinkCarY);
				Rule.Cheack3X3Y(BlueTruckX, BlueTruckY);
				Rule.Cheack3X3Y(BlueTruckX, VanY);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		VanY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.Cheack3YX(VanY, BrownCarX);
				Rule.Cheack3Y3X(VanY, BlueTruckX);
				Rule.Cheack3YX(VanY, myCar);
				Rule.Cheack3YX(VanY, GreenCarX);

			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		
		BlueTruckY.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				Rule.Cheack3YX(BlueTruckY, BrownCarX);
				Rule.Cheack3Y3X(BlueTruckY, BlueTruckX);
				Rule.Cheack3YX(BlueTruckY, myCar);
				Rule.Cheack3YX(BlueTruckY, GreenCarX);
			}
			@Override
			public void mouseMoved(MouseEvent e) {}});
		add(myCar);
		add(GreenCarX);
		add(BrownCarX);
		add(RedTruckY);
		add(PinkCarY);
		add(BlueTruckX);
		add(VanY);
		add(BlueTruckY);
	}
}

