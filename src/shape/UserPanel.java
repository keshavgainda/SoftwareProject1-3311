package shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;


public class UserPanel extends JPanel implements ActionListener  {
	
	/**
	 * This method creates two rectangles
	 * @return
	 */
	public static boolean isPressed = false;
	public static boolean isSorted = false;
	public static List<Shape> shapes;
	
	
   /**
    * This is the main method of the class.
    * @param args
    *
    */
   public static void main(String[] args) {
      UserPanel panel = new UserPanel();
      JFrame frame = new JFrame("Display Shapes");
      JButton button = new JButton();
      button.setText("Load Shapes");
      JButton button2 = new JButton();
      panel.add(button);
      button.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			isPressed = true;
			panel.repaint();
			
		}
    	  
      });
      panel.add(button2);
      button2.setText("Sort Shapes");
      button2.addActionListener(new ActionListener() {

  		@Override
  		public void actionPerformed(ActionEvent e) {
  			// TODO Auto-generated method stub
  			isPressed = true;
  			isSorted = true;
  			panel.repaint();

  			
  		}
      	  
        });
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(panel);
      frame.setSize(600, 600);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.getContentPane().setLayout(null);
   }
   
   /**
	 * This method displays the created shapes.
	 */
  public void paintComponent(Graphics g) {
     super.paintComponent(g);
     Graphics2D g2d = (Graphics2D) g;
     Graphics2D g3d = (Graphics2D) g;
     if(isPressed && !isSorted) {
	    	  ShapeFactory makeshapes = new ShapeFactory();
	    	  makeshapes.createTwoRectangles();
	    	  makeshapes.createThreeCircles();
	    	  makeshapes.createSquare();
	    	  shapes = makeshapes.shapesList();
	    	  for(Shape shape : shapes) {
	    		  g2d.setColor(shape.getColor());
	        	  shape.drawShape(g2d); 
	    	  }
	    	  isPressed = false;
     }
     else if(isPressed && isSorted) {
    	 SortingTechnique sortedList = new SortingTechnique();
    	 List<Shape> sortedShapes = sortedList.sortedList(shapes);
    	 for(Shape shape : sortedShapes) {
   		  g3d.setColor(shape.getColor());
       	  shape.drawShape(g3d); 
   	  }
    	 isPressed=false;
    	 isSorted = false;
     }
	      	
  }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}


 
}
 


