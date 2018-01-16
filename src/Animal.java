
public abstract class Animal { //an abstract class representing an animal
	
	protected int age;
	protected String color;
	protected String type;
	protected int weight;
	protected int minWeight;
	
	public Animal() { //constructor
		age = 0;
		color = "Black";
		type = "Animal";
		weight = 5;
		minWeight = 1;
	}

	public void eat() { //eating function
		
	}
	
	public void exercise() { //exercising function
		
	}

	@Override
	public String toString() { //overrides toString method
		return "Animal [age=" + age + ", color=" + color + ", type=" + type + ", weight=" + weight + ", minWeight="
				+ minWeight + "]";
	}

	
}
