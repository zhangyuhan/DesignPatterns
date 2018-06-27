/**
 * 
 */
package cn.com.chubb.designPattern.singleton;

/**
 * @author Devin
 */
public class Singletion7 {
	
	private static Singletion7 INSTANCE;
	
	static {
		INSTANCE = new Singletion7();
	}

	private Singletion7() {
	}

	public static final Singletion7 getInstance() {
		return INSTANCE;
	}
}
