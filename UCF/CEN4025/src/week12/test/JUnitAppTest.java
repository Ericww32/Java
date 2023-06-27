package week12.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import test.AbstractJUnitBase;
import week12.app.Account;
import week12.app.User;
import week12.data.AtmDataException;
import week12.data.DataAccess;
import week12.util.AtmInvalidUserException;
import week12.util.AtmSecurity;

public class JUnitAppTest extends AbstractJUnitBase
{
	static DataAccess da;
	static User user;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		da = DataAccess.getInstance();
		da.connect();
		
		user = new User();
		user.setFirstName("Tracer");
		user.setLastName("Bullet");
		user.setPin(5678);
		da.saveUser(user);
		
		staticTrace(" *** Setting up test user");
		staticTrace(user.toString());
		staticTrace(" *** End Setting up test user");
	}
	
	private static void staticTrace(String msg)
	{
		System.out.println(msg);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
	}

	@Before
	public void setUp() throws Exception
	{
		
	}

	@After
	public void tearDown() throws Exception
	{
	}

	/**
	 * This test executes the login logic you must implement.
	 * The ATM machine reads the user information from the
	 * card (first name, last name, id) and the ATM machine 
	 * gets the pin from the user input.
	 * It uses this information to create the User data that is transmitted
	 * to the server, is assembled into a user object and presented to the
	 * AtmSecurity class.
	 * This test is verifying the AtmSecurity login method works correctly.
	 */
	@Test
	public void testAtmSecurity()
	{
		AtmSecurity secure = new AtmSecurity();
		
		try
		{
			if(!secure.login(user))
			{
				throw new AtmInvalidUserException();
			}
		}
		catch(AtmInvalidUserException ex)
		{
			String msg = "AtmDataException: " + ex.getMessage() + "\n";
			msg += getExceptionTrace(ex);
			trace(msg);
			fail(msg);
		}

	}
	
	/**
	 * Uses the global user to create an account.
	 * 
	 */
	@Test
	public void testAccount()
	{
		Account newAccount = new Account(user, "JUnit Test Checking Account");
		try
		{
			da.saveAccount(newAccount);
			trace(newAccount.toString());
			assert (newAccount.getAccountId() > 0);
			
			Account actual = da.getAccount(newAccount.getAccountId());
	
			String msg = String.format("Expected %s, actual %s", newAccount, actual);
					
			assertEquals(msg, newAccount, actual);
			
			da.deleteAccount(newAccount);
			
			Account deletedActual = da.getAccount(newAccount.getAccountId());
			assertNull(deletedActual);
		}
		catch(AtmDataException ex)
		{
			String msg = "AtmDataException: " + ex.getMessage() + "\n";
			msg += getExceptionTrace(ex);
			fail(msg);
		}	
	}


	@Test
	public void testGetUser()
	{
		try
		{
			da.saveUser(user);
			User savedUser = da.getUserById(user.getUserId());
			String msg = String.format("Expected %s, actual %s", user, savedUser);
			assertEquals(msg, user, savedUser);
		}
		catch(AtmDataException ex)
		{
			String msg = "AtmDataException: " + ex.getMessage() + "\n";
			msg += getExceptionTrace(ex);
			fail(msg);
		}
	}

	/**
	 * Test the formatting of the toString method
	 */
	@Test
	public void testUserToString()
	{
		String expected = "ID: 100, First Last, 3456";
		//                       id, pin    first    last
		User testUser = new User(100,3456, "First", "Last");
		String userInfo = testUser.toString();
		assert (userInfo.length() > 0);
		String msg = String.format("expected: %s, actual %s", expected, testUser.toString());
		assertEquals(msg, testUser.toString(),expected);
	}

	@Test
	public void testUserClassEquals()
	{
		boolean equalTest = true;

		// simple user creation
		User user1 = new User();

		User user2 = new User();

		// expect to be same
		if(!user1.equals(user2))
		{
			equalTest = false;
		}

		user2.setFirstName("Jim");
		user2.setLastName("Bo");
		user2.setUserId(1);
		user2.setPin(1234);

		// expect to be different
		if(user.equals(user2))
		{
			equalTest = false;
		}

		User user3 = new User(user2.getUserId(), user2.getPin(),
				user2.getFirstName(), user2.getLastName());

		// expect to be same
		if(!user3.equals(user2))
		{
			equalTest = false;
		}

		if(!equalTest)
		{
			fail("Class instances not equal");
		}
	}

	private String getExceptionTrace(Exception ex)
	{
		StringBuffer msg = new StringBuffer();
		java.io.StringWriter writer = new java.io.StringWriter();
		java.io.PrintWriter pWriter = new java.io.PrintWriter(writer);
		ex.printStackTrace(pWriter);

		return msg.toString();
	}
}
