package Preparartion2;

public class Convert extends AbstractConstruct{

	public Convert(int age, String name) {
		super(age, name);
		
	}
	public static void main(String[] args) {
		Convert c=new Convert(25,"jana");
		System.out.println(c.age+" "+c.name);
	}
	

}
