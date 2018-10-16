package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BluePolymorph extends Polymorph{

	private int width = 40;
	private int height = 60;
	BluePolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(50, 50, width, height);
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
