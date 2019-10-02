package triangle_sorter;

import java.util.Arrays; 

public class Triangle extends ShapeWithThreeLengths {
	
	public Triangle (int sideA, int sideB, int sideC) {
		super(sideA, sideB, sideC);
	}

	public boolean isAnEquilateralTriangle() {
		if ((this.sideA==this.sideB)&&(this.sideB==this.sideC)) {
			return true;
		}
		else {
			return false;
		}
	}

	// Returns true only if triangle is isosceles but NOT equilateral
	public boolean isAnIsoscelesTriangle() {
		if ( ((this.sideA==this.sideB)&&(this.sideA!=this.sideC)) ||
				((this.sideB==this.sideC)&&(this.sideB!=this.sideA)) ||
				((this.sideA==this.sideC)&&(this.sideA!=this.sideB)) ) {
			return true;			
		}
		else {
			return false;
		}
	}

	public boolean isARightTriangle() {
		int[] sidesArray = {this.sideA, this.sideB, this.sideC};
		Arrays.parallelSort(sidesArray);
		if ( ((sidesArray[0]*sidesArray[0]) + (sidesArray[1]*sidesArray[1])) == 
				(sidesArray[2]*sidesArray[2]) ) {
			return true;
		}
		else {
			return false;
		}
	}

}
