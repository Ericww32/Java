
public class Football extends Athlete {
	
	private String fense;// offense or defense and changed this to private
	
	public Football(String name, int age, String team, String position, String fense){
		super(name, age, team, position);
		this.fense = fense;
	}
	
	public String getFense() {
		return fense;
	}

	public void setFense(String fense) {
		this.fense = fense;
	}
	@Override
	public String toString() {// had to change this toString method because the values were not set to private
		return "Football [fense=" + fense + ", Team=" + getTeam() + ", Position=" + getPosition()
			 + ", Name=" + getName() + ", Age=" + getAge() + "]";
	}

	public void doThis(){
		System.out.println("I tackle something");
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Football)){
			System.out.println("Object is not Football class");
			return false;
		}
		boolean result = false;
		if(this.getFense() == ((Football)obj).getFense()){
			System.out.println("Football returned true");
			result = true;
		}if(result == false){
			System.out.println("Football returned false");
		}
		return result;
	}
}
