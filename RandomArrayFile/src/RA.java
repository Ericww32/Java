import java.util.*;
import java.io.*;

public class RA {

	public static void main(String[] args) throws IOException {
		Scanner scanf = new Scanner(System.in);
		int num;// this is the number (element) the user will give to the array
		System.out.println("give me a number to go on: ");
		num = scanf.nextInt();
		int arr[] = new int[num];//placing the number in the element position of the array
		scanf.close();
		Random rand = new Random();
		
		System.out.print("Unsorted list:\n");
		for(int i = 0; i <= arr.length - 1; i++){
			int r =  rand.nextInt(100);
			arr[i] = r;
			System.out.println((i+1) + ") " + arr[i]);
			}//end of for loop
		
		Arrays.sort(arr);
		
		System.out.print("Sorted list:\n");
        for(int i = 0; i < num; i++){
        System.out.println((i+1) + ") " + arr[i]);
        }//end of for loop
        
		printit(arr,num);
	}//end of main  
	
	
	public static void printit(int[] arr, int num) throws IOException {
		
		
		String horse = "mifi.txt";

	    try {
	        FileWriter fileWriter = new FileWriter(horse);

	        BufferedWriter out = new BufferedWriter(fileWriter);
	        
	        out.write("Sorted list:");
	        out.newLine();
	        
	        for(int i = 0; i < num; i++){
	        out.write((i+1) + ") " + arr[i]);
	        out.newLine();
	    }

	        out.close();
	    }
	    catch(IOException ex) {
	        System.out.println(
	            "Error writing to file '" + horse + "'");
	    }
	    
	   
	    
		}//end of printit
	
}//end of class