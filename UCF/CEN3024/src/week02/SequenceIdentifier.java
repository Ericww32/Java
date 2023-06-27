package week02;

/**
 * @author Eric Willoughby
 * @date 19 Jan. 2017
*/


public class SequenceIdentifier {
		
	public enum SEQUENCE_TYPE{ARITHMETIC,GEOMETRIC,NONE};
	public enum STATE{VALID, INVALID};
	
	private int m_curTerm;
	private SEQUENCE_TYPE type;
	private STATE m_curState;
		
	public SequenceIdentifier(){
		m_curState = STATE.INVALID;
	}
	
	public int getCalculatedTerm(){
		
		return m_curTerm;	
	}
	
	public SEQUENCE_TYPE getSequenceType(){
		
		return type;
		
	}

	public SEQUENCE_TYPE identifySequence(int[] a, int index){
		/**@param a = first term value 
		 * @param n = the term index 
		 * @param d = the difference
		 * @param r = ratio
		 * 
		 *  a[n] is the nth term of the sequence.
		 *  a[0] is the first term in the sequence. To find the explicit formula, 
		 *  you will need to be given (or use computations to find out) the first term 
		 *  and use that value in the formula.
		 *  r is the common ratio for the geometric sequence. 
		 *  n is treated like the variable in a sequence. 
		 * */
		
		int r;
		int n = index - 1;
		
		r = a[1]/a[0];
		
		if ((a[1]) - (a[0]) == (a[-1]) - (a[-2])){
			
			type = SEQUENCE_TYPE.ARITHMETIC;
			m_curTerm = a[0] + n;
			
		}
		else if ((a[1]) / (a[0]) == (a[-1]) / (a[-2])){
			type = SEQUENCE_TYPE.GEOMETRIC;
			m_curTerm = (int) (a[0] * (Math.pow(r, n)));
			
		}
		else{
			type = SEQUENCE_TYPE.NONE;
			
		}
		return type;
	}
	
	
	
	private STATE validateArray(int []a){
		int x[];
		return m_curState;
		
	} 

}
