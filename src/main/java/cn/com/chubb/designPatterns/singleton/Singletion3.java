/**
 * 
 */
package cn.com.chubb.designPatterns.singleton;

/**
 * @author Devin 
 */
public class Singletion3 {
	private static Singletion3 instance = new Singletion3();

	private Singletion3() {
	}

	public static Singletion3 getInstance() {
		return instance;
	}
}
