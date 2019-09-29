package triangle_sorter;

import java.util.Arrays;
import java.util.Scanner;


public class AppUserTriangleSorter {
	
	private static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the Triangle Sorter!");
		System.out.println();
		System.out.println("Please input three integer values, and this program "
				+ "will tell you if these three sides \nmake a triangle or not.");
		System.out.println();
		System.out.println("If they represent a triangle, the program will tell you"
				+ " whether the triangle is \nEquilateral, Isosceles, Right, or "
				+ "none of the above.");
		System.out.println();
		
		boolean continueTestingForTriangles = true;
		
		while (continueTestingForTriangles) {
		
			System.out.println("Please input the first of three side-lengths:");
			int sideA = userInput.nextInt();
			userInput.nextLine();
			System.out.println("Please input the second of three side-lengths:");
			int sideB = userInput.nextInt();
			userInput.nextLine();
			System.out.println("Please input the third of three side-lengths:");
			int sideC = userInput.nextInt();
			userInput.nextLine();
		
			ShapeWithThreeLengths userInputShape = new ShapeWithThreeLengths(sideA,sideB,sideC);
		
			if (userInputShape.isAnActualTriangle()==false) {
				System.out.println("Sorry, the three lengths you typed in do NOT"
				 	+ " constitute an actual triangle!");
				System.out.println();
				System.out.println("Please (t)ry again or (q)uit.");
				String userSelection = userInput.nextLine();
				if (userSelection.equalsIgnoreCase("q")) {
					continueTestingForTriangles = false;
					System.out.println("Thank you. Have a great day.");
					//System.exit(0);
				}
			}
			else {
				Triangle userInputTriangle = new Triangle(sideA, sideB, sideC);
			
			}
		
		
		}
	}

}
