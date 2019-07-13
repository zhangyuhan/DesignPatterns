/**
 * 
 */
package cn.com.chubb.designPatterns.builder;

/**
 * @author Devin
 *
 */
public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
