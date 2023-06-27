
public class Hockey extends Athlete {
	
	private String skaterGoalie;//changed this to private
	
	public Hockey(String name, int age, String team, String position, String skaterGoalie){
		super(name, age, team, position);
		this.skaterGoalie = skaterGoalie;
	}
	public String getSkaterGoalie() {
		return skaterGoalie;
	}
	public void setSkaterGoalie(String skaterGoalie) {
		this.skaterGoalie = skaterGoalie;
	}
	
	@Override
	public String toString() {// had to change this toString method because the values were not set to private
		return "Hockey [skaterGoalie=" + skaterGoalie + ", Team=" + getTeam() + ", Position=" + getPosition()
				+ ", Name=" + getName() + ", Age=" + getAge() + "]";
	}
	
	public void doThis(){
		System.out.println("I sit in the penalty box");
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Hockey)){
			System.out.println("Object is not Hockey class");
			return false;
		}
		boolean result = false;
		if(this.getSkaterGoalie() == ((Hockey)obj).getSkaterGoalie()){
			System.out.println("Hockey returned true");
			result = true;
		}if(result == false){
			System.out.println("Hockey returned false");
		}
		return result;
	}
}
