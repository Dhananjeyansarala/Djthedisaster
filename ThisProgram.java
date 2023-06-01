package Preparartion2;

public class ThisProgram {
	String name;
	int salary;
	
	public void print() {
		System.out.println(name+" "+salary);
	}

public ThisProgram(String name,int salary) {
	this.name=name;
	this.salary=salary;
	
	
}
public static void main(String[] args) {
	ThisProgram pro=new ThisProgram("dhanajeyan",25000);
	//System.out.println(pro.name+" "+pro.salary);
	pro.print();
	
	
}
	

}
