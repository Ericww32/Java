package week08;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;


public class Week08JUnitTest {
	/**
	 * Nano will appear whenever an incorrect number was entered. Pico will
	 * appear whenever a correct number is entered but it is in the wrong
	 * position. Fermi will appear whenever a correct number is entered in the
	 * correct position.
	 */
	private String[] names = new String[]{"Fermi", "Pico", "Nano"};
	private FermiGame fermi = new FermiGame(names[0], names[1], names[2]);
	private boolean[] lockGuess;
	private ArrayList<Integer> goodInts = new ArrayList<Integer>();
	private ArrayList<Integer> badInts = new ArrayList<Integer>();
	private int[] guesses = new int[] {0, 0, 0};
	
	@Test
	public void run() throws InvalidArgumentException {
		try {
			fermi.newGame();
			resetKnownFlags(true);
			
			while(!(fermi.isWinner())){
				generateRandomNum();
			};
			
		} catch (InvalidArgumentException e) {
			e.printStackTrace();
		}
	}

	private void generateRandomNum() throws InvalidArgumentException {

		do {
			Random m_Random = new Random();
			
			for (int i = 0; i < 3; i++) {
				if (!lockGuess[i]) {
					guesses[i] = m_Random.nextInt(9) + 1;
				}
			}
		} while (!allUnique(guesses) || !goodsReused(guesses, goodInts) || badsReused(guesses, badInts));
		
		resetKnownFlags(false);

		try {
			String[] results = fermi.guess(guesses[0], guesses[1], guesses[2]);//trying my guesses in the game
			System.out.println(String.format("Guess: %d, %d, %d", guesses[0], guesses[1], guesses[2]));//Prints guesses
			String output = "";
			for(int i = 0; i < results.length; i++) {
				output += results[i] + " ";
				
				if (results[i].equals("Fermi")) {
					lockGuess[i] = true;
					addGoodInt(guesses[i]);
				} else if (results[i].equals("Pico")) {
					addGoodInt(guesses[i]);
				} else {
					addBadInt(guesses[i]);
				}
			}

			System.out.println(output);
			
			if(fermi.isWinner()) {
				System.out.println("**********************\nWinner!\n**********************");
			}
		} catch (InvalidArgumentException e) {
			e.printStackTrace();
		}
	}
	
	private void addGoodInt(int i) {
		goodInts.add(i);
	}

	private void addBadInt(int i) {
		badInts.add(i);
	}

	private boolean allUnique(int[] guesses) {
		return (guesses[0] != guesses[1] && guesses[0] != guesses[2] && guesses[1] != guesses[2]);
	}
	
	private boolean goodsReused(int[] newGuesses, ArrayList<Integer> goodGuesses) {
		int targetCount = goodGuesses.size();
		int matches = 0;
		
		for (int i = 0; i < 3; i++) {
			if (goodGuesses.contains(newGuesses[i])) {
				matches++;
			}
		}
		
		return (targetCount == matches);
	}
	
	private boolean badsReused(int[] newGuesses, ArrayList<Integer> badGuesses) {
		int matches = 0;
		
		for (int i = 0; i < 3; i++) {
			if (badGuesses.contains(newGuesses[i])) {
				matches++;
			}
		}
		
		return (matches > 0);
	}
	
	public void resetKnownFlags(boolean newGame) {
		if (newGame) {
			lockGuess = new boolean[] {false, false, false};
			badInts.clear();
		}
		
		goodInts.clear();
	}
}