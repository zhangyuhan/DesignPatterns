/**
 * 
 */
package cn.com.chubb.designPattern.singleton;

/**
 * @author Devin
 *
 */
public class Singletion {

	// 创建 Singletion 的一个对象
	private static Singletion instance = new Singletion();

	// 让构造函数为 private，这样该类就不会被实例化
	private Singletion() {
	}

	// 获取唯一可用的对象
	public static Singletion getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
	
}
