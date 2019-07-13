/**
 * 
 */
package cn.com.chubb.designPatterns.singleton;

/**
 * @author Devin
 */
public class Singletion4 {
	private volatile static Singletion4 singleton;

	private Singletion4 (){}

	public static Singletion4 getSingleton() {
		if (singleton == null) {
			synchronized (Singletion4.class) {
				if (singleton == null) {
					singleton = new Singletion4();
				}
			}
		}
		return singleton;
	}
}
