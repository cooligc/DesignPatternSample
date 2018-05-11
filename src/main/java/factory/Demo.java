/**
 * 
 */
package factory;

/**
 * @author chaudhsi
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//MyFactory factory = new MyFactory();
		MyFactory.getInstanceAFactory("land","man").whoIm();
		MyFactory.getInstanceAFactory("water","crab").whoIm();
	}

}
