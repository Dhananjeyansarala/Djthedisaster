package Preparartion2;

public abstract class ElectronicProduct {
	public abstract String getProduct(String fan);
	public String getPrice(int price) {
		if(price>1000) {
			return "Buy";
		}
		else {
		return "Not Buy";
		
		}
	}

}
