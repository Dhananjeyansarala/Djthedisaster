package Preparartion2;

public class ConstructorNoArgs {
	String name;
	public ConstructorNoArgs() {
		name="Dhananjeyan";
		System.out.println("No args");
	}
	public static void main(String[] args) {
		ConstructorNoArgs con=new ConstructorNoArgs();
		System.out.println(con.name);
		
	}

}
