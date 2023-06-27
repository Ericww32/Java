import java.util.*;

public class Animal {

	public static final double FAVNUMBER = 1.6180;
	
	private String name;
	private int weight;
	private boolean owner = false;
	private byte age;
	private long uniqueID;
	private char favChar;
	private double speed;
	private double height;
	
	protected static int numOfAnimal = 0;  
	static Scanner userinput = new Scanner(System.in);
	
	public Animal() {
		numOfAnimal++;
		
		int sumOfNum = 5 + 1;
		System.out.println("5 + 1 = " + sumOfNum);
		
		int difOfNum = 5 - 1;
		System.out.println("5 -  1 = " + difOfNum);
		
		int muliOfNum = 5 * 1;
		System.out.println("5 + 1 = " + muliOfNum);
		
		int divOfNum = 5 / 1;
		System.out.println("5 / 1 = " + divOfNum);
		
		int modOfNum = 5 % 3;
		System.out.println("5 % 3 = " + modOfNum);
		
		System.out.print ("Enter the name: \n");
		
		if (userinput.hasNextLine()){
			 this.setName(userinput.nextLine());
		}
		
		//this.setfavChar();
		this.setUniqueID();
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public boolean isOwner() {
		return owner;
	}


	public void setOwner(boolean owner) {
		this.owner = owner;
	}


	public byte getAge() {
		return age;
	}


	public void setAge(byte age) {
		this.age = age;
	}


	public long getUniqueID() {
		return uniqueID;
	}


	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
		System.out.println("unique id set to " + this.uniqueID);
	}

	public void setUniqueID() {
		long minNum = 1;
		long maxNum = 1000000;
		
		this.uniqueID = minNum + (long) (Math.random() * ((maxNum - minNum) + 1));
		String stringtonum = Long.toString(maxNum);
		int numtostring = Integer.parseInt(stringtonum);
		System.out.println("unique id set to " + this.uniqueID);

	}

	public char getFavChar() {
		return favChar;
	}


	public void setFavChar(char favChar) {
		this.favChar = favChar;
		int random = (int) (Math.random() * 126) + 1 ;
		this.favChar = (char) random;
		if (random == 32){
			System.out.println("fav char set to space");
		}
		else if(random == 10){
			System.out.println("fav char set to new line");

		}
		else{
			System.out.println("fav char set to " + this.favChar); 

		}
		if ((random > 97) && (random < 122)){
			System.out.println("fav char is lowercase letter");
		}
		if (((random > 97) && (random < 122)) || (random > 64) && (random < 91)){
			System.out.println("fav char is letter");
		}
		int whichisbigger = (50 > random) ? 50: random;
		
		switch(random){
		
		case 8: 
			System.out.println("fav char set to backspace");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("I think something happened");
			break;
			default:
				System.out.println("out of swithch");
		
		}
	}


	public double getSpeed() {
		return speed;
	}


	public void setSpeed(double speed) {
		this.speed = speed;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}

	protected static void countTo(int startingNum){
		for (int i = startingNum; i <= 100; i++){
			if(i == 90) continue;
			System.out.println(i);
		}
	}
	
	protected static String printNum(int maxNum){
		int i = 1;
		
		while(i < (maxNum / 2)){
		System.out.println(i);
		i++;
		if(i == (maxNum / 2)) break;}
		
		Animal.countTo(maxNum);
		return "end of print numbers";
	}
	
	protected static void guessMyNum(){
		int num;
		
		do{
			System.out.println("guess number up to 100");
			while(!userinput.hasNextInt()){
				String numberEntered = userinput.next();
				System.out.printf("%s is not a number \n", numberEntered);}
			
			num = userinput.nextInt();
		}while(num != 50);
		
	}
	
	public String makeSound(){
		return "Grrrrr";
	}
	
	public static void speakAnimal(Animal randAnimal){
		System.out.println("Animal says "+ randAnimal.makeSound());
	}

	public static void main(String[] args) {
		Animal theanimal = new Animal();
		
		int[] favNum = new int[20];
		favNum[0] = 100;
		 
		String[] stringArray = {"random","words","here"};
		for(String word : stringArray){
			
			System.out.println(word);
			
		}
		String[][][] arrayName = {{{ "000"},{"100"},{"200"},{"300"}},
				{{"010"},{"110"},{"210"},{"310"}},
				{{"020"},{"120"},{"220"},{"320"}}};
		
		for(int i = 0; i < arrayName.length; i++){
			for(int j = 0; j < arrayName[i].length; j++){
				for(int k = 0; k < arrayName[i][j].length; k++){
					System.out.println("I " + arrayName[i][j][k] + " ");
				}
			}
			System.out.println("I");
		}
		String[] cloneArray = Arrays.copyOf(stringArray, 3); 
		System.out.println(Arrays.toString(cloneArray));
		System.out.println(Arrays.binarySearch(cloneArray, "Random"));
		}
}
