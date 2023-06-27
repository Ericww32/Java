
public class Baseball extends Athlete {
	
	private String fieldPosition;//changed this to private
	
	public Baseball(String name, int age, String team, String position, String fieldPosition){
		super(name, age, team, position);
		this.fieldPosition = fieldPosition;
	}	
	public String getFieldPosition() {
		return fieldPosition;
	}
	public void setFieldPosition(String fieldPosition) {
		this.fieldPosition = fieldPosition;
	}
	@Override
	public String toString() {// had to change this toString method because the values were not set to private
		return "Baseball [fieldPosition=" + fieldPosition + ", Team=" + getTeam() + ", Position="
				+ getPosition() + ", Name=" + getName() + ", Age=" + getAge() + "]";
	}

	public void doThis(){
		System.out.println("I hit something");
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Baseball)){
			System.out.println("Object is not Baseball class");
			return false;
		}
		boolean result = false;
		if(this.getFieldPosition() == ((Baseball)obj).getFieldPosition()){
			System.out.println("Baseball returned true");
			result = true;
		}if(result == false){
			System.out.println("Baseball returned false");
		}
		return result;
	}
}
