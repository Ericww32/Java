package week02;

import test.AbstractTestCase;
  
public class TestSequenceIdentifier
	extends AbstractTestCase
{
	/**
	 * Default constructor
	 */
	public TestSequenceIdentifier()
	{
		super("TestSequenceIdentifier");

		// other initialization code
	}

	@Override
	protected boolean runTest()
	{
		boolean result = true;
		SequenceIdentifier sequence = new SequenceIdentifier();

		try
		{
			// check for appropriate invalid state exception
			sequence.getCalculatedTerm();
			result = false;
			this.addResultMessage("Expected InvalidStateException");
			return result; 
		}
		catch(InvalidStateException ex)
		{
			// OK
		}
		
		int count = 1;
		for(TestData data : testData)
		{
			addResultMessage(String.format("Testing data set %d", count++));
			try
			{
				// Execute the sequence identifier method
				SequenceIdentifier.SEQUENCE_TYPE type = sequence
						.identifySequence(data.m_array, data.m_termIndex);

				// check the results
				if(type != data.m_expectedType)
				{
					result = false;
					String errMsg = String.format(
							"Wrong sequence identified: expected %s, actual %s",
							data.m_expectedType, type);
					this.addResultMessage(errMsg);

					continue; // go to next test data
				}
				
				if( type == SequenceIdentifier.SEQUENCE_TYPE.NONE)
				{
					// we don't need need to continue processing, it is not a sequence
					continue;
				}

				int actualTerm = sequence.getCalculatedTerm();
				if(actualTerm != data.m_expectedTermValue)
				{
					result = false;
					String errMsg = String.format(
							"Wrong term value calculated: expected %d, actual %d",
							data.m_expectedTermValue, actualTerm);
					this.addResultMessage(errMsg);
				}

				SequenceIdentifier.SEQUENCE_TYPE actualType = sequence.getSequenceType();
				if(actualType != data.m_expectedType)
				{
					result = false;
					String errMsg = String.format(
							"Wrong sequence type was returned: expected %s, actual %s",
							data.m_expectedType, actualType);
					this.addResultMessage(errMsg);
				}
			}
			catch(InvalidDataException ex)
			{
				if(!data.m_invalidData)
				{
					result = false;
					this.addResultMessage(ex.getMessage());
				}
				else
				{
					addResultMessage("Caught invalid data");
				}
			}
			catch(InvalidStateException ex)
			{
				if(!data.m_invalidState)
				{
					result = false;
					this.addResultMessage(ex.getMessage());
				}
				else
				{
					addResultMessage("Caught invalid data");
				}
			}
		}

		trace("\n\n");

		return result;
	}

	TestData[] testData = { 
			new TestData(new int[] { 2, 4, 6, 8, 10 }, 20,SequenceIdentifier.SEQUENCE_TYPE.ARITHMETIC, 40, false, false),
			new TestData(new int[] {}, 20,SequenceIdentifier.SEQUENCE_TYPE.ARITHMETIC, 54, true, false),
			new TestData(null, 20,SequenceIdentifier.SEQUENCE_TYPE.ARITHMETIC, 40, true, false),
			new TestData(new int[] { 2, 4, 8, 16, 32 }, 20,SequenceIdentifier.SEQUENCE_TYPE.GEOMETRIC, 1048576, false, false),
			new TestData(new int[] { 7, 9, 11, 13, 15 }, 27,SequenceIdentifier.SEQUENCE_TYPE.ARITHMETIC, 59, false, false),
			new TestData(new int[] { -3, 9,-27 }, 5,SequenceIdentifier.SEQUENCE_TYPE.GEOMETRIC, -243, false, false),
			new TestData(new int[] { 1, 7, 14, 28 }, 6,SequenceIdentifier.SEQUENCE_TYPE.NONE, 1048576, false, false),
			new TestData(new int[] { 97, 84, 71 }, 15,SequenceIdentifier.SEQUENCE_TYPE.ARITHMETIC, -85, false, false),
			new TestData(new int[] { 102, 94, 86, 78, 70, 62, 54, 46, 38, 32 }, 23,SequenceIdentifier.SEQUENCE_TYPE.NONE, -85, false, false),
			new TestData(new int[] { 1, 33, 65 }, 6,SequenceIdentifier.SEQUENCE_TYPE.ARITHMETIC, 161, false, false),
			new TestData(new int[] { 302, 604, 1208 }, 2,SequenceIdentifier.SEQUENCE_TYPE.GEOMETRIC, 604, false, false)
			};

	/**
	 * Encapsulates the test data for this test
	 * @author Scott LaChance
	 *
	 */
	class TestData
	{
		/**
		 * Parameterized constructor
		 * @param array Integer array to test
		 * @param termIndex Term index to calculate
		 * @param type The expected Sequence type
		 * @param termValue The expected term value
		 * @param invalidDataException True if invalidDataException is expected
		 * @param invalidStateException True if invalidStateException is expected
		 */
		TestData(int[] array, int termIndex, 
				SequenceIdentifier.SEQUENCE_TYPE type, 
				int termValue,
				boolean invalidDataException,
				boolean invalidStateException)
		{
			m_array = array;
			m_termIndex = termIndex;
			m_expectedType = type;
			m_expectedTermValue = termValue;
			m_invalidData = invalidDataException;
			m_invalidState = invalidStateException;
		}

		// Test data and expected results
		int[] m_array;
		int m_termIndex;
		SequenceIdentifier.SEQUENCE_TYPE m_expectedType;
		int m_expectedTermValue;
		boolean m_invalidData;
		boolean m_invalidState;
	}
}

