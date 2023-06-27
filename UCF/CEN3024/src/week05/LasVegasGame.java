package week05;

import java.util.Random;

/**
 * @author Eric Willoughby
 * @date 9 February 2017
 * */

public class LasVegasGame {
	
	private int m_lowInt = 0; // low number
	private int m_hiInt = 0; // high number
	private int m_nextInt = 0; // next random number
	private int m_winners = 0; // number of wins
	private int m_losers = 0; // number of losses
	private boolean m_gameWon; // Indicates if game is won
	private Random m_random;
	private static final int MAX_RANGE = 100; // max range of numbers
	private static final String END_GAME = "Winners: %d, Losers: %d";

	public enum GUESS{
		BETWEEN, NOT_BETWEEN
	}

	public LasVegasGame() {
		m_random = new Random();
	}
	
	public void startSession(){
		m_lowInt = 0;
		m_hiInt = 0;
		m_nextInt = 0;
		m_winners = 0;
		m_losers = 0;
	}
	
	/**
	 * @return an array of two ints
	 * */
	
	public int[] startGame(){
		generateRandomInts();
		int[] range = new int[]{m_lowInt, m_hiInt};
		return range;
	}
	
	/**
	 * @param Guess
	 * @return true if the game is won
	 * */
	
	public boolean guess(GUESS guess){
		m_nextInt = m_random.nextInt(MAX_RANGE);
		if(((m_lowInt < m_nextInt && m_nextInt < m_hiInt) && guess == GUESS.BETWEEN) 
				|| (!(m_lowInt < m_nextInt && m_nextInt < m_hiInt) && guess == GUESS.NOT_BETWEEN)){
			m_winners++;
			m_gameWon = true;
		}
		else{
			m_losers++;
			m_gameWon = false;
		}
		return m_gameWon;
	}
	
	/**
	 * @return returns the string for wins/losses
	 * */
	public String endSession(){
		return String.format(END_GAME, m_winners, m_losers);
	}
	
	public int getWinnerCount(){
		return m_winners;
	}
	
	public int getLosersCount(){
		return m_losers;
	}
	
	/**
	 * generates two random ints that define the range
	 * */
	private void generateRandomInts(){
		
		int low = 1; // lowest number
		int high = 100; // highest number
		int randomNum1; // temp place holder for a value
		int randomNum2; // temp place holder for a value
		boolean flag = true; // this is to insure no equal numbers
		do{
			randomNum1 = m_random.nextInt(high-low) + low;
			randomNum2 = m_random.nextInt(high-low) + low;
			
			if(randomNum1 == randomNum2){
				flag = true;
			}
			else{
				flag = false;
			}
			
		}while(flag);
		
		
		if(randomNum1 > randomNum2){
			m_lowInt = randomNum2;
			m_hiInt = randomNum1;
		}
		else{
			m_lowInt = randomNum1;
			m_hiInt = randomNum2;
		}
		
	}
}