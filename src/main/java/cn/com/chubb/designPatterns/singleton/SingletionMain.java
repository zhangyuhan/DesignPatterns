/**
 * 
 */
package cn.com.chubb.designPatterns.singleton;

/**
 * @author Devin
 *
 */
public class SingletionMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 不合法的构造函数
		// 编译时错误：构造函数 SingleObject() 是不可见的
		// SingleObject object = new SingleObject();

		// 获取唯一可用的对象
		Singletion object = Singletion.getInstance();

		// 显示消息
		object.showMessage();
		
		
		Singletion6 con1 = SingletionEnum.DATASOURCE.getConnection();
		Singletion6 con2 = SingletionEnum.DATASOURCE.getConnection();
        System.out.println(con1 == con2);
        
        Singletion7 con71 = Singletion7.getInstance();
		Singletion7 con72 = Singletion7.getInstance();
        System.out.println(con71 == con72);

	}

}
