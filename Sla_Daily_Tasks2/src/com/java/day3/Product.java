package com.java.day3;

public class  Product{
	
	int productId;
	String productName;
	double price;
	
	Product(){
		productId = 1001;
		productName = "Laptop";
		price = 50000;
	}
	Product(int productId,String productName){
		this.productId = productId;
		this.productName = productName;
	}
	Product(int productId,String productName,double price){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	
   void	disp(){
		System.out.println("productId: "+productId);
		System.out.println("productName: " +productName);
		System.out.println("price: "+price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Product obj1 = new Product();
      obj1.disp();
      Product obj2 = new Product(1002,"Mouse");
      obj2.disp();
      Product obj3 = new Product(1003,"Keyboard",2000);
      obj3.disp();
	}

}



/*Output
 * productId: 1001 
 * productName: Laptop
 * price: 50000.0 
 * productId: 1002
 * productName: Mouse 
 * price: 0.0 
 * productId: 1003
 *  productName: Keyboard 
 *  price:2000.0
 * 
 */