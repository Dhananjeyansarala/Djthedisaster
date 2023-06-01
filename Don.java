package Preparartion2;

public class Don {
	public static Don obj=null;
	//public Don() {
		
	//}
	public static Don getSingleton() {
		if(obj==null) {
			obj=new Don();
		}
		return obj;
		
	}

}
