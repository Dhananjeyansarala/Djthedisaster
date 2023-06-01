package Preparartion2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {
	public static void main(String[]args) {
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(50);
		nums.add(40);
		nums.add(30);
		Integer [] arrest=new Integer[nums.size()];
		arrest=nums.toArray(arrest);
//		for(Integer x:add) {
//			System.out.println(x+"value present");
//		}
		for(int i=0;i<arrest.length;i++) {
			System.out.println(arrest[i]);
		}
		}
	}


