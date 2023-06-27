package week12;

/**
 * @author Eric Willoughby
 * @date 8 April 2017
 * */

public class LoginRequest extends Week12Object{

	private long m_accountId;
	private int m_pin;

	public LoginRequest() {

	}

	/**
	 * @param pin
	 *            - type int
	 * @param id
	 *            - type long
	 */
	public LoginRequest(int pin, long id) {
		m_pin = pin;
		m_accountId = id;
	}
	
	/**
	 * @return pin of type int
	 */
	public int getPin() {
		return m_pin;
	}

	/**
	 * @param m_pin
	 *            - type int
	 */
	public void setPin(int m_pin) {
		this.m_pin = m_pin;
	}

	/**
	 * @return account id type long
	 */
	public long getAccountId() {
		return m_accountId;
	}

	/**
	 * @param m_accountId
	 *            - type long
	 */
	public void setAccountId(long m_accountId) {
		this.m_accountId = m_accountId;
	}

	/**
	 * @param obj
	 *            - type Object
	 * @return Bool. Is the object an instance of LoginRequest?
	 */
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof LoginRequest) {
			LoginRequest rhs = (LoginRequest) obj;
			if (this.getPin() == rhs.getPin() && this.getAccountId() == rhs.getAccountId()) {
				result = true;
			}
		}
		return result;
	}
}
