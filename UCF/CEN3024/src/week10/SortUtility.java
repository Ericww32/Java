package week10;

public class SortUtility {

	// Class variables
	private SORT_ALGORITHM_TYPE m_sortAlgorithmType;

	/**
	 * Constructor method Create a new instance of StopWatch class
	 */
	public SortUtility() {

		new Stopwatch();

	}

	/**
	 * Calculate the elapsed time it took to sort array
	 * 
	 * @return time in milliseconds - long
	 */
	public long getElapsedTime() {

		Stopwatch stopW = new Stopwatch();
		long time = stopW.getElapsedTimeMilliSeconds();

		return time;

	}

	/**
	 * Gets sorting algorithm based on enum selection
	 * @param alType
	 *            - SORT_ALGORITHM_TYPE parameter
	 * @return instance of AbstractSort
	 */
	public AbstractSort getSortAlgorithm(SORT_ALGORITHM_TYPE alType) {

		AbstractSort abstractObj = null;

		switch (alType) {
		case SELECTION:
			abstractObj = new SelectionSort();
			break;

		case QUICK:
			abstractObj = new QuickSort();
			break;

		default:
			new NotImplementedException();
			break;

		}

		return abstractObj;
	}

	/**
	 * Call sort method depending on enum and sort array
	 * 
	 * @param array
	 *            - int array param
	 * @param algorithmType
	 *            - SORT_ALGORITHM_TYPE param
	 * @return sorted array - int array
	 */
	public int[] sort(int[] array, SORT_ALGORITHM_TYPE algorithmType) throws NotImplementedException {

		AbstractSort abstractObj;
		int[] sortedArr;
		m_sortAlgorithmType = algorithmType;
		abstractObj = getSortAlgorithm(m_sortAlgorithmType);
		sortedArr = abstractObj.sort(array);
		getElapsedTime();

		return sortedArr;

	}

}
