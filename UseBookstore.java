package Preparartion2;

import java.util.ArrayList;

public class UseBookstore {
	public static void main(String[] args) {
		Bookstore book1=new Bookstore("Aashiq",500,"black");
		Bookstore book2=new Bookstore("Thamarai",1000,"blue");
		Bookstore book3=new Bookstore("sathiya",1500,"white");
		
		ArrayList<Bookstore> books=new ArrayList<>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		//System.out.println(books);
		//for(int i=0;i<books.size();i++) {
//			if(books.get(i).getPrice()>700) {
//				System.out.println(books.get(i));
//			}
			books.forEach((x)->{if(x.getPrice()>800)
					{System.out.println(x);}});
		//}
		
	}

}
