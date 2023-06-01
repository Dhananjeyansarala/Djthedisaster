package Preparartion2;

public class AbstractConstruct2 extends AbstractConstruct {

	public AbstractConstruct2(int age, String name) {
		super(age, name);
	
	}
	public static void main(String[] args) {
		AbstractConstruct2 ab=new AbstractConstruct2(40,"suresh");
		System.out.println(ab.age+ab.name);
	}
	

}
