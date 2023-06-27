package unittest;

import static org.junit.Assert.*;

import java.util.Random;
import org.junit.Test;

public class JUnitLasVegasGame
{
	@Test
	public void test()
	{
		LasVegasGame game = new LasVegasGame();
		m_wins = 0;
		game.startSession();
		
		for(int i = 0; i < m_runs; i++)
		{
			int[] range = game.startGame();
			if( game.guess(getGuess()))
			{
				m_wins++;
			}
		}
		
		m_results = game.endGame();
		
		int wins = game.getWinnerCount();
		int losses = game.getLosersCount();
		evaluateResults(wins, losses);
//		boolean result = true;
//		double percent = (double)wins/losses;
//		trace(String.format("%02f", percent));
//		if( wins != m_wins || losses != (m_runs - m_wins) ) 
//		{
//			String msg = "  Error: win/loss count mismatch";
//			trace(msg);
//			fail(msg);
//		}
//		else if(percent < m_lowerBound || percent > m_upperbound ) // check to see if there is about a 50% average
//		{
//			String msg = String.format(
//					"  Error: expected wins/losses percent between %.2f and %.2f, got %.2f", 
//					m_lowerBound, m_upperbound, percent);
//			trace(msg);
//			fail(msg);
//		}	
	}
	
	private void evaluateResults(int wins, int losses)
	{	
		boolean result = true;
		double percent = (double)wins/losses;
		trace(String.format("%02f", percent));
		if( wins != m_wins || losses != (m_runs - m_wins) ) 
		{
			String msg = "  Error: win/loss count mismatch";
			trace(msg);
			fail(msg);
		}
		else if(percent < m_lowerBound || percent > m_upperbound ) // check to see if there is about a 50% average
		{
			String msg = String.format(
					"  Error: expected wins/losses percent between %.2f and %.2f, got %.2f", 
					m_lowerBound, m_upperbound, percent);
			trace(msg);
			fail(msg);
		}		
	}
	
	/**
	 * Randomly returns a guess.
	 * 
	 * @return a random selection of BETWEEN or NOT_BETWEEN
	 */
	private LasVegasGame.GUESS getGuess()
	{
		LasVegasGame.GUESS guess = LasVegasGame.GUESS.BETWEEN;
		
		int val = m_guess.nextInt(2);
		switch(val)
		{
			case 0:
				guess = LasVegasGame.GUESS.BETWEEN;
				break;
			case 1:
				guess = LasVegasGame.GUESS.NOT_BETWEEN;
				break;
			default:
				guess = LasVegasGame.GUESS.BETWEEN;
		}
		
		return guess;
	}
	
	private void trace(String msg)
	{
		System.out.println(msg);
	}
	
	private int m_runs = 100;
	private double m_lowerBound = 0.667;
	private double m_upperbound = 1.5;
	private int m_wins;
	private Random m_guess;
	private String m_results;

}
