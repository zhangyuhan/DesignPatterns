/**
 * 
 */
package cn.com.chubb.designPatterns.prototype;

/**
 * @author Devin
 *
 */
public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}
