/**
 * 
 */
package cn.com.chubb.designPatterns.singleton;

/**
 * @author Devin
 *
 */
public class Singletion1 {
	private static Singletion1 instance;

	private Singletion1() {
	}

	public static Singletion1 getInstance() {
		if (instance == null) {
			instance = new Singletion1();
		}
		return instance;
	}
}
