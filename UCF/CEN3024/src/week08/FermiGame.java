package week08;

import java.util.Random;


/**
 * Fermi Game implementation
 * 
 * <p>In the game the user (TestHarness) tries to guess the order of three unique
 * numbers between 1 and 9 inclusive. Prompt the game accepts input of three
 * integer numbers between 1 and 9 (inclusive) (guess method).</p>
 * 
 * <p>The application will respond with the words Nano, Pico, and Fermi in a String
 * array (String[]). Nano will appear whenever an incorrect number was entered.
 * Pico will appear whenever a correct number is entered but it is in the wrong
 * position. Fermi will appear whenever a correct number is entered in the
 * correct position.</p>
 * 
 * <p>The goal is to guess all the three numbers in the correct positions. The
 * application response when the method guess is called will be a String array
 * response with all "Fermi" strings in that case.</p>
 * 
 * <p><b>Note:</b> The Fermi string must be the one provided by the user in the
 * constructor or the default value if no override is provided. In the reference
 * implementation these are stored in the instance variables m_fermi, m_nano and
 * m_pico.</p>
 * 
 * <p>
 * Rules<br/>
 * 
 * 1. Generate three random integers between 1 and 9 inclusive. The random
 * numbers must be unique. For example, 2 5 7 is valid but 2 5 5 is not. The
 * random number generator doesn't guarantee unique numbers. You must generate
 * another random number if a duplicate is generated.
 * <br/>
 * 2. Accept three numbers (guesses) provided by the user (TestHarness). The
 * numbers must be between 1 and 9 inclusive. Note: this means the method guess
 * accepts three guesses
 * <br/>
 * 3. Compare the guesses provided to the three random numbers.
 * <br/>
 * 3a. If the first number the provided matches the first random number, assign
 * the word representing fermi (m_fermi, default is "Fermi") first in the
 * response.
 * <br/>
 * 3b. If the first number the user entered matches the second or third random
 * numbers, assign the word representing pico (m_pico, default is "Pico") first
 * in the response.
 * <br/>
 * 3c. Assign the word representing nano (m_nano, default is "Nano") first in
 * the response if the first number the user entered doesn't match any of the
 * three random numbers.
 * <br/>
 * Use the same logic for guesses at the other two positions.
 * <br/>
 * 4. Keep track of whether the user won. The reference implementation uses
 * m_wonGame. This is used by the method isWinner.
 * <br/>
 * 5. Allow the user to provide another guess again after each application
 * feedback of Nano, Pico, Fermi.
 * <br/>
 * 6. The design uses the TestHarness to call the FermiGame class you implement.
 * The UML defines the methods and signatures for the FermiGame class. Your
 * implementation will need to provide the game logic in the guess method, the
 * random number initialization, and keep track of whether the user has won.
 * <br/>
 * Review the TestHarness implementation to see how it calls the FermiGame
 * methods.
 * </p>
 * 
 * @author slachanc
 * 
 */
public class FermiGame
{
	/**
	 * Default constructor
	 */
	public FermiGame()
	{
		this("Fermi", "Pico", "Nano");
	}

	/**
	 * Assign user defined values to replace fermi, pico, nano
	 * 
	 * @param fermi
	 *            String to use in place of fermi
	 * @param pico
	 *            String to use in place of pico
	 * @param nano
	 *            String to use in place of nano
	 */
	public FermiGame(String fermi, String pico, String nano)
	{
		validateParameters(fermi, pico, nano);
	}

	/**
	 * Initialize new game Resets internal variables and generates a new set of
	 * random integers
	 */
	public void newGame()
	{
		m_wonGame = false;
		generateRandomIntegers();
	}

	/**
	 * Process a user guess
	 * 
	 * @param one
	 *            Position one guess
	 * @param two
	 *            Position two guess
	 * @param three
	 *            Position three guess
	 * @return A string array of the responses matching position 1,2 and 3.
	 * @throws InvalidArgumentException if the guesses are out of range
	 */
	public String[] guess(int one, int two, int three)
			throws InvalidArgumentException
	{
		String result[] = null;// RANGE_ERROR;
		if(validateGuess(one, two, three))
		{
			// Used for testing to help validate processing
//			System.out.println(String.format("-- Game:  %d %d %d", m_random[0],
//					m_random[1], m_random[2]));
//			System.out.println(String.format("-- Guess: %d %d %d", one, two,
//					three));

			String response1 = testMatch(one, 0);
			String response2 = testMatch(two, 1);
			String response3 = testMatch(three, 2);

			if(response1.endsWith(m_fermi) && response2.endsWith(m_fermi)
					&& response3.endsWith(m_fermi))
			{
				m_wonGame = true;
			}

			result = new String[] { response1, response2, response3 };
		}

		return result;
	}

