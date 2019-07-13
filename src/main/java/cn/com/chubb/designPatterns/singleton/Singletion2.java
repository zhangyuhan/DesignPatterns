/**
 * 
 */
package cn.com.chubb.designPatterns.singleton;

/**
 * @author Devin 是否 Lazy 初始化：是    是否多线程安全：否   实现难度：易
 */
public class Singletion2 {
	private static Singletion2 instance;

	private Singletion2() {
	}

	public static synchronized Singletion2 getInstance() {
		if (instance == null) {
			instance = new Singletion2();
		}
		return instance;
	}
}
