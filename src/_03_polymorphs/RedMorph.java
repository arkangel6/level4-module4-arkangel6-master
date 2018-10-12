package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedMorph extends Polymorph{

	private int width = 100;
	private int height = 60;
	RedMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(width, height, 50, 50);
	}  
	
	public int getWidth() {
    	return width;
    }
    
    public int getHeight() {
    	return height;
    }
    
    public void setWidth(int x) {
    	 width = x;
    }
    
    public void setHeight(int y) {
    	height = y;
    }
	
}

