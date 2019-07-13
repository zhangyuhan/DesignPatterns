/**
 * 
 */
package cn.com.chubb.designPatterns.abstractFactory.color;

import cn.com.chubb.designPatterns.abstractFactory.main.AbstractFactory;
import cn.com.chubb.designPatterns.abstractFactory.shape.Shape;

/**
 * @author Devin
 *
 */
public class ColorFactory extends AbstractFactory {

	/* (non-Javadoc)
	 * @see cn.com.chubb.designPattern.abstractFactory.main.AbstractFactory#getColor(java.lang.String)
	 */
	@Override
	public Color getColor(String color) {
		if(color == null){
	         return null;
	      }        
	      if(color.equalsIgnoreCase("RED")){
	         return new Red();
	      } else if(color.equalsIgnoreCase("GREEN")){
	         return new Green();
	      } else if(color.equalsIgnoreCase("BLUE")){
	         return new Blue();
	      }
	      return null;
	}

	/* (non-Javadoc)
	 * @see cn.com.chubb.designPattern.abstractFactory.main.AbstractFactory#getShape(java.lang.String)
	 */
	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
