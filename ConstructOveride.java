package Preparartion2;

public class ConstructOveride {
	String name;
	int age;
	public ConstructOveride() {
		name="dhananjeyan";
		age=25;
	}
	public ConstructOveride(String name,int age) {
		this.name=name;
		this.age=age;
		
	}
	public static void main(String[] args) {
		ConstructOveride con=new ConstructOveride();
		ConstructOveride con1=new ConstructOveride("suresh",50);
		
		System.out.println(con.name+" "+con.age);
		System.out.println(con1.name+" "+con1.age);
		
	}

}
