package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph {

	BufferedImage img;

	ImageMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub

		try {
			img = ImageIO.read(new File("src/_03_polymorphs/smile2.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(img, 50, 50, null);
	}

}
