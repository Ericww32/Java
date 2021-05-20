
abstract public class Athlete extends Person {/*because this class changes 
												from person to person this class 
												would be considered polymorphism */
	
	private String team;//changed this to private
	private String position;//changed this to private
	
	public Athlete(String name, int age, String team, String position){
		super(name, age);
		this.team = team;
		this.position = position;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	abstract public void doThis();/*now the other classes have to use this method
									also this could be considered polymorphism 
									due to the fact that it is being over written 
									in every class that uses it*/
	
	abstract public boolean equals(Object obj);/*Every class has an equals method*/
	
	@Override
	public String toString() {
		return "Athlete [team=" + team + ", position=" + position + ", Name=" + getName() + ", Age="
				+ getAge() + "]";
	}
}
