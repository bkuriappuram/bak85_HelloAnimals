
public class Mammal extends Animal { //mammal is an animal

	public Mammal() {
		age = 8;
		color = "Brown";
		type = "Dog";
		weight = 30;
		minWeight = 15;
		
	}
	
	public void eat() { 
		this.weight = weight + 1;
	}
	
	public void exercise() {
		System.out.println("Going on a diet...");
		this.weight = weight - 1;
		if(this.weight < minWeight)
			System.out.println("Dog died");
	}
}
