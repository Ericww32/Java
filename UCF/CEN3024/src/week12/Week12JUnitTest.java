package week12;

import week12.xml.XmlUtility;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import org.junit.Test;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 * Tests the week11 application
 * 
 * @author Scott LaChance
 *
 */
public class Week12JUnitTest
{
	/**
	 * Pass in invalid guesses and get an InvalidArgumentException
	 */
	@Test
	public void testXmlResponseProcessing()
	{
		trace("testXmlResponseProcessing");
		
		try
		{
			Document dom = generateResponseXmlDocument();
			Week12Object obj = XmlUtility.xmlToObject(dom);
			boolean isResponseObj = obj instanceof LoginResponse;
			
			assertTrue("Expected a LoginResponse Object", isResponseObj);		
			
			// Now try to serialize the obj
			Document actual = XmlUtility.objectToXml(obj);
			
			XMLOutputter xout = new XMLOutputter(Format.getPrettyFormat());
			StringWriter swriter = new StringWriter();
			xout.output(actual, swriter);
			String actualXml = swriter.getBuffer().toString();
			analyzeXML(TEST_RESPONSE_XML, actualXml);
			
			assertTrue("Expected XML strings to be the same", TEST_RESPONSE_XML.equals(actualXml));
		}
		catch(Week12Exception ex)
		{
			fail("Error processing XML " + ex.getMessage());
		}
		catch(JDOMException ex)
		{
			fail("Error processing XML " + ex.getMessage());
		}
		catch(IOException ex)
		{
			fail("Error processing XML " + ex.getMessage());
		}
	}		

	/**
	 * Pass in invalid guesses and get an InvalidArgumentException
	 */
	@Test
	public void testXmlRequestProcessing()
	{
		trace("testXmlRequestProcessing");
		
		try
		{
			Document dom = generateRequestXmlDocument();
			Week12Object obj = XmlUtility.xmlToObject(dom);
			boolean isRequestObj = obj instanceof LoginRequest;
			
			assertTrue("Expected a LoginRequest Object", isRequestObj);		
			
			// Now try to serialize the obj
			Document actual = XmlUtility.objectToXml(obj);
			
			XMLOutputter xout = new XMLOutputter(Format.getPrettyFormat());
			StringWriter swriter = new StringWriter();
			xout.output(actual, swriter);
			String actualXml = swriter.getBuffer().toString();
			analyzeXML(TEST_REQUEST_XML, actualXml);
			
			assertTrue("Expected XML strings to be the same", TEST_REQUEST_XML.equals(actualXml));
		}
		catch(Week12Exception ex)
		{
			fail("Error processing XML " + ex.getMessage());
		}
		catch(JDOMException ex)
		{
			fail("Error processing XML " + ex.getMessage());
		}
		catch(IOException ex)
		{
			fail("Error processing XML " + ex.getMessage());
		}
	}		

	/**
	 * Generates a string of random printable characters
	 * @return A random string of characters
	 */
	private Document generateResponseXmlDocument()
		throws JDOMException, IOException
	{
		String myxml = TEST_RESPONSE_XML;
		SAXBuilder sax = new SAXBuilder();
		Document doc;
		doc = sax.build(new StringReader(myxml));

		return doc;
	}
	
	/**
	 * Generates a string of random printable characters
	 * @return A random string of characters
	 */
	private Document generateRequestXmlDocument()
		throws JDOMException, IOException
	{
		String myxml = TEST_REQUEST_XML;
		SAXBuilder sax = new SAXBuilder();
		Document dom;
		dom = sax.build(new StringReader(myxml));
	
		return dom;
	}
	
	private void analyzeXML(String expected, String actual)
	{
		int expectedLength = expected.length();
		int actualLength = actual.length();
		
		trace("Expected XML");
		trace(expected);
		
		trace("Actual XML");
		trace(actual);
		
		String msg = String.format("Lengths (expected/actual) %d/%d", expectedLength, actualLength);
		trace(msg);
				
		boolean areEqual = expected.equals(actual);
		trace(areEqual ? "XML equal" : "XML not equal");
	}
	
	private void trace(String msg)
	{
		System.out.println(msg);
	}
	
	private static String TEST_RESPONSE_XML = 
  "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"
+ "<login-response version=\"1.0\" logged-in=\"true\" session-id=\"1234\" />\r\n";	
	
	private static String TEST_REQUEST_XML = 
  "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"
+ "<login-request version=\"1.0\" pin=\"4567\" account-id=\"123456789\" />\r\n";	
}


