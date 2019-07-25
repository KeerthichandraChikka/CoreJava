package interview;

class Animal {

	public void eat() {
		System.out.println("Animal is eating");
	}

	public void sleep() {
		System.out.println("Animal is sleeping");
	}

}

class Dog extends Animal {
	public void sleep() {
		System.out.println("Dog is sleeping");
	}
	public void eat() {
		System.out.println("Dog is eating");
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Dog();
		animal.sleep();
		animal.eat();

	}

}
