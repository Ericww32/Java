package week11;

import static org.junit.Assert.*;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import org.junit.Test;

/**
 * Tests the week11 application
 * 
 * @author Scott LaChance
 *
 */
public class Week11JUnitTest
{
	/**
	 * Pass in invalid guesses and get an InvalidArgumentException
	 */
	@Test
	public void testFileProcessing()
	{
		trace("testFileProcessing");
		
		FileProcessor processor = new FileProcessor();
		try
		{
			String testText = generateRandomString();
			String path = processor.saveTextContent(testText);
			//String path = processor.saveTextContent2(testText);
			trace("Filepath: " + path);
			
			// verify the file was created
			File actualFile = new File(path);
			if( !actualFile.exists())
			{
				fail(path + " doesn't exist");
			}
			
			if(!verifyFile(actualFile))
			{
				fail("File didn't verify successfully");
			}
		}
		catch(FileProcessingException ex)
		{
			fail("FileProcessingException " + ex.getMessage());
		}
		catch(Exception ex)
		{
			fail("FileProcessingException " + ex.getMessage());
		}
	}
	
	/**
	 * Verifies the list is sorted smallest to largest
	 * @param list list to verify
	 * @return true if sorted, otherwise false
	 */
    private boolean verifyFile(File file)
    {
        boolean result = true;

        FileReader reader = null;
        try
        {
        	reader = new FileReader(file);
        	BufferedReader bReader = new BufferedReader(reader);
        	String line = "";
        	
        	String line1 = bReader.readLine();
        	String line2 = bReader.readLine();
        	String line3 = bReader.readLine();
        	String line4 = bReader.readLine();
        	
        	boolean first = "Week11 Test text".equals(line1.trim());
        	boolean two = "Second line of the test text".equals(line2.trim());
        	boolean three = "Third line 1234567890-=`~!@#$%^&*()_+qwertyuiop[]\\{}|asdfghjkl;':\"zxcvbnm,./<>?".equals(line3.trim());
        	boolean four = line4.trim().length() > RANDOM_TEXT_SIZE;
        	
        	result = first && two && three && four;
        }
        catch(IOException ex)
        {
        	result = false;
        }
        finally
        {
        	if(reader != null)try{reader.close();}catch(Exception ex){}
        }

        return result;
    }		
	
	/**
	 * Generates a string of random printable characters
	 * @return A random string of characters
	 */
	private String generateRandomString()
	{
		StringBuilder builder = new StringBuilder(RANDOM_TEXT_SIZE);
		Random rand = new Random();   
		for(int index = 0; index < RANDOM_TEXT_SIZE; index++)
		{
			int val = rand.nextInt(ASCII_TABLE_SIZE) + ASCII_PRINTABLE_OFFSET;    
			builder.append((char)val);
		}
		
		String text = TEST_TEXT + builder.toString();
		return text;
	}
	
	private void trace(String msg)
	{
		System.out.println(msg);
	}
	
	private static int RANDOM_TEXT_SIZE = 10000; // printable characters
	private static int ASCII_TABLE_SIZE = 95; // printable characters
	private static int ASCII_PRINTABLE_OFFSET = 32;
	private static String TEST_TEXT = 
  "Week11 Test text\n"
+ "Second line of the test text\n"
+ "Third line 1234567890-=`~!@#$%^&*()_+qwertyuiop[]\\{}|asdfghjkl;':\"zxcvbnm,./<>?\n"
+ "Fourth line random data: "		  
			;			
}


