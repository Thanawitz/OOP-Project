
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Car3Y extends JLabel  implements MouseMotionListener,MouseListener{
	private int xPos,yPos;
	Car3Y(ImageIcon x,int X,int Y){
		super(x);	
		xPos=X;
		yPos=Y;
		setBounds(xPos,yPos, 75, 235);
		addMouseMotionListener(this);
		addMouseListener(this);
	}	
	private boolean Up=true,Down=true;
	
	public void mouseMoved(MouseEvent me){}
	public void mouseDragged(MouseEvent me){
		if(me.getY()<112&&Up&&getY()>=75&&GamePlay.move){
			setLocation(xPos, getY()-10);
			this.Down=true;
			repaint();}
		else if(me.getY()>112&&Down&&getY()<=300&&GamePlay.move){
			setLocation(xPos, getY()+10);
			this.Up=true;
			repaint();}				
	}	
	public void setUp(boolean x){this.Up=x;}
	public boolean getUp(){return this.Up;}
	public void setDown(boolean x){this.Down=x;}
	public boolean getDown(){return this.Down;}
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
		if(getY()<=115){setLocation(xPos, 75);}
		else if(getY()<=190){setLocation(xPos, 150);}
		else if(getY()<=265){setLocation(xPos, 225);}
		else if(getY()<=340||getY()>275){setLocation(xPos, 300);}
		this.Down=true;
		this.Up=true;
	}
}
