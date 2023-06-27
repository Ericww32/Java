
public class TestingAbstract {

	public static void main(String[] args) {
		//Animal myAnimal = new Animal(45);
		Animal pet = new Dog (89, "Max");
		Cat fluffy = new Cat (17, "fluffy", true);

		//foo(myAnimal);
		foo(pet);
		foo(fluffy);
	}

	public static void foo(Animal myPet){
		myPet.makeNoise();
	}
}
