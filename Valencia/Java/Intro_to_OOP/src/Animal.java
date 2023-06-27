
abstract public class Animal {
	private int weight;
	
	public Animal(int weight){
		setWeight(weight);
		
	}
	
	abstract public void makeNoise();
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String toString(){
		String result;
		result = "I'm an animal: " + weight;
		return result;
		
	}
}
