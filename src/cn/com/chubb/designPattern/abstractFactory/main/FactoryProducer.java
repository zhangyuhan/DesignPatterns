/**
 * 
 */
package cn.com.chubb.designPattern.abstractFactory.main;

import cn.com.chubb.designPattern.abstractFactory.color.ColorFactory;
import cn.com.chubb.designPattern.abstractFactory.shape.ShapeFactory;

/**
 * @author Devin
 *
 */
public class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice){
	      if(choice.equalsIgnoreCase("SHAPE")){
	         return new ShapeFactory();
	      } else if(choice.equalsIgnoreCase("COLOR")){
	         return new ColorFactory();
	      }
	      return null;
	   }
}
