package interface_segregation_good;

public class Eagle implements MammalActions, BirdActions {

	String name;
	
	public Eagle(String name) {
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
		System.out.println("fly " + name);	
	}

	public void glide() {	
		System.out.println("glide " + name);	
	}

}
