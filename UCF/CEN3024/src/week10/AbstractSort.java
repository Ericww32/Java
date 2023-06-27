package week10;

public abstract class AbstractSort {
	
	//Class variables
	@SuppressWarnings("unused")
	private String m_name;
	
	/**
	 * Constructor
	 * @param name - String parameter
	 */
	public AbstractSort(String name){
		
		this.m_name = name;
		
	}
	
	/**
	 * Abstract sort method that will contain sorting algorithm
	 * @param array - integer array parameter
	 * @return sorted array of type integer
	 */
	public abstract int[] sort(int[] array);

}
