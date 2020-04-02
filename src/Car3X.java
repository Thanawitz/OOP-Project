
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Car3X extends JLabel  implements MouseMotionListener,MouseListener{
	private int xPos,yPos;
	Car3X(ImageIcon x,int X,int Y){
		super(x);
		xPos=X;
		yPos=Y;
		setBounds(xPos,yPos, 235, 75);
		addMouseMotionListener(this);
		addMouseListener(this);
	}	
	private boolean Left=true,Right=true;
	
	public void mouseMoved(MouseEvent me){
	}
	public void mouseDragged(MouseEvent me){
		if(me.getX()<112&&Left&&getX()>=75&&GamePlay.move){
			setLocation(getX()-10, yPos);			
			this.Right=true;
			repaint();}
		else if(me.getX()>112&&Right&&getX()<=300&&GamePlay.move){
			setLocation(getX()+10, yPos);
			this.Left=true;
			repaint();}				
	}
	public void setLeft(boolean x){this.Left=x;}
	public boolean getLeft(){return this.Left;}
	public void setRight(boolean x){this.Right=x;}
	public boolean getRight(){return this.Right;}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {
		if(getX()<=115){setLocation(75, yPos);}
		else if(getX()<=190){setLocation(150, yPos);}
		else if(getX()<=265){setLocation(225, yPos);}
		else if(getX()<=340||getX()>340){setLocation(300, yPos);}
		this.Right=true;
		this.Left=true;
	}	
}
