
public class Bird extends Animal { //birds are an animal

	public Bird() {
		age = 5;
		color = "White";
		type = "Cockatoo";
		weight = 10;
		minWeight = 2;
		
	}
	
	public void eat() {
		this.weight = weight + 1;
	}
	
	public void exercise() {
		System.out.println("Going on a diet...");
		this.weight = weight - 2;
		if(this.weight < minWeight)
			System.out.println("Bird died");
	}

}
