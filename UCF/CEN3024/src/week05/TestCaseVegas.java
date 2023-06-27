package week05;

import java.util.Random;
import test.AbstractTestCase;

public class TestCaseVegas extends AbstractTestCase
{
	protected TestCaseVegas()
	{
		super("TestCaseVegas");
		m_wins = 0;
		m_guess = new Random();
	}

	@Override
	protected boolean runTest()
	{
		boolean result = true;
		
		LasVegasGame game = new LasVegasGame();
		m_wins = 0;
		game.startSession();
		
		for(int i = 0; i < m_runs; i++)
		{
			int[] range = game.startGame();
			int low = range[0];
			int high = range[1];
			if(low >= high || low == 0 || high == 0 )
			{
				String msg = String.format("  Low %d, High %d", low, high);
				trace("  Error: High/Low INTs don't match specification requirements");
				trace(msg);
				result = false;
			}
			else if( game.guess(getGuess())) // only execute if the random INTs are good
			{
				m_wins++;
			}
		}
		
		m_results = game.endSession();
		int wins = game.getWinnerCount();
		int losses = game.getLosersCount();
		
		
		double percent = (double)wins/losses;
		trace(String.format("%02f", percent));
		if( wins != m_wins || losses != (m_runs - m_wins) ) 
		{
			trace("  Error: win/loss count mismatch");
			result = false;
		}
		else if(percent < m_lowerBound || percent > m_upperbound ) // check to see if there is about a 50% average
		{
			trace(
					String.format(
							"  Error: expected wins/losses percent between %.2f and %.2f, got %.2f", 
							m_lowerBound, m_upperbound, percent));
		}
		
		return result;
	}

	@Override
	protected String results()
	{
		String fmt = "Game results: %s\r\nTest Results: Won %d of %d runs";
		String outputString = String.format(fmt, m_results, m_wins, m_runs);
		return outputString;
	}
	
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
	
	private int m_runs = 100;
	private double m_lowerBound = 0.667;
	private double m_upperbound = 1.5;
	private int m_wins;
	private Random m_guess;
	private String m_results;

}
