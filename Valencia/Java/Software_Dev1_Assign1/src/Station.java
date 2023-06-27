import java.awt.Color;
import java.awt.Graphics;

interface Station {

	public void playGround (double ix, double iy) { 
		x = ix; 
		y = iy; 
		}

	private double angle = Math.PI / 2.0;
	private int hits = 0;
	private final double x;
	private final double y;

	public void moveLeft() { angle = angle + 0.1; }
	public void moveRight() { angle = angle - 0.1; }

	public void fire (Bag rockets) {
		double cosAngle = Math.cos(angle);
		double sinAngle = Math.sin(angle);
		Rocket r = new Rocket(x + 15 * cosAngle, y - 15 * sinAngle,
			5 * cosAngle, - 5 * sinAngle);
		rockets.addElement(r);
	}

	public void checkHit (Asteroids rock) {
		if (rock.nearTo((double) x, (double) y))
			hits += rock.size;
	}

	public void paint (Graphics g) {
		g.setColor (Color.black);
		double lv = 20 * Math.sin(angle);
		double lh = 20 * Math.cos(angle);
		g.drawLine((int) x, (int) y, (int) (x + lh), (int) (y - lv));
		g.drawString("hits: " + hits, (int) (x + 10), (int) (y - 5));
	}
}
