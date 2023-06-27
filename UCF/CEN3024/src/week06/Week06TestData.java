package week06;

public class Week06TestData {

	private long m_expected, m_M, m_N;
	private boolean m_expectException;

	// expected - Expected GCD value
	// exceptionExpected - true if expecting an IllegalArgument exception,
	// otherwise false
	public Week06TestData(long m_M,  long m_N, long m_expected, boolean m_expectException) {
		this.m_M = m_M;
		this.m_N = m_N;
		this.m_expected = m_expected;
		this.m_expectException = m_expectException;
	}
	/**
	 * Getter for expected IllegalArgumentException
	 * @return true if IllegalArgumentException is expected otherwise false
	 * */
	public boolean expectIllegalArgumentException() {
		if(m_expectException){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * Getter for the expected GCD
	 * @return The expected GCD value
	 * */
	public long getExpected() {
		return m_expected;

	}

	/**
	 * Getter for the M long integer
	 * @return M value
	 * */
	public long getM() {
		return m_M;
	}

	/**
	 * Getter for the N long integer
	 * @return N value
	 * */
	public long getN() {
		return m_N;
	}

}
