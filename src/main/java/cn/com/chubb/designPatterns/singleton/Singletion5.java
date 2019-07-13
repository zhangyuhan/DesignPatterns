/**
 * 
 */
package cn.com.chubb.designPatterns.singleton;

/**
 * @author Devin
 */
public class Singletion5 {
	
	private static class SingletonHolder {
		private static final Singletion5 INSTANCE = new Singletion5();
	}

	private Singletion5() {
	}

	public static final Singletion5 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
