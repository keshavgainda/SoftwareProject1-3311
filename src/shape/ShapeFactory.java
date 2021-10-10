package shape;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class ShapeFactory {
	public static List<Shape> shape = new ArrayList<Shape>();
	
	public void createTwoRectangles(){
		Color myColor1 = new Color(231, 151, 44);
		MyRectangle rectangleShape1 = new MyRectangle (50, 50, 44, 48, myColor1);
		rectangleShape1.surfaceArea();
		   
		Color myColor2 = new Color(131, 151, 44);
		MyRectangle rectangleShape2 = new MyRectangle (150, 150, 72, 45, myColor2);
		rectangleShape2.surfaceArea();
		
		shape.add(rectangleShape1);
		shape.add(rectangleShape2);
		
	}
	public void createThreeCircles(){
		Color myColor1 = new Color(136, 127, 45);
		MyCircle circleShape1 = new MyCircle (200, 200, 45, 45, myColor1);
		circleShape1.surfaceArea();
		   
		Color myColor2 = new Color(138, 201, 54);
		MyCircle circleShape2 = new MyCircle (250, 250, 50, 50, myColor2);
		circleShape2.surfaceArea();
		
		Color myColor3 = new Color(0, 0, 0);
		MyCircle circleShape3 = new MyCircle (300, 300, 40, 40, myColor3);
		circleShape3.surfaceArea();
		
		shape.add(circleShape1);
		shape.add(circleShape2);
		shape.add(circleShape3);
		
	}
	
	public void createSquare(){
		Color myColor1 = new Color(120, 127, 45);
		MySquare squareShape1 = new MySquare (400, 400, 55, 55, myColor1);
		squareShape1.surfaceArea();
		
		shape.add(squareShape1);
		
	}
	
	public List<Shape> shapesList(){
		return ShapeFactory.shape;
	}
}
