/**
 * 
 */
package cn.com.chubb.designPattern.abstractFactory.main;

import cn.com.chubb.designPattern.abstractFactory.color.Color;
import cn.com.chubb.designPattern.abstractFactory.shape.Shape;

/**
 * @author Devin
 *
 */
public abstract class AbstractFactory {
	
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape) ;
}
