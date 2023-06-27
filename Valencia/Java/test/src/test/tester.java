package test;

public class tester {

	public static void main(String[] args) {
		
		for ( int count = 0; count < 10; ++count ) {
			if ( count == 5 ){ 
				continue; 
				}
			
			System.out.println( count );
		}
		
		assert false: " runs";
			
	}

}
