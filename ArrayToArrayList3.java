package Preparartion2;

import java.util.ArrayList;

public class ArrayToArrayList3 {
	public static void main(String[] args) {
		String[] names= {"dhana","candy","boy"};
		ArrayList<String> vals=new ArrayList<>();
		for(String x:names) {
		vals.add(x);

		System.out.println(vals);
		}
	}

}
