package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePoly extends Polymorph{

	CirclePoly(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	int a = 90;
	boolean s = true;
	public void update() {
		
		
		
	
		setX((int) (50*Math.sin(a)) + 250);
		
		setY((int) (50*Math.cos(a)) + 250);
		a--;
		
		
		
		//System.out.println(getX() + "update" + getY() + " a = " + a);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), 15, 15);
		//System.out.println(getX() + " " + getY());
		
		
	}

}
