package interface_segregation_good;

public class Pig implements MammalActions {

	String name;
	
	public Pig(String name) {
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

}
