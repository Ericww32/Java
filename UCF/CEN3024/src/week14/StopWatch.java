package week14;

public class StopWatch {

	// Class variables
	private long m_startTime;
	private long m_stopTime;

	/**
	 * Default constructor
	 */
	public StopWatch() {
	}

	/**
	 * Calculates elapsed time
	 * 
	 * @return elapsed time of type long
	 */
	public long getElapsedTimeMilliSeconds() {

		long elapsedTime;

		start();
		m_startTime = getStartTime();
		stop();
		m_stopTime = getStopTime();
		elapsedTime = m_stopTime - m_startTime;

		return elapsedTime;

	}

	/**
	 * Calculates time when sort started
	 * 
	 * @return time sort began in milli seconds
	 */
	public long getStartTime() {

		long startTime = System.nanoTime() * 1000000;

		return startTime;

	}

	/**
	 * Calculates end time when sort is completed
	 * 
	 * @return the time it stopped in milli seconds
	 */
	public long getStopTime() {

		long stopTime = System.nanoTime() * 1000000;

		return stopTime;

	}

	/**
	 * Sets start and stop times to 0 Begins timing the start time
	 */
	public void start() {

		m_startTime = 0;
		m_stopTime = 0;
		getStartTime();

	}

	/**
	 * Begins getting the time the sort stopped
	 * 
	 */
	public void stop() {

		getStopTime();

	}

}
