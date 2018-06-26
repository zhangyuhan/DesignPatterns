package cn.com.chubb.designPattern.factory.main;

import cn.com.chubb.designPattern.factory.shape.Circle;
import cn.com.chubb.designPattern.factory.shape.Rectangle;
import cn.com.chubb.designPattern.factory.shape.Shape;
import cn.com.chubb.designPattern.factory.shape.ShapeEnum;
import cn.com.chubb.designPattern.factory.shape.Square;

public class ShapeFactory {

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
	
	//使用枚举来替代获取对象类型的判断
	public Shape getShapeOne(ShapeEnum shapeEnum) {
		
		Shape shape = null;
		
		switch (shapeEnum) {
		case CIRCLE:
			shape = new Circle();
			break;
		case SQUARE:
			shape = new Square();
			break;
		case RECTANGLE:
			shape = new Rectangle();
			break;
		default:
			break;
		}
		
		return shape;
	}
	
}
