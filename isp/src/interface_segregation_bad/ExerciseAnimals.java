package interface_segregation_bad;

public class ExerciseAnimals {

	public static void main(String[] args) {
		
		Dog dog = new Dog("Rover");
		dog.walk();
		dog.jump();
		dog.fly();
		
		Eagle eagle = new Eagle("Sam");
		eagle.walk();
		eagle.jump();
		eagle.fly();		
		
	}
}
