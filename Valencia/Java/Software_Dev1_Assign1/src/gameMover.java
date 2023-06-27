private class gameMover extends Thread {
		public void run () {
			while (true) {
				movePieces();
				repaint();
				try {
					sleep(100);
				} catch (Exception e) { }
			}
		}
	}