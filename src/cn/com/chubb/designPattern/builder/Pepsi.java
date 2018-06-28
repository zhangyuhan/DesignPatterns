/**
 * 
 */
package cn.com.chubb.designPattern.builder;

/**
 * @author Devin
 *
 */
public class Pepsi extends ColdDrink {

	@Override
	public float price() {
		return 35.0f;
	}

	@Override
	public String name() {
		return "Pepsi";
	}

}
