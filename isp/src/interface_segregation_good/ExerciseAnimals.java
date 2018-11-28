package interface_segregation_good;

public class ExerciseAnimals {

	public static void main(String[] args) {
		
		Pig dog = new Pig("Percy");
		dog.walk();
		dog.jump();
		
		Eagle eagle = new Eagle("Sam");
		eagle.walk();
		eagle.jump();
		eagle.fly();		
		
	}
}
