package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

	Polymorph bluePoly;
	Polymorph redPoly;
	Polymorph movingPoly;
	Polymorph circlePoly;
	Polymorph mousePoly;
	Polymorph messagePoly;
	Polymorph imagePoly;

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();

		// bluePoly = new BluePolymorph(50, 50);
		// redPoly = new RedMorph(70, 30);
		// movingPoly = new MovingMorph(30, 40);

		circlePoly = new CirclePoly(150, 150);
		mousePoly = new MousePoly(150, 150);
		messagePoly = new MessageMorph(30, 30);
		imagePoly = new ImageMorph(90, 230);
		window.addMouseListener((MouseListener) mousePoly);
		window.addMouseListener((MouseListener) messagePoly);

		timer = new Timer(1000 / 30, this);
		timer.start();
		window.setVisible(true);
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		// draw polymorph
		// bluePoly.draw(g);

		// redPoly.draw(g);
		// movingPoly.draw(g);

		circlePoly.draw(g);
		mousePoly.draw(g);
		messagePoly.draw(g);
		imagePoly.draw(g);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();

		circlePoly.update();
		mousePoly.update();

		// bluePoly.update();
		// redPoly.update();
		// movingPoly.update();
	}
}
