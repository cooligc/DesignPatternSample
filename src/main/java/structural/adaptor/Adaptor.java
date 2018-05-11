package structural.adaptor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Adaptor extends Product2{

	private Product products = null;
	
	public Adaptor(String name, String type, Set<String> skus) {
		super(name, type, skus);
	}
	
	public Adaptor(Product product) {
		this.products = product;
	}
	
	public void setProduct(Product product) {
		this.products = product;
	}
	
	public Adaptor getProduct() {
		setName(this.products.getName());
		setType(this.products.getType());
		setSkus(new HashSet<String>(this.products.getSkus()));
		return this;
	}
	
	/// Triple Pin
	
	/// Fourth Pin
}


class Product{
	String name;
	String type;
	List<String> skus;
	
	
	/**
	 * @param name
	 * @param type
	 * @param skus
	 */
	public Product(String name, String type, List<String> skus) {
		super();
		this.name = name;
		this.type = type;
		this.skus = skus;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the skus
	 */
	public List<String> getSkus() {
		return skus;
	}
	/**
	 * @param skus the skus to set
	 */
	public void setSkus(List<String> skus) {
		this.skus = skus;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [name=" + name + ", type=" + type + ", skus=" + skus + "]";
	}
	
	
	
}


class App1 {
	Product product = null;
	
	public App1(Product product){
		this.product = product;
	}
	
	public Product getProducts(){
		return this.product;
	}
	
	@Override
	public String toString() {
		return product.toString();
	}
}

class Product2{
	String name;
	String type;
	Set<String> skus;
	
	
	public Product2() {
		
	}
	
	/**
	 * @param name
	 * @param type
	 * @param skus
	 */
	public Product2(String name, String type, Set<String> skus) {
		super();
		this.name = name;
		this.type = type;
		this.skus = skus;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}


	/**
	 * @return the skus
	 */
	public Set<String> getSkus() {
		return skus;
	}


	/**
	 * @param skus the skus to set
	 */
	public void setSkus(Set<String> skus) {
		this.skus = skus;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product2 [name=" + name + ", type=" + type + ", skus=" + skus + "]";
	}
	
	
	
}

class App2 {
	Product2 products = null;
	public App2(Product2 products) {
		this.products = products;
	}
	
	
	public Product2 getProducts(){
		return this.products;
	}
	
	@Override
	public String toString() {
		return products.toString();
	}
}