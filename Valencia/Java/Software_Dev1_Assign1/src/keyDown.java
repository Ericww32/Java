import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

private class keyDown extends KeyAdapter implements Station {
		public void keyPressed (KeyEvent e) {
			char key = e.getKeyChar();
			switch (key) {
				case 'j': station.moveLeft(); break;
				case 'k': station.moveRight(); break;
				case ' ': station.fire(rockets); break;
				case 'q': System.exit(0);
			}
		}
	}