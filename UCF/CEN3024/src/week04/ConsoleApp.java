package week04;

import java.util.Scanner;

/**
 * @author Eric Willoughby
 * @date 2 February 2017 
 * @version 1.1
 * */

public class ConsoleApp {
	
	private BusinessRuleEngine m_engine;
	private static String WELCOME = "Welcome to the first Gas Station App";
	private static String INSTRUCTIONS = "You will enter a location and the app will find the nearest gas stations";
	private static String PROMPT = "Enter your location, st. and avenue, as integers (Street between -6 and 6, Avenue between -4 and 4)";
	private static String QUIT = "quit";
	private static String TWO_INTS = "Needed a comma with 2 integers. ex: -4,2";
	private static String NO_STATION_FOUND = "No gas station found";
	private static String NEXT_INPUT = "Enter your location\n>";
	private static String GOODBYE = "Good bye!";
	private static String INIT_ERROR = "Error initializing the app";

	public ConsoleApp() {
		m_engine = new BusinessRuleEngine();
		GasStation gas1 = new GasStation("Gas Station 1", new Location(-3, -2));
		GasStation gas2 = new GasStation("Gas Station 2", new Location(3, -2));
		GasStation gas3 = new GasStation("Gas Station 3", new Location(-5, 3));
		
		try {
			m_engine.addGasStation(gas1);
			m_engine.addGasStation(gas2);
			m_engine.addGasStation(gas3);
		} catch (IllegalArgumentException | InvalidLocationException e) {
			cout(INIT_ERROR);
		}
	}
	
	/*
	 *@param args command line arguments 
	 * */
	public static void main(String[] args) {
		ConsoleApp app = new ConsoleApp();
		app.run();

	}
	
	public void run(){
		boolean fDone = false;
		initDisplay();
		
		while(!fDone){
			cout(NEXT_INPUT);
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			
			if(input.toLowerCase().equals(QUIT)){
				fDone = true;
			}
			else{
				String [] locationData = input.split(",");
				if(locationData.length == 2){
					try{
						String street = locationData[0].trim();
						String avenue = locationData[1].trim();
						int streetInt = Integer.parseInt(street);
						int avenueInt = Integer.parseInt(avenue);
						
						Location curLocation = new Location(streetInt, avenueInt);
						
						GasStation nearest;
						try{
							nearest = m_engine.findNearestGasStation(curLocation);
							
							if(nearest == null){
								cout(NO_STATION_FOUND);
							}
							else{
								int distance = m_engine.calculateDistanceBetweenLocations(curLocation, nearest.getLocation());
								String msg = String.format("Found %s, Distance %d", nearest, distance);
								cout(msg);
							}
						}catch(IllegalArgumentException | InvalidLocationException e){
							cout(e.getMessage());
						}
					}catch(NumberFormatException e){
						cout(TWO_INTS);
						cout(e.getMessage());
					}
				}
				else{
					cout(TWO_INTS);
				}
			}
		}//end while loop
		
		cout(GOODBYE);
	}//end run

	private void initDisplay(){
		cout(WELCOME);
		cout("");
		cout(INSTRUCTIONS);
		cout("");
		cout(PROMPT);
	}//end initDisplay
	
	private static void cout(String msg)
	{
		System.out.println(msg);
	}
	
}//end console app
