//
//  main.cpp
//  dates
//
//  Created by Eric Willoughby on 9/12/15.
//  Copyright (c) 2015 Eric Willoughby. All rights reserved.
//

package assignment3;

import java.util.*;

public class Month {
	
	public static void main(){
		static final String[] month= {"Jan", "feb", "march", "april", "may",
				"june", "july", "aug", "sept", "oct", "nov", "dec"};
		int day = 0;
		int year = 0;
		int i;
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("give me a date: (MM/YYYY)");
		month[i]=scanf.next();
		year = scanf.nextInt();
		
		if(month[i] == month[1] | month[i] == month[3] | month[i] == month[5] | 
				month[i] == month[7] | month[i] == month[9] | month[i] == month[11]){
			day = 31;
		}
		else if(month[i] == month[2]){
			day = 28;
		}
		else{
			day = 30;
		}
		
		System.out.println("month: " + month[i] + " year: " + year + "has " 
		+ day + " days");
	}

}
