package shape;

import java.util.List;

public class SortingTechnique  {
	
	public List<Shape> sortedList(List<Shape> unsortedList){
		boolean sorted = false;
	    Shape temp;
	    int tempx;
	    int tempy;
	    int tempx2;
	    int tempy2;
	    while(!sorted) {
	        sorted = true;
	        for (int i = 0; i < unsortedList.size() - 1; i++) {
	            if (unsortedList.get(i).area > unsortedList.get(i+1).area) {
	                temp = unsortedList.get(i);
	                tempx = unsortedList.get(i).upperX;
	                tempy = unsortedList.get(i).upperY;
	                tempx2 = unsortedList.get(i+1).upperX;
	                tempy2 = unsortedList.get(i+1).upperY;
	                unsortedList.set(i, unsortedList.get(i+1));
	                unsortedList.get(i).setUpperX(tempx);
	                unsortedList.get(i).setUpperY(tempy);	                
	                unsortedList.set(i+1, temp);
	                unsortedList.get(i+1).setUpperX(tempx2);
	                unsortedList.get(i+1).setUpperY(tempy2);
	                sorted = false;
	            }
	        }
	    }
	    
	    return unsortedList;
	}
	
}
