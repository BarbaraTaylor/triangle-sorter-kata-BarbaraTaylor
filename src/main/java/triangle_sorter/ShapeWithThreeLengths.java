package triangle_sorter;

import java.util.Arrays; 

public class ShapeWithThreeLengths {
	
	boolean isAnActualTriangle = false;
	int sideA;
	int sideB;
	int sideC;
	
	public ShapeWithThreeLengths (int A, int B, int C) {
		this.sideA = A;
		this.sideB = B;
		this.sideC = C;
	}

	public boolean isAnActualTriangle() {
		int[] sidesArray = {this.sideA, this.sideB, this.sideC};
		Arrays.parallelSort(sidesArray);
		 if (sidesArray[0] + sidesArray[1] > sidesArray[2]) {
			 return true;
		 }
		 else {
			 return false;
		 }
	}
	
	
	

	
	
	

}
