package Preparartion2;

public class ExecuteSub implements Subtraction {

	public void sub(int a, int b) {
		System.out.println(a-b);
		
	}
	public static void main(String[] args) {
		ExecuteSub exe=new ExecuteSub();
		exe.sub(40, 30);
	}

}
