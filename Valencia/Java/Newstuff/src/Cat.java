
public class Cat extends Animal{
	
public Cat(){
		
	}
	
	public String makeSound(){
		
		return "meow...";
	}

	public static void main(){
		Animal fido = new Dog();
		Animal fluffy = new Cat();
		
		Animal[] theAnimals = new Animal[10];
		
		theAnimals[0] = fido;
		theAnimals[1] = fluffy;
		
		System.out.println("fido says " + theAnimals[0].makeSound());
		System.out.println("fluffy says " + theAnimals[1].makeSound());
		
		speakAnimal(fluffy);
	}
 
}
