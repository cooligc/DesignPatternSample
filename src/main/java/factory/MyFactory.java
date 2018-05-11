/**
 * 
 */
package factory;

/**
 * @author chaudhsi
 *
 */
public class MyFactory {

	private static Animal animal;
	
	public static Animal getInstanceLFactory(String type) {
		if(type.equalsIgnoreCase("man")) {
			animal = new Man();
		}
		if(type.equalsIgnoreCase("goat")) {
			animal = new Goat();
		}
		
		return animal;
	}
	
	public static Animal getInstanceWFactory(String type) {

		if(type.equalsIgnoreCase("fish")) {
			animal = new Fish();
		}
		if(type.equalsIgnoreCase("crab")) {
			animal = new Crab();
		}
		return animal;
	}
	
	public static Animal getInstanceAFactory(String factoryType,String type) {
		if(factoryType.equalsIgnoreCase("land")) {
			animal = MyFactory.getInstanceLFactory(type);
		}
		if(factoryType.equalsIgnoreCase("water")) {
			animal = MyFactory.getInstanceWFactory(type);
		}
		return animal;
	}
	
}


interface Animal{
	void whoIm();
}

abstract class LandAnimal implements Animal{}

class Man extends LandAnimal{
	
	public void whoIm() {
		System.out.println(" I am a man");
	}
	
}

class Goat extends LandAnimal{
	public void whoIm() {
		System.out.println("I am a Goat");
	}
}

abstract class WaterAnimal implements Animal{}

class Fish extends WaterAnimal{
	public void whoIm() {
		System.out.println("I am a Fish");
	}
}

class Crab extends WaterAnimal{
	public void whoIm() {
		System.out.println("I am a Crab");
	}
}
