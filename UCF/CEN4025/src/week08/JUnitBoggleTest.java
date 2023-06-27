package week08;

/**
 * @author Eric Willoughby
 * */

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.StringReader;
import org.junit.Test;

@SuppressWarnings("unused")
public class JUnitBoggleTest {

	public JUnitBoggleTest() {
	}

	@Test
	public void testBoggleDictionary() throws AtmException {
		StringReader sReader = new StringReader(TestData.getTestData()); // converts the TestData to a Reader
		BufferedReader reader = new BufferedReader(sReader);  // pass this to the constructor
		BoggleDictionary bd = new BoggleDictionary(reader);
	}

	@Test
	public void testGetWords() throws AtmException {
		StringReader sReader = new StringReader(TestData.getTestData()); // converts the TestData to a Reader
		BufferedReader reader = new BufferedReader(sReader);  // pass this to the constructor
		BoggleDictionary bd = new BoggleDictionary(reader);
		bd.getWords();
	}

	@Test
	public void testSize() throws AtmException {
		StringReader sReader = new StringReader(TestData.getTestData()); // converts the TestData to a Reader
		BufferedReader reader = new BufferedReader(sReader);  // pass this to the constructor
		BoggleDictionary bd = new BoggleDictionary(reader);
		bd.size();
	}

	@Test
	public void testIsValid() throws AtmException {
		String[] expectedList = TestData.list(); // the list of words
		StringReader sReader = new StringReader(TestData.getTestData()); // converts the TestData to a Reader
		BufferedReader reader = new BufferedReader(sReader);  // pass this to the constructor
		BoggleDictionary bd = new BoggleDictionary(reader);
		
		for(int i = 0; i < bd.size(); i++)
			bd.isValid(expectedList[i]);
	}

	@Test
	public void testIsWord() throws AtmException {
		String[] expectedList = TestData.list(); // the list of words
		StringReader sReader = new StringReader(TestData.getTestData()); // converts the TestData to a Reader
		BufferedReader reader = new BufferedReader(sReader);  // pass this to the constructor
		BoggleDictionary bd = new BoggleDictionary(reader);
		
		for(int i = 0; i < bd.size(); i++)
			bd.isWord(expectedList[i]);
	}

}