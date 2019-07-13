package cn.com.chubb.designPatterns.abstractFactory.shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
