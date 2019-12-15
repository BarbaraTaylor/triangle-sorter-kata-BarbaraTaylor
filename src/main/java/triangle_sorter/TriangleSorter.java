//package triangle_sorter;



//public class TriangleSorter {
//	
//    public String analyze(int sideA, int sideB, int sideC) {
//	
//    	if (isAnIsoscelesTriangle(sideA, sideB, sideC)) {
//    		return "Isosceles"; 
//    	}
//    	else if (isAnEquilateralTriangle(sideA, sideB, sideC)) {
//    		return "Equilateral";
//    	}
//        else if (isARightTriangle(sideA, sideB, sideC)) {
//        	return "Right";
//    	} 
//    	else {
//    		return "Anything";
//    	}
//    }
//
//	private boolean isAnIsoscelesTriangle(int sideA, int sideB, int sideC) {
//    	boolean result = 
//    		(((sideA==sideB)||(sideB==sideC)||(sideA==sideC)) && 
//    		((sideA!=sideB)||(sideB!=sideC)||(sideA!=sideC)));
//    	return result;
//    }
//	
//    private boolean isAnEquilateralTriangle(int sideA, int sideB, int sideC) {
//    	boolean result = ((sideA==sideB)&&(sideB==sideC));
//    	return result;
//    }
//    
//    private boolean isARightTriangle(int sideA, int sideB, int sideC) {
//    	int smallestSide, midLengthSide, longestSide;
//    	if (sideA > sideB) {
//    		midLengthSide = sideA;
//    		smallestSide = sideB;
//    		if (sideC > sideB) {
//    		
//    		}
//    	}
//    	
//    	sideC = longestSide;
//    	boolean result = ((sideA*sideA)+(sideB*sideB)==(sideC*sideC));
// 		return result;
// 	}
//}

