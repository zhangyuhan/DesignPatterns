/**
 * 
 */
package cn.com.chubb.designPattern.abstractFactory.color;

/**
 * @author Devin
 *
 */
public class Blue implements Color {

	/* (non-Javadoc)
	 * @see cn.com.chubb.designPattern.abstractFactory.color.Color#fill()
	 */
	@Override
	public void fill() {
		 System.out.println("Inside Blue::fill() method.");
	}

}
