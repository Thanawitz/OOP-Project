
import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import sun.audio.*;
import java.io.*;
public  class GamePlay {
	public static int level=1,count;
	public static JFrame game;
	public static JPanel p1,p2,p3,p4,p5,map;
	public static JLabel time,TIME,stage;
	public static Timer t;
	public static JButton rebtn,nextbtn;
	public static boolean move=true;
	public static Font myFont;
	public static CountTime C;
	class CountTime extends JPanel implements ActionListener{	
		Image bg;
		@Override
		public void paintComponent(Graphics g){		
			super.paintComponent(g);
			ImageIcon i = new ImageIcon("images/JOJOStart.png");
			
			if(!move&&count>-1){
				i = new ImageIcon("images/JOJOWin.png");
			}
			else if(GamePlay.count>30){
				i = new ImageIcon("images/JOJOStart.png");
			}
			else if(GamePlay.count==-1){
				i = new ImageIcon("images/JOJOGameover.png");
			}
			else if(GamePlay.count<30){
				i = new ImageIcon("images/JOJOHurry.png");
			}
			bg = i.getImage();
			g.drawImage(bg,0, 0, getWidth(), getHeight(), null);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			p3.remove(time);
			time=new JLabel(Integer.toString(count), SwingConstants.CENTER);
			time.setForeground ( Color.WHITE );
			p3.remove(stage);
			stage=new JLabel("Stage  "+Integer.toString(level), SwingConstants.CENTER);
			stage.setForeground ( Color.WHITE );
			try
			{
				myFont = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "font/DSN RATBURANA.ttf" ) );
				myFont = myFont.deriveFont ( Font.BOLD, 55 );
				time.setFont(myFont);
				myFont = myFont.deriveFont ( Font.BOLD, 40 );
				stage.setFont(myFont);
			}
			catch ( Exception error ){}
			p3.add(time,BorderLayout.CENTER);		
			p3.add(stage,BorderLayout.SOUTH);			
			p3.revalidate();
			if(count==0){
				move=false;
				sound.lose();
				t.stop();
			}
			repaint();
			count--;
		}
		
	}
	GamePlay(){
		game=new JFrame();	
		p1=new JPanel(new BorderLayout());
		p2=new JPanel(new BorderLayout());
		p3=new JPanel(new BorderLayout());
		p4=new JPanel(new BorderLayout());
		p5=new JPanel(new GridLayout(2,1));
		C=new CountTime();
		t=new Timer(1000,C);
		rebtn=new JButton(new ImageIcon("images/rebtn.png"));
		nextbtn=new JButton(new ImageIcon("images/nextbtn.png"));
		map=new Map();
		TIME=new JLabel(new ImageIcon("images/time.png"));
		time=new JLabel();
		stage=new JLabel();
		p3.setBackground(Color.BLACK);
		p5.setBackground(Color.BLACK);
		p5.setPreferredSize(new Dimension(200,100));
		p5.add(rebtn);	
		p5.add(nextbtn);
		p4.setPreferredSize(new Dimension(200,375));
		p4.add(C);
		p3.setPreferredSize(new Dimension(200,125));
		p3.add(TIME,BorderLayout.NORTH);
		p3.add(time,BorderLayout.CENTER);
		p3.add(stage,BorderLayout.SOUTH);
		p2.add(p3,BorderLayout.NORTH);
		p2.add(p4,BorderLayout.CENTER);
		p2.add(p5,BorderLayout.SOUTH);
		p1.setPreferredSize(new Dimension(600,600));
		p1.add(map,BorderLayout.CENTER);
		game.add(p1,BorderLayout.CENTER);
		game.add(p2,BorderLayout.EAST);
		rebtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				p1.remove(map);
				t.stop();
				sound.click();
				if(level==1){
					GamePlay.move=true;
					map=new Map();
				}
				else if(level==2){
					GamePlay.move=true;
					map=new Map2();
				}
				else if(level==3){
					GamePlay.move=true;
					map=new Map3();
				}
				else if(level==4){
					GamePlay.move=true;
					map=new Map4();
				}
				else if(level==5){
					GamePlay.move=true;
					map=new Map5();
				}
				else if(level==6){
					GamePlay.move=true;
					map=new Map6();
				}
				else if(level==7){
					GamePlay.move=true;
					map=new Map7();
				}
				else if(level==8){
					GamePlay.move=true;
					map=new Map8();
				}
				else if(level==9){
					GamePlay.move=true;
					map=new Map9();
				}
				else if(level==10){
					GamePlay.move=true;
					map=new Map10();
				}
				else{
					GamePlay.move=true;
					map=new Map();
					level=1;
					sound.music2();
				}
				p3.remove(time);
				time=new JLabel(Integer.toString(count), SwingConstants.CENTER);
				time.setForeground ( Color.WHITE );
				try
				{
					myFont = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "font/DSN RATBURANA.ttf" ) );
					myFont = GamePlay.myFont.deriveFont ( Font.BOLD, 55 );
					time.setFont(myFont);
				}
				catch ( Exception error ){}
				p3.add(time,BorderLayout.CENTER);			
				p3.revalidate();
				count--;
				p1.add(map,BorderLayout.CENTER);			
		        p1.revalidate();
		        C.repaint();
		        t.start();
			}			
		});
		nextbtn.setVisible(false);
		nextbtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				level++;
				p1.remove(map);
				t.stop();
				sound.click();
				
				if(level==1){
					GamePlay.move=true;
					map=new Map();
				}
				else if(level==2){
					GamePlay.move=true;
					map=new Map2();
				}
				else if(level==3){
					GamePlay.move=true;
					map=new Map3();
				}
				else if(level==4){
					GamePlay.move=true;
					map=new Map4();
				}
				else if(level==5){
					GamePlay.move=true;
					map=new Map5();
				}
				else if(level==6){
					GamePlay.move=true;
					map=new Map6();
				}
				else if(level==7){
					GamePlay.move=true;
					map=new Map7();
				}
				else if(level==8){
					GamePlay.move=true;
					map=new Map8();
				}
				else if(level==9){
					GamePlay.move=true;
					map=new Map9();
				}
				else if(level==10){
					GamePlay.move=true;
					map=new Map10();
				}
				else{
					map=new TheEnd();
				}
				p3.remove(time);
				time=new JLabel(Integer.toString(count), SwingConstants.CENTER);
				time.setForeground ( Color.WHITE );
				p3.remove(stage);
				stage=new JLabel("Stage  "+Integer.toString(level), SwingConstants.CENTER);
				stage.setForeground ( Color.WHITE );
				try
				{
					GamePlay.myFont = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "font/DSN RATBURANA.ttf" ) );
					GamePlay.myFont = GamePlay.myFont.deriveFont ( Font.BOLD, 55 );
					GamePlay.time.setFont(GamePlay.myFont);
					GamePlay.myFont = GamePlay.myFont.deriveFont ( Font.BOLD, 40 );
					GamePlay.stage.setFont(GamePlay.myFont);
				}
				catch ( Exception error ){}
				p3.add(time,BorderLayout.CENTER);		
				p3.add(stage,BorderLayout.SOUTH);			
				p3.revalidate();
				count--;
				p1.add(map,BorderLayout.CENTER);			
		        p1.revalidate();
		        C.repaint();
		        nextbtn.setVisible(false);
			}			
		});
		t.start();
		sound.music2();
		game.setSize(800, 630);
		game.setLocationRelativeTo(null);
		game.setResizable(false);
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		game.setVisible(true);
	}	
}
