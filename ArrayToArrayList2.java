package Preparartion2;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;


public class ArrayToArrayList2 {
	public static void main(String[] args) {
	String[] mul= {"jana","david","robert"};
	
	ArrayList<String> vals=new ArrayList<String>(Arrays.asList(mul));
	//Collections.addAll(vals,mul);
	vals.add("dhoni");
	vals.add("kohli");
	System.out.println(vals);
	}

}
