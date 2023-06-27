package week08;

public class TestData
{
	/**
	 * This returns a string where the each word is on it's own line
	 * 
	 * @return List of words in a string
	 */
	public static String getTestData()
	{
		return builder.toString();
	}
	
	/**
	 * Gets the number of words in the test data
	 * @return number of words
	 */
	public static int count()
	{
		return m_count;
	}
	
	/**
	 * Retrieves the array of words
	 * @return String array of words in the test data
	 */
	public static String[] list()
	{
		return m_list;
	}

	private static String m_testWords = "apple,beta,bravo,charlie,faith,people,stupendous,holiday,holidays,journey,alpha,domino,tremendous,advantage,adverb,zebra,zelda,yankee"
			+ ",forever,for,ever,brief,spin,process,advance,power,protocol,pete,pat,tap,tape,taps,pats,patsy,gypsy";

	private static StringBuilder builder;
	private static int m_count = 0;
	private static String[] m_list;

	static
	{
		builder = new StringBuilder();
		m_list = m_testWords.split(",");
		
		// build the text string
		for(String word : m_list)
		{
			word = word.trim();
			if(word.length() != 0)
			{
				builder.append(word);
				builder.append(System.lineSeparator());
				m_count++;
			}
		}
	}
}
