package oopintro;

public class Product {
	
	public Product() {
	System.out.println("Ben �al��t�m");
	}
	
	public Product(int id, String name, double unitPrice,String detail) {
	
		this(); //constructor bu �ekilde �al���yor ben �al��t�m k�sm�
		this.id = id;
		this.name = name;
		this.unitPrice =unitPrice;
		this.detail = detail;
	}	
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
}
