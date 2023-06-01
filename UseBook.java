package Preparartion2;

public class UseBook {
	public static void main(String[] args) {
		Book b=new Book();
		b.setName("classmate");
		b.setPrice(500);
		b.setIsQuality(true);
		System.out.println(b.getName()+" "+b.getPrice()+" "+b.getIsQuality());
		
	}

}
