package Preparartion2;

import java.util.ArrayList;

public class ArrayProgram {
	public static void main(String[] args) {
		String a="dhana";
		String b="Guna";
		String c="benny";
		ArrayList<String> array=new ArrayList<>();
		array.add(a);
		array.add(b);
		array.add(c);
		
		for(int i=0;i<array.size();i++) {
		//System.out.println(array.get(i));
			//System.out.println("\n");
		//array.remove(a);
		//System.out.println(array.get(i));
		System.out.println("\n");
		array.set(1, "Jajina");
		System.out.println(array.get(i));
		
			//array.forEach(x->System.out.println(x));
		}
		
	}

}
