package structural.adaptor;

import java.util.Arrays;

public class Demo {

	
	public static void main(String[] args) {
		
		/* SYSTEM 1*/
		Product product = new Product("AA", "BB", Arrays.asList("X","Y","Z"));
		App1 app1 = new App1(product);
		System.out.println(app1);
		
		
		/* SYSTEM 2*/
		Product2 product2 = new Adaptor(product).getProduct();
		App2 app2 = new App2(product2);
		System.out.println(app2);
		
		
		
	}
	
}
