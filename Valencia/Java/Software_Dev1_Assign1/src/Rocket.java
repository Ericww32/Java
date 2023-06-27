import java.awt.Color;
import java.awt.Graphics;
import java.util.Enumeration;

class Rocket {
	public Rocket (double ix, double iy, double idx, double idy)
		{ x = ix; y = iy; dx = idx; dy = idy; }

	public double x, y;
	private double dx, dy;

	public void move (Asteroids asteroids) {
		x += dx; y += dy;
		Asteroids e = new Asteroids();
		while (e.hasMoreElements()) {
			Asteroids rock = (Asteroids) e.nextElement();
			if (rock.nearTo(x, y))
				rock.hit();
		}
	}

	public void paint (Graphics g) {
		g.setColor(Color.black);
		g.fillOval((int) x, (int) y, 5, 5);
	}
}