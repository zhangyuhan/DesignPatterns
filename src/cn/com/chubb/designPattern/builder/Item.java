/**
 * 
 */
package cn.com.chubb.designPattern.builder;

/**
 * @author Devin
 *
 */
public interface Item {
	public String name();

	public Packing packing();

	public float price();
}
