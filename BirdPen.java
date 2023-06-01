package Preparartion2;

public class BirdPen extends Penguin {
	
	public void fly() {
		System.out.println("The bird flies");
	}
	public void eat() {
		System.out.println("The bird eats");
	}
	public static void main(String[] args) {
		
		BirdPen b=new BirdPen();
		b.fly();
		b.eat();
	}

}
