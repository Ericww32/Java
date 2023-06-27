package week08;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This class provides storage for words. It loads the dictionary provided via a
 * BufferedReader to the constructor. It creates a set of hash tables that are
 * indexed by 1 to 16 letters Pass in a single character and it will return all
 * words starting with the character, pass in two and you get words only
 * starting with the first two
 * 
 * The class provides a set of methods to query on whether a word is in the
 * dictionary, if it is a partial word, or not found.
 * 
 * 
 * @author Scott LaChance
 *
 */
public class BoggleDictionary
{
	/**
	 * Constructor to initialize the dictionary Reads a list of words from the
	 * stream, one word per line
	 * 
	 * @param reader
	 *            Text reader.
	 */
	public BoggleDictionary(BufferedReader reader) throws AtmException
	{
		initialize(reader);
	}

	/**
	 * Returns the list of words from the dictionary
	 * 
	 * @return List of words
	 */
	public List<WordEntry> getWords()
	{
		return new ArrayList<WordEntry>(m_dictionary.values());
	}

	/**
	 * Returns the number of words in the dictionary
	 * 
	 * @return count of words in the dictionary
	 */
	public int size()
	{
		return m_dictionary.values().size();
	}

	/**
	 * Checks if the string is part of a valid word.
	 * 
	 * @param partial
	 *            string to test
	 * @return true if the string is part of a word, otherwise false
	 */
	public boolean isValid(String partial)
	{
		WordEntry entry = getMapType(partial.length()).get(partial);

		// if entry exists it is valid
		return entry == null ? false : true;
	}

	 /**
	 * Checks if the string is a valid word.
	 *
	 * @param testWord word to test
	 * @return true if the string is a word, otherwise false
	 */
	 public boolean isWord(String testWord)
	 {
		 WordEntry entry = m_dictionary.get(testWord);
		 if(entry == null)
		 {
			 return false;
		 }
		 else
		 {
			 return entry.getIsWord();
		 }
	 }

	/**
	 * Initializes the dictionary
	 * 
	 * @param reader
	 *            List of words to ingest
	 * @throws AtmException
	 *             on error
	 */
	private void initialize(BufferedReader reader) throws AtmException
	{
		String word = "";
		m_dictionary = new HashMap<String, WordEntry>();
		m_oneCharMap = new HashMap<String, WordEntry>();
		m_twoCharMap = new HashMap<String, WordEntry>();
		m_threeCharMap = new HashMap<String, WordEntry>();
		m_fourCharMap = new HashMap<String, WordEntry>();
		m_fiveCharMap = new HashMap<String, WordEntry>();
		m_sixCharMap = new HashMap<String, WordEntry>();
		m_sevenCharMap = new HashMap<String, WordEntry>();
		m_eightCharMap = new HashMap<String, WordEntry>();
		m_nineCharMap = new HashMap<String, WordEntry>();
		m_tenCharMap = new HashMap<String, WordEntry>();
		m_elevenCharMap = new HashMap<String, WordEntry>();
		m_twelveCharMap = new HashMap<String, WordEntry>();
		m_thirteenCharMap = new HashMap<String, WordEntry>();
		m_fourteenCharMap = new HashMap<String, WordEntry>();
		m_fifteenCharMap = new HashMap<String, WordEntry>();
		m_sixteenCharMap = new HashMap<String, WordEntry>();

		m_mapList = new ArrayList<HashMap<String, WordEntry>>();
		m_mapList.add(m_oneCharMap);
		m_mapList.add(m_twoCharMap);
		m_mapList.add(m_threeCharMap);
		m_mapList.add(m_fourCharMap);
		m_mapList.add(m_fiveCharMap);
		m_mapList.add(m_sixCharMap);
		m_mapList.add(m_sevenCharMap);
		m_mapList.add(m_eightCharMap);
		m_mapList.add(m_nineCharMap);
		m_mapList.add(m_tenCharMap);
		m_mapList.add(m_elevenCharMap);
		m_mapList.add(m_twelveCharMap);
		m_mapList.add(m_thirteenCharMap);
		m_mapList.add(m_fourteenCharMap);
		m_mapList.add(m_fifteenCharMap);
		m_mapList.add(m_sixteenCharMap);

		try
		{
			while((word = reader.readLine()) != null)
			{
				word = word.trim();
				if(!word.equals(""))
				{
					// m_dictionary.put(word, new WordEntry(word));
					initializeWord(word);
				}
			}
		}
		catch(IOException ex)
		{
			throw new AtmException("Unexpected error reading data", ex);
		}
	}

