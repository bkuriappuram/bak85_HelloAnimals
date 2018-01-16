import java.util.ArrayList;

public class Tester { //tests functionality

	public static void main(String[] args) {
		
		Mammal dog = new Mammal(); //creates objects
		Fish bass = new Fish();
		Bird cockatoo = new Bird();
		
		ArrayList<Animal> animalList = new ArrayList<Animal>(); ////arrayList logic from https://gist.github.com/ecornell/83018875ed1abd71f8fc
		
		animalList.add(dog); //adds to arrayList
		animalList.add(bass);
		animalList.add(cockatoo); 
		
		for (Animal animal : animalList) { //prints the objects
			System.out.println(animal.toString());
			animal.exercise();
			System.out.println(animal.toString());
			System.out.println("\n");
		}
		
		System.out.println("Testing minWeight parameter...\n");
		
		cockatoo.exercise(); //testing minWeight parameter
		System.out.println(cockatoo.toString());
		cockatoo.exercise();
		System.out.println(cockatoo.toString());
		cockatoo.exercise();
		System.out.println(cockatoo.toString());
		cockatoo.exercise();
		System.out.println(cockatoo.toString());
		
	}

}
