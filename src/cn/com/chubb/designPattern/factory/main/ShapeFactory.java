package cn.com.chubb.designPattern.factory.main;

import cn.com.chubb.designPattern.factory.shape.Circle;
import cn.com.chubb.designPattern.factory.shape.Rectangle;
import cn.com.chubb.designPattern.factory.shape.Shape;
import cn.com.chubb.designPattern.factory.shape.ShapeEnum;
import cn.com.chubb.designPattern.factory.shape.ShapeEnumOne;
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

	// 使用枚举来替代获取对象类型的判断
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

	// 使用反射替换if else 和 switch 等判断
	public Shape getShapeTwo(ShapeEnumOne shapeEnumOne) {

		Shape shape = null;
		try {
			shape = (Shape) Class.forName("cn.com.chubb.designPattern.factory.shape." + shapeEnumOne.getName())
					.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return shape;
	}

	// 使用范型来替换实现通用工厂模型
	@SuppressWarnings("unchecked")
	public <T> T getShapeThree(Enum<?> shapeEnum) {

		T obj = null;
		try {
			obj = (T) Class.forName(shapeEnum.toString())
					.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return obj;
	}

}
