
public class Fish extends Animal{ //fish are an animal

	public Fish() {
		age = 10;
		color = "Black";
		type = "Bass";
		weight = 20;
		minWeight = 5;
		
	}
	
	public void eat() {
		this.weight = weight + 1;
	}
	
	public void exercise() {
		System.out.println("Going on a diet...");
		this.weight = weight - 1;
		if(this.weight < minWeight)
			System.out.println("Fish died");
	}

}
