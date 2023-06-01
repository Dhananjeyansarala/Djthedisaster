package Preparartion2;

public class UseDon {
	public static void main(String[] args) {
		Don update = Don.getSingleton();
		Don update1= Don.getSingleton();
		System.out.println(update.hashCode());
		System.out.println(update1.hashCode());
	}

}
