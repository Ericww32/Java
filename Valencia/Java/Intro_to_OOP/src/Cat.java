
public class Cat extends Animal{
	private String name;
	private boolean neutered;
	public Cat(int weight, String name, boolean neutered) {
		super(weight);
		setName(name);
		setNeutered(neutered);
		
	}
	
public void makeNoise(){
	System.out.println("meow");	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isNeutered() {
		return neutered;
	}
	public void setNeutered(boolean neutered) {
		this.neutered = neutered;
	}
	
	public String toString(){
		String result;
		result = "Cat: " + name + " Neutered: " + neutered + super.toString();
		return result;
	}
	

}
