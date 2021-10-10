package shape;

import java.awt.Color;
import java.awt.Graphics;


public class MySquare extends Shape{
	
	
	/**
	 * Class's constructor
	 * @param upperX
	 * @param upperY
	 * @param width
	 * @param height
	 * @param shapeColor
	 */
	
	public MySquare (int upperX, int upperY, int width, int height, Color shapeColor) {
		super(upperX, upperY, width, height, shapeColor);
	}
	
	@Override
	public int surfaceArea() {
		area = super.width * super.height;
		return area;
	}

	@Override
	public void drawShape(Graphics form) {
		// TODO Auto-generated method stub
		form.fillRect(upperX, upperY, width, height);
	}
	

}
