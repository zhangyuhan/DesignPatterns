/**
 * 
 */
package cn.com.chubb.designPatterns.abstractFactory.main;

import cn.com.chubb.designPatterns.abstractFactory.color.Color;
import cn.com.chubb.designPatterns.abstractFactory.shape.Shape;

/**
 * @author Devin
 *
 */
public abstract class AbstractFactory {
	
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape) ;
}
