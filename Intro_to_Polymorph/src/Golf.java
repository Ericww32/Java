
public class Golf extends Athlete {
	
	private String sponser;//changed this to private
	
	public Golf(String name, int age, String team, String position, String sponser) {
		super(name, age, team, position);
		this.sponser = sponser;
	}

	public String getSponser() {
		return sponser;
	}

	public void setSponser(String sponser) {
		this.sponser = sponser;
	}
	@Override
	public String toString() {// had to change this toString method because the values were not set to private
		return "Golf [sponser=" + sponser + ", Team=" + getTeam() + ", Position=" + getPosition()
				+ ", Name=" + getName() + ", Age=" + getAge() + "]";
	}
	
	public void doThis(){
		System.out.println("I put it in the hole");
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Golf)){
			System.out.println("Object is not Golf class");
			return false;
		}
		boolean result = false;
		if(this.getSponser() == ((Golf)obj).getSponser()){
			System.out.println("Golf returned true");
			result = true;
		}if(result == false){
			System.out.println("Golf returned false");
		}
		return result;
	}
}