	private void initializeWord(String word)
	{
		StringBuilder builder = new StringBuilder();
		HashMap<String, WordEntry> map = null;
		for(int index = 0; index < word.length(); index++)
		{
			char ch = word.charAt(index);
			builder.append(ch);
			String key = builder.toString();
			int len = key.length();
			boolean isWord = len == word.length(); // only words are passed in.

			map = getMapType(len);
			
			if(map != null && !map.containsKey(key))
			{
				map.put(key, new WordEntry(key, isWord));
			}

			if(isWord)
			{
				m_dictionary.put(word, new WordEntry(word, true));
			}
		}
	}

	private HashMap<String, WordEntry> getMapType(int index)
	{
		if(index <= MAX_WORD_LEN)
			return m_mapList.get(index - 1);
		else
			return null;
	}

	private HashMap<String, WordEntry> m_dictionary;
	private HashMap<String, WordEntry> m_oneCharMap;
	private HashMap<String, WordEntry> m_twoCharMap;
	private HashMap<String, WordEntry> m_threeCharMap;
	private HashMap<String, WordEntry> m_fourCharMap;
	private HashMap<String, WordEntry> m_fiveCharMap;
	private HashMap<String, WordEntry> m_sixCharMap;
	private HashMap<String, WordEntry> m_sevenCharMap;
	private HashMap<String, WordEntry> m_eightCharMap;
	private HashMap<String, WordEntry> m_nineCharMap;
	private HashMap<String, WordEntry> m_tenCharMap;
	private HashMap<String, WordEntry> m_elevenCharMap;
	private HashMap<String, WordEntry> m_twelveCharMap;
	private HashMap<String, WordEntry> m_thirteenCharMap;
	private HashMap<String, WordEntry> m_fourteenCharMap;
	private HashMap<String, WordEntry> m_fifteenCharMap;
	private HashMap<String, WordEntry> m_sixteenCharMap;

	private List<HashMap<String, WordEntry>> m_mapList;

	private static int MAX_WORD_LEN = 16;
}

class WordEntry
{
	/**
	 * Creates a new word entry. The word may be a partial word. Defaults to
	 * false as a full word.
	 * 
	 * @param wordPart
	 *            Partial word string to identify
	 */
	WordEntry(String wordPart)
	{
		this(wordPart, false);
	}

	/**
	 * Creates a new word entry. The word may be a partial word oe a full word
	 * User specifies if the word is a full word by passing true
	 * 
	 * @param wordPart
	 *            Partial word string to identify
	 * @param isWord
	 *            true if a word, otherwise false indicating a partial word
	 */
	WordEntry(String wordPart, boolean isWord)
	{
		m_wordPart = wordPart;
		m_isWord = isWord;
	}

	// Getters
	/**
	 * Gets the partial or complete word string
	 * 
	 * @return The partial word or word
	 */
	public String getWordPart()
	{
		return m_wordPart;
	}

	/**
	 * Gets the partial or complete word string
	 * 
	 * @return The partial word or word
	 */
	public boolean getIsWord()
	{
		return m_isWord;
	}

	// Setters
	/**
	 * Sets whether the word is a full word or partial word.
	 * 
	 * @param isWord
	 *            true is a full word, false is a partial word
	 */
	public void setIsWord(boolean isWord)
	{
		m_isWord = isWord;
	}

	/**
	 * Provides a formatted representation of the state of WordEntry
	 */
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return String.format("%s - %s", m_wordPart, m_isWord);
	}

	private String m_wordPart;
	private boolean m_isWord;
}
