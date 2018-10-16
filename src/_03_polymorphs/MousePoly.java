package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MousePoly extends Polymorph implements MouseListener{

	MousePoly(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public void update() {
		
		
	}


	public void draw(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillRect(getX(), getY(), 50, 50);
		//System.out.println(getX() + " " + getY());
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//setX(e.getX());
		//setY(e.getY());
		System.out.println(e.getX());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		setX(e.getX());
		setY(e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
