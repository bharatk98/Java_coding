package day5;

public class Cat extends Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Meow");
	}
	public static void main(String[] args) {
		Animal obj = new Cat();
		obj.sound();
	}
}
