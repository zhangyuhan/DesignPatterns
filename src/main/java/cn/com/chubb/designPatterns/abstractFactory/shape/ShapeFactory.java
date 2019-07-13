package cn.com.chubb.designPatterns.abstractFactory.shape;

import cn.com.chubb.designPatterns.abstractFactory.color.Color;
import cn.com.chubb.designPatterns.abstractFactory.main.AbstractFactory;

public class ShapeFactory extends AbstractFactory{

	// 使用 getShape 方法获取形状类型的对象 原始方法
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see cn.com.chubb.designPattern.abstractFactory.main.AbstractFactory#getColor(java.lang.String)
	 */
	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
