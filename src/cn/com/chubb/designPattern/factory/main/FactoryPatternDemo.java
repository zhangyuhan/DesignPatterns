package cn.com.chubb.designPattern.factory.main;

import cn.com.chubb.designPattern.factory.shape.Shape;
import cn.com.chubb.designPattern.factory.shape.ShapeEnum;
import cn.com.chubb.designPattern.factory.shape.ShapeEnumOne;

public class FactoryPatternDemo {
	
//	public static void main(String[] args) {
//	      ShapeFactory shapeFactory = new ShapeFactory();
//	 
//	      //获取 Circle 的对象，并调用它的 draw 方法
//	      Shape shape1 = shapeFactory.getShape("CIRCLE");
//	 
//	      //调用 Circle 的 draw 方法
//	      shape1.draw();
//	 
//	      //获取 Rectangle 的对象，并调用它的 draw 方法
//	      Shape shape2 = shapeFactory.getShape("RECTANGLE");
//	 
//	      //调用 Rectangle 的 draw 方法
//	      shape2.draw();
//	 
//	      //获取 Square 的对象，并调用它的 draw 方法
//	      Shape shape3 = shapeFactory.getShape("SQUARE");
//	 
//	      //调用 Square 的 draw 方法
//	      shape3.draw();
//	   }
		
//	public static void main(String[] args) {
//	      ShapeFactory shapeFactory = new ShapeFactory();
//	 
//	      //获取 Circle 的对象，并调用它的 draw 方法
//	      Shape shape1 = shapeFactory.getShapeOne(ShapeEnum.CIRCLE);
//	 
//	      //调用 Circle 的 draw 方法
//	      shape1.draw();
//	 
//	      //获取 Rectangle 的对象，并调用它的 draw 方法
//	      Shape shape2 = shapeFactory.getShapeOne(ShapeEnum.RECTANGLE);
//	 
//	      //调用 Rectangle 的 draw 方法
//	      shape2.draw();
//	 
//	      //获取 Square 的对象，并调用它的 draw 方法
//	      Shape shape3 = shapeFactory.getShapeOne(ShapeEnum.SQUARE);
//	 
//	      //调用 Square 的 draw 方法
//	      shape3.draw();
//	   }
	
//	public static void main(String[] args) {
//	      ShapeFactory shapeFactory = new ShapeFactory();
//	 
//	      //获取 Circle 的对象，并调用它的 draw 方法
//	      Shape shape1 = shapeFactory.getShapeTwo(ShapeEnumOne.CIRCLE);
//	 
//	      //调用 Circle 的 draw 方法
//	      shape1.draw();
//	 
//	      //获取 Rectangle 的对象，并调用它的 draw 方法
//	      Shape shape2 = shapeFactory.getShapeTwo(ShapeEnumOne.RECTANGLE);
//	 
//	      //调用 Rectangle 的 draw 方法
//	      shape2.draw();
//	 
//	      //获取 Square 的对象，并调用它的 draw 方法
//	      Shape shape3 = shapeFactory.getShapeTwo(ShapeEnumOne.SQUARE);
//	 
//	      //调用 Square 的 draw 方法
//	      shape3.draw();
//	   }
	
	public static void main(String[] args) {
	      ShapeFactory shapeFactory = new ShapeFactory();
	 
	      //获取 Circle 的对象，并调用它的 draw 方法
	      Shape shape1 = shapeFactory.getShapeThree(ShapeEnumOne.CIRCLE);
	 
	      //调用 Circle 的 draw 方法
	      shape1.draw();
	 
	      //获取 Rectangle 的对象，并调用它的 draw 方法
	      Shape shape2 = shapeFactory.getShapeThree(ShapeEnumOne.RECTANGLE);
	 
	      //调用 Rectangle 的 draw 方法
	      shape2.draw();
	 
	      //获取 Square 的对象，并调用它的 draw 方法
	      Shape shape3 = shapeFactory.getShapeThree(ShapeEnumOne.SQUARE);
	 
	      //调用 Square 的 draw 方法
	      shape3.draw();
	   }
}
