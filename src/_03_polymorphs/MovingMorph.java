package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{

	MovingMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public void update() {
		setX(getX()+2);
		setY(getY()+2);
		//System.out.println(getX() + "update");
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), 50, 50);
		//System.out.println(getX() + " " + getY());
		
		
	}
}
