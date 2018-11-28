package interface_segregation_bad;

public class Dog implements AnimalActions {

	String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void run() {
		System.out.println("run " + name);		
	}

	public void walk() {
		System.out.println("walk " + name);		
	}

	public void jump() {
		System.out.println("jump " + name);			
	}

	public void fly() {
	}

	public void glide() {	
	}

}
