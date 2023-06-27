
public class Room implements Comparable<Room> {
	int length;
	int width;
	String floorCover;
	int numCloset;// number of closets

	public Room(int legth, int width, String floorCover, int numCloset) {
		this.length = legth;
		this.width = width;
		this.floorCover = floorCover;
		this.numCloset = numCloset;
		}

	public int compareTo(Room obj){
		int result;
		result = (getLength() * getWidth()) - (obj.getLength() * obj.getWidth());
		return result;
	}

	public boolean equals(Object obj){
		if(!(obj instanceof Room)){
			return false;
		}
		if(getLength() * getWidth() == ((Room)obj).getWidth() * ((Room)obj).getLength()){
			return true;
		}
		return false;
	}


	public int getLength() {
		return length;
	}

	public void setLegth(int legth) {
		this.length = legth;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getFloorCover() {
		return floorCover;
	}

	public void setFloorCover(String floorCover) {
		this.floorCover = floorCover;
	}

	public int getNumCloset() {
		return numCloset;
	}

	public void setNumCloset(int numCloset) {
		this.numCloset = numCloset;
	}

	@Override
	public String toString() {
		return "Room [legth=" + length + ", width=" + width + ", floorCover=" + floorCover + ", numCloset=" + numCloset
				+ ", getLegth()=" + getLength() + ", getWidth()=" + getWidth() + ", getFloorCover()=" + getFloorCover()
				+ ", getNumCloset()=" + getNumCloset() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}

}
