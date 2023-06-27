package week10;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import org.junit.Test;

/**
 * Tests the week06 application
 * 
 * @author Scott LaChance
 *
 */
public class Week10JUnitTest
{
	/**
	 * Pass in invalid guesses and get an InvalidArgumentException
	 */
	@Test
	public void testSelectionSort()
	{
		trace("testSelectionSort");

		int[] testList = generateRandomIntegerList();
		SortUtility util = new SortUtility();
		try
		{
			int[] sortedList = util.sort(testList, SORT_ALGORITHM_TYPE.SELECTION);
			
			if( !verifySort(sortedList) )
			{
				fail("SelectionSort failed");
			}
			
			String msg = String.format("Elapsed time: %d ms", util.getElapsedTime());
			trace(msg);
		}
		catch(NotImplementedException ex)
		{
			fail("Sort selection not implemented " + ex.getMessage());
		}
		catch(Exception ex)
		{
			fail("Unexpected exception " + ex.getMessage());
		}
	}
	
	/**
	 * Pass in invalid guesses and get an InvalidArgumentException
	 */
	@Test
	public void testQuickSort()
	{
		trace("testQuickSort");

		int[] testList = generateRandomIntegerList();
		SortUtility util = new SortUtility();
		try
		{
			int[] sortedList = util.sort(testList, SORT_ALGORITHM_TYPE.QUICK);
			
			if( !verifySort(sortedList) )
			{
				fail("QuickSort failed");
			}
			
			String msg = String.format("Elapsed time: %d ms", util.getElapsedTime());
			trace(msg);
		}
		catch(NotImplementedException ex)
		{
			fail("Sort quick not implemented " + ex.getMessage());
		}
		catch(Exception ex)
		{
			fail("Unexpected exception " + ex.getMessage());
		}
	}
	
	/**
	 * Verifies the list is sorted smallest to largest
	 * @param list list to verify
	 * @return true if sorted, otherwise false
	 */
    private boolean verifySort(int[] list)
    {
        boolean result = true;

        for(int i = 0; i < list.length - 2; i++)
        {
            int nextInt = i+1;
        	if(list[i] > list[nextInt])
            {
                String msg = String.format("Unsorted valies at index %d and %d", i, nextInt);

                trace(msg);
                result = false;
                break; // early out
            }
        }

        return result;
    }		
	
	/**
	 * Random integers, must all be unique
	 */
	private int[] generateRandomIntegerList()
	{
		Random rand = new Random();       
        int[] list = new int[LIST_SIZE];

        for(int i = 0; i < LIST_SIZE; i++)
        {
            int val = rand.nextInt(LIST_SIZE);
            list[i] = val;
        }

        return list;
	}
	
	private void trace(String msg)
	{
		System.out.println(msg);
	}
	
	//private int[] m_list;
	private static int LIST_SIZE = 100000;
}


