package triangle_sorter;

import java.util.Arrays; 

public class ShapeWithThreeLengths {
	
	private int sideA;
	private int sideB;
	private int sideC;
	
	public ShapeWithThreeLengths (int A, int B, int C) {
		this.sideA = A;
		this.sideB = B;
		this.sideC = C;
	}

	public boolean isAnActualTriangle() {
		int[] sidesArray = {this.sideA, this.sideB, this.sideC};
		Arrays.parallelSort(sidesArray);
		boolean isATriangle;
		 if (sidesArray[0] + sidesArray[1] > sidesArray[2]) {
			 isATriangle = true;
		 }
		 else {
			 isATriangle = false;
		 }
		 return isATriangle;
	}
	
	
	

	
	
	

}
