import javax.swing.JOptionPane;

public class Display {

	public Display() {
		
	}
	public static int displayMenu(int choice){    
		String main_selection = JOptionPane.showInputDialog(null,"Please choose from the following options:\n"
				+ "***********************************************\n\n"
				+ "1. Add\n"
				+ "2. Edit\n"
				+ "3. Display individual\n"
				+ "4. Display all\n"
				+ "5. Exit\n\n");      
		choice = Integer.parseInt(main_selection);
		return choice;
	}
	public static int addMenu(int option){           
		
		String selection = JOptionPane.showInputDialog(null,"Please choose from the following options:\n"
				+ "***********************************************\n\n"
				+ "1. Add a person\n"
				+ "2. Add an Employee\n"
				+ "3. Add a manager\n"
				+ "4. Exit\n\n");      
		option = Integer.parseInt(selection);
		return option;     
		}      
	
	public static int editMenu(int option){     
		
		String selection = JOptionPane.showInputDialog(null,"Please choose from the following options:\n"
				+ "***********************************************\n\n"
				+ "1. Edit a person\n"
				+ "2. Edit an Employee\n"
				+ "3. Edit a manager\n"
				+ "4. Exit\n\n");      
		option = Integer.parseInt(selection);
		return option;      
		} 
	
	public static int singleMenu(int option){    
		
		String selection = JOptionPane.showInputDialog(null,"Please choose from the following options:\n"
				+ "***********************************************\n\n"
				+ "1. Display a person\n"
				+ "2. Display an Employee\n"
				+ "3. Display a manager\n"
				+ "4. Exit\n\n");      
		option = Integer.parseInt(selection);
		return option;  
		
		}      
	
	public static int allMenu(int option){           
		String selection = JOptionPane.showInputDialog(null,"Please choose from the following options:\n"
				+ "***********************************************\n\n"
				+ "1. Display all person\n"
				+ "2. Display all Employee\n"
				+ "3. Display all manager\n"
				+ "4. Exit\n\n");      
		option = Integer.parseInt(selection);
		return option;     
		}
	


}
