package week10;

//the first one belongs to LaChance
public class SelectionSort extends AbstractSort {
	/**
	 * Default constructor
	 */
	public SelectionSort() {
		super("Selection Sort");
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * Sorts an integer array
	 *
	 * @return sorted list
	 */
	public int[] sort(int[] integerArray) {
		int minIndex;
		int length;
		int temp;
		int i;
		length = integerArray.length;

		for (int startIndex = 0; startIndex <= length - 2; startIndex++) {
			// each iteration of the for loop is one pass
			minIndex = startIndex;

			// find the smallest in this pass at
			// position minIndex
			for (i = startIndex + 1; i <= length - 1; i++) {
				if (integerArray[i] < integerArray[minIndex]) {
					minIndex = i;
				}
			}

			// exchange number[startIndex] and number[minIndex]
			temp = integerArray[startIndex];
			integerArray[startIndex] = integerArray[minIndex];
			integerArray[minIndex] = temp;
		}

		return integerArray;
	}
}// end SelectionSort

//public class SelectionSort extends AbstractSort {
//
//	/**
//	 * Constructor Method Inherits from AbstractSort
//	 */
//	public SelectionSort() {
//
//		super("SELECTION");
//
//	}
//
//	/**
//	 * @param array
//	 * @return sorted int array
//	 */
//	public int[] sort(int[] array) {
//
//		for (int i = 0; i < array.length - 1; i++) {
//			int index = i;
//
//			for (int j = i + 1; j < array.length; j++) {
//
//				if (array[j] < array[index]) {
//
//					index = j;
//
//				}
//
//			}
//			int smallestNum = array[index];
//			array[index] = array[i];
//			array[i] = smallestNum;
//		}
//		return array;
//	}
//}
