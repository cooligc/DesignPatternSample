/**
 * 
 */
package singleton;

/**
 * @author sitakant
 *
 */
public class MySingetonClass {
	
	private static MySingetonClass mySingleTon = new MySingetonClass();

	private MySingetonClass() {
		System.out.println("Constructor");
	}
	
	
	public static MySingetonClass getInstance() {
		if(mySingleTon == null) {
			mySingleTon = new MySingetonClass();
		}
		return mySingleTon;
	}
}
