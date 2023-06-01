package Preparartion2;

import java.util.ArrayList;

public class Briyani {
	public static void main(String[] args) {
		ArrayList<String> bri=new ArrayList<>();
		bri.add("DumBiriyani");
		bri.add("HyderabadBiriyani");
		bri.add("ThalapakattiBiriyani");
		bri.add("FivestarBiriyani");
		System.out.println(bri);
		bri.remove(3);
		System.out.println(bri);
		bri.set(2, "ThindukalBiriyani");
		System.out.println(bri);
		
	}

}
