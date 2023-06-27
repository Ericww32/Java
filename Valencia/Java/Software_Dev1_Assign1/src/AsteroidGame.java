import java.awt.Frame;
import java.awt.Graphics;
import java.util.Enumeration;

public class AsteroidGame extends Frame {
	static public void main (String [ ] args)
	{ AsteroidGame world = new AsteroidGame(); world.show(); world.run(); }

	public AsteroidGame () {
		setTitle("Asteroid Game"); setSize(FrameWidth, FrameHeight);
		addKeyListener (new keyDown());
		addWindowListener(new CloseQuit());
	}

	public void run () { // move pieces
		while (true) {
			movePieces();
			repaint();
			try {
				Thread.sleep(100);
			} catch (Exception e) { }
		}
	}

	private int FrameWidth = 500;
	private int FrameHeight = 400;

	private Bag asteroids = new LinkedList();
	private Bag rockets = new LinkedList();
	private Station station = new Station (FrameWidth/2, FrameHeight-20);

	public void paint (Graphics g) {
		station.paint(g);
		Enumeration e = asteroids.elements();
		while (e.hasMoreElements()) {
			Asteroid rock = (Asteroid) e.nextElement();
			rock.paint(g);
		}
		e = rockets.elements();
		while (e.hasMoreElements()) {
			Rocket rock = (Rocket) e.nextElement();
			rock.paint(g);
		}
	}

	private void movePieces () {
			// create a random new asteroid
		if (Math.random() < 0.3) {
			Asteroid newRock = new Asteroid(
				FrameWidth * Math.random(), 20,
				10 * Math.random()-5, 3 + 3 * Math.random());
			asteroids.addElement(newRock);
		}
			// then move everything
		Enumeration e = asteroids.elements();
		while (e.hasMoreElements()) {
			Asteroid rock = (Asteroid) e.nextElement();
			rock.move();
			station.checkHit(rock);
		}
		e = rockets.elements();
		while (e.hasMoreElements()) {
			Rocket rock = (Rocket) e.nextElement();
			rock.move(asteroids);
		}
	}