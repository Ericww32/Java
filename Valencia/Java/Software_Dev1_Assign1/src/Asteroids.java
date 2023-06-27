import java.awt.*;

class Asteroids {
	public Asteroids(double ix, double iy, double idx, double idy) {
		x = ix;
		y = iy;
		dx = idx;
		dy = idy;
	}

	public double x, y;
	public int size = 20;
	private double dx, dy;

	public void move() {
		x += dx;
		y += dy;
	}

	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.drawOval((int) x, (int) y, size, size);
	}

	public void hit() {
		size = size - 4;
	}

	public boolean nearTo(double tx, double ty) {
		double distance = Math.sqrt((x - tx) * (x - tx) + (y - ty) * (y - ty));
		return distance < 10;
	}
}
