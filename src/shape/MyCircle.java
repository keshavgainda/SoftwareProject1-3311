package shape;


import java.awt.Color;
import java.awt.Graphics;


public class MyCircle extends Shape{

	/**
	 * Class's constructor
	 * @param upperX
	 * @param upperY
	 * @param arcWidth
	 * @param arcHeight
	 * @param shapeColor
	 */
	
	public MyCircle(int upperX, int upperY, int width, int height, Color shapeColor) {
		// TODO Auto-generated constructor stub
		super(upperX, upperY, width, height, shapeColor);
	}
	
	@Override
	public int surfaceArea() {
		area = (int) (0.5*3.14* (0.5* super.width));
		return area;
	}
	
	@Override
	public void drawShape(Graphics form) {
		// TODO Auto-generated method stub
		form.fillOval(upperX, upperY, width, height);
		
	}
}