	/**
	 * Checks the won/loss state.
	 * 
	 * @return 1 if winner, otherwise 0
	 */
	public boolean isWinner()
	{
		return m_wonGame;
	}

	/**
	 * Validates the guesses. They must be between 1 through 9 inclusive
	 * 
	 * @param one
	 *            Guess one
	 * @param two
	 *            Guess two
	 * @param three
	 *            Guess three
	 * @return true if valid guesses, otherwise an exception is thrown
	 * @throws InvalidArgumentException
	 *             Thrown if an invalid guess is provided
	 */
	private boolean validateGuess(int one, int two, int three)
			throws InvalidArgumentException
	{
		boolean result1 = true;
		boolean result2 = true;
		boolean result3 = true;

		String msg = "";

		if(!(MIN < one && one < MAX))
		{
			result1 = false;
			msg = String.format("Pos %d, Value: %d", 1, one);
		}

		if(!(MIN < two && two < MAX))
		{
			result2 = false;
			msg += String.format(" Pos %d, Value: %d", 2, two);
		}

		if(!(MIN < three && three < MAX))
		{
			result3 = false;
			msg += String.format(" Pos %d, Value: %d", 3, three);
		}

		if(!(result1 && result2 && result3))
		{
			throw new InvalidArgumentException("Invalid Guess: " + msg);
		}

		// successful validation
		return true;
	}

	/**
	 * Verifies the parameters passed to the constructor are valid. If not, it
	 * sets the defaults (FERMI, PICO, NANO)
	 * 
	 * @param fermi
	 *            The fermi string to validate
	 * @param pico
	 *            The pico string to validate
	 * @param nano
	 *            The nano string to validate
	 */
	private void validateParameters(String fermi, String pico, String nano)
	{
		m_fermi = fermi != null ? fermi : FERMI;
		m_pico = pico != null ? pico : PICO;
		m_nano = nano != null ? nano : NANO;

		// check for duplicates and assign defaults
		// fermi is always used as-is
		if(m_fermi == m_pico)
		{
			m_pico = PICO;
		}

		if(m_fermi == m_nano || m_pico == m_nano)
		{
			m_nano = NANO;
		}
	}

	/**
	 * Tests whether the guess at the provided position is a match It checks the
	 * guess against the generated random values. If the guess matches the
	 * generated value at the same position, the value for fermi, stored in
	 * m_fermi is returned. If the guess is found in the generated list of
	 * values at a different position, the value for pico is returned, stored in
	 * m_pico. If the guess is not in the generated list of values, the value
	 * for nano is returned, stored in m_nano.
	 * 
	 * @param guess
	 *            The guess
	 * @param pos
	 *            The position (0, 1 or 2 representing the three positions)
	 * @return The appropriate string representing fermi, pico or nano.
	 */
	private String testMatch(int guess, int pos)
	{
		String response = m_nano;

		if(guess == m_random[pos])
		{
			response = m_fermi;
		}
		else
		{
			for(int i = 0; i < m_random.length; i++)
			{
				if(guess == m_random[i] && i != pos)
				{
					response = m_pico;
					break;
				}
			}
		}

		return response;
	}

	/**
	 * Random integers, must all be unique
	 * These are are assigned to the m_Random instance variable.
	 * 
	 */
	private void generateRandomIntegers()
	{
		int rand1;
		int rand2;
		int rand3;
		do
		{
			Random m_Random = new Random();
			rand1 = m_Random.nextInt(9) + 1;
			rand2 = m_Random.nextInt(9) + 1;
			rand3 = m_Random.nextInt(9) + 1;

		}
		while(rand1 == rand2 || rand1 == rand3 || rand2 == rand3);

		m_random = new int[] { rand1, rand2, rand3 };
		// m_random = new int[] { 2, 8, 9 };

		// Used for testing to help validate processing
		// System.out.println(String.format("-- %d %d %d", rand1, rand2,
		// rand3));
	}

	/**
	 * Holds the string value represeting the "Fermi" postion. Default is
	 * "Fermi"
	 */
	private String m_fermi = FERMI;
	/** Holds the string value represeting the "Pico" postion. Default is "Pico" */
	private String m_pico = PICO;
	/** Holds the string value represeting the "Nano" postion. Default is "Nano" */
	private String m_nano = NANO;

	/**
	 * Holds the state of the last guess. true if the guess matches all the
	 * generated values at the same position, otherwise false
	 */
	private boolean m_wonGame = false;
	/** The generated list of random integers from 1-9 inclusive for a game run. */
	private int[] m_random;

	/** The default value for fermi */
	private static String FERMI = "Fermi";
	/** The default value for pico */
	private static String PICO = "Pico";
	/** The default value for nano */
	private static String NANO = "Nano";

	/** The minimum value all generated values and guesses must be above. */
	private static int MIN = 0;
	/** The minimum value all generated values and guesses must be below. */
	private static int MAX = 10;
}
