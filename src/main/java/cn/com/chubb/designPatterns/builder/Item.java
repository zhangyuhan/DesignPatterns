/**
 * 
 */
package cn.com.chubb.designPatterns.builder;

/**
 * @author Devin
 *
 */
public interface Item {
	public String name();

	public Packing packing();

	public float price();
}
