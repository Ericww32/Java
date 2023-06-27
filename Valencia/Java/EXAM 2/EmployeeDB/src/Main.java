import java.io.IOException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) throws IOException {
		int option = 0;
		int choice = 0;
		Person[] guy = new Person[500];
		Employee[] worker = new Employee[100];
		Manager[] associate = new Manager[20];
		int i = 0;
		int j = 0;
		int k = 0;		
		
		do{                
			choice = Display.displayMenu(choice);
			switch(choice){                
				case 1:                      
				do{
					option = Display.addMenu(option);
				switch(option){
					case 1: 
						i++;
						guy[i] = new Person(null, null, null, null, i); 
						if (i < 500){
						Person.setId(i);
						JOptionPane.showMessageDialog(null,"Your ID numer is: " + Person.getId());
						}
						else if(i > 500){
							final ImageIcon icon2 = new ImageIcon(new URL("http://38.media.tumblr.com/tumblr_m6bhuyRV4a1rziwwco1_r1_500.gif"));
							JOptionPane.showMessageDialog(null,"too many people!","It's just too much!",  JOptionPane.INFORMATION_MESSAGE, icon2);
							System.exit(-1);
						}
					break; 
					case 2: //employee info here
						j++;
						worker[j] = new Employee(null, null, null, null, j, null, null, null);
						if (j < 100){
							Employee.setId(j);
							JOptionPane.showMessageDialog(null,"Your ID numer is: " + Employee.getId());
							}
							else if(j > 100){
								final ImageIcon icon2 = new ImageIcon(new URL("http://38.media.tumblr.com/tumblr_m6bhuyRV4a1rziwwco1_r1_500.gif"));
								JOptionPane.showMessageDialog(null,"too many Employees!","It's just too much!",  JOptionPane.INFORMATION_MESSAGE, icon2);
								System.exit(-1);
							}
						break; 
					case 3: //manager info here
						k++;
						associate[k] = new Manager(null, null, null, null, k, null, null, null, null, null);
						if (k < 20){
							Manager.setId(k);
							JOptionPane.showMessageDialog(null,"Your ID numer is: " + Manager.getId());
							}
							else if(k > 20){
								final ImageIcon icon2 = new ImageIcon(new URL("http://38.media.tumblr.com/tumblr_m6bhuyRV4a1rziwwco1_r1_500.gif"));
								JOptionPane.showMessageDialog(null,"too many managers!","It's just too much!",  JOptionPane.INFORMATION_MESSAGE, icon2);
								System.exit(-1);
							}
						break; 
					case 4: 
						break; 
					default:    
						final ImageIcon icon1 = new ImageIcon(new URL("http://i.imgur.com/OrOMouI.gif"));
						JOptionPane.showMessageDialog(null,"Invalid choice, choose again","Idiot!", JOptionPane.INFORMATION_MESSAGE, icon1);
						break;
						}
				}while(option != 4);
			break;
			
				case 2:   
					do{
						option = Display.editMenu(option);
					switch(option){
						case 1: //Edit person
							Person.getThatID(i);
							JOptionPane.showInputDialog(guy[i].toString());
							guy[i].editor(null, null, null, null, i);
							break; 
						case 2: //Edit Employee
							Employee.getThatID(j);
							JOptionPane.showInputDialog(worker[j].toString());
							worker[j].editor(null, null, null, null, j, null, null, null);
							break;
						case 3: //Edit Manager
							Manager.getThatID(k);
							JOptionPane.showInputDialog(associate[k].toString());
							associate[k].editor(null, null, null, null, k, null, null, null, null, null);
							break; 
						case 4: //Quit
							break;   
						default:
							final ImageIcon icon1 = new ImageIcon(new URL("http://i.imgur.com/OrOMouI.gif"));
							JOptionPane.showMessageDialog(null,"Invalid choice, choose again","Idiot!", JOptionPane.INFORMATION_MESSAGE, icon1);						
							break;
							}  
					}while(option != 4);
			break;
				case 3:   
				do{
					option = Display.singleMenu(option);
				switch(option){
					case 1: //Display a Person
						Person.getThatID(i);
						JOptionPane.showMessageDialog(null, guy[i].toString());
						break; 
					case 2: //Display an Employee
						Employee.getThatID(j);
						JOptionPane.showMessageDialog(null,worker[j].toString());
						break;
					case 3: //Display a Manager
						Manager.getThatID(k);
						JOptionPane.showMessageDialog(null,associate[k].toString());
						break; 
					case 4: //end
						break; 
					default:
						final ImageIcon icon1 = new ImageIcon(new URL("http://i.imgur.com/OrOMouI.gif"));
						JOptionPane.showMessageDialog(null,"Invalid choice, choose again","Idiot!", JOptionPane.INFORMATION_MESSAGE, icon1);						
						break;
						}  
				}while(option != 4);
			break;
				case 4:
				do{
					option = Display.allMenu(option);
				switch(option){
				case 1://Display all People
					for(i = 0; i < guy.length; i++){
						if(guy[i] != null){
							JOptionPane.showMessageDialog(null,guy[i]);
						}
					}
					for(j = 0; j < worker.length; j++){
						if(worker[j] != null){
							JOptionPane.showMessageDialog(null,worker[j]);
							}
						}
						for(k = 0; k < associate.length; k++){
						if(associate[k] != null){
							JOptionPane.showMessageDialog(null,associate[k]);
							}
						}
					break; 
				case 2://Display all Employees
						for(j = 0; j < worker.length; j++){
						if(worker[j] != null){
							JOptionPane.showMessageDialog(null,worker[j]);
							}
						}
					break;
				case 3://Display all Managers
						for(k = 0; k < associate.length; k++){
						if(associate[k] != null){
							JOptionPane.showMessageDialog(null,associate[k]);
							}
						}
					break;
				case 4:
					break;
				default:
					final ImageIcon icon1 = new ImageIcon(new URL("http://i.imgur.com/OrOMouI.gif"));
					JOptionPane.showMessageDialog(null,"Invalid choice, choose again","Idiot!", JOptionPane.INFORMATION_MESSAGE, icon1);					
					break;
					}  
				}while(option != 4);
			break;
				case 5:                    
					final ImageIcon icon = new ImageIcon(new URL("https://38.media.tumblr.com/bb8d453cb375a699aa2c7f31911e60df/tumblr_nblcs5MXJk1qhgd0so1_500.gif"));
					JOptionPane.showMessageDialog(null,"Thanks for stopping by SLACKER!", "LATER!", JOptionPane.INFORMATION_MESSAGE, icon);
					PrintIt.printit(guy, worker, associate);
			break; 
				default:                     
					final ImageIcon icon1 = new ImageIcon(new URL("http://i.imgur.com/OrOMouI.gif"));
					JOptionPane.showMessageDialog(null,"Invalid choice, choose again", "Idiot!", JOptionPane.INFORMATION_MESSAGE, icon1);			
					break;           
			}
		} while (choice != 5); 		
	}//end on main
}

