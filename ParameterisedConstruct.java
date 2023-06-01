package Preparartion2;

public class ParameterisedConstruct {
	int age;
	String name;
	float weight;
	public ParameterisedConstruct(int age,String name,float weight) {
		this.age=age;
		this.name=name;
		this.weight=weight;
	}
	public static void main(String[] args) {
		ParameterisedConstruct param1=new ParameterisedConstruct(25,"Dhananjeyan",70.50f);
		ParameterisedConstruct param2=new ParameterisedConstruct(32,"suresh",80.50f);
		ParameterisedConstruct param3=new ParameterisedConstruct(24,"Ajay",83.50f);
		ParameterisedConstruct[] param= {param1,param2,param3};	
		
		ParameterisedConstruct a=null;
		int min=param[0].age;
		for(int i=0;i<param.length;i++) {
			if(param[i].age<min) {
				min=param[i].age;
				a=param[i];
		System.out.println(a.age+" "+a.name+" "+a.weight);
//		int min=param[0].age;
//		for(int i=0;i<param.length;i++) {
//			if(param[i].age<min) {
//				min=param[i].age;
			}
		}
		//System.out.println(min);
		
	}
	

}
