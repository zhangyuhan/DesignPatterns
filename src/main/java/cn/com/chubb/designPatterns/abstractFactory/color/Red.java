/**
 * 
 */
package cn.com.chubb.designPatterns.abstractFactory.color;

/**
 * @author Devin
 *
 */
public class Red implements Color {

	/* (non-Javadoc)
	 * @see cn.com.chubb.designPattern.abstractFactory.color.Color#fill()
	 */
	@Override
	public void fill() {
		 System.out.println("Inside Red::fill() method.");
	}

}
