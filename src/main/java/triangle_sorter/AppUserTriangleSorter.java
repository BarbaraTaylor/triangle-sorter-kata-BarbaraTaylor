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
					System.out.println("Thank you for using the Triangle Sorter"
							+ " today!\nGoodbye.");
				}
			}
			else {
			
				Triangle userInputTriangle = new Triangle(sideA, sideB, sideC);
				
				if (userInputTriangle.isAnEquilateralTriangle()) {
					System.out.println("Your three sides make an equilateral triangle!");
					System.out.println();
					System.out.println("Please choose to (p)lay again or (q)uit.");
					String userSelection2 = userInput.nextLine();
					if (userSelection2.equalsIgnoreCase("q")) {
						continueTestingForTriangles = false;
						System.out.println("Thank you for using the Triangle Sorter"
								+ " today!\nGoodbye.");
					}
				}
				else if (userInputTriangle.isAnIsoscelesTriangle()) {
				System.out.println("Your three sides make an isosceles triangle!");
				System.out.println();
				System.out.println("Please choose to (p)lay again or (q)uit.");
				String userSelection3 = userInput.nextLine();
				if (userSelection3.equalsIgnoreCase("q")) {
					continueTestingForTriangles = false;
					System.out.println("Thank you for using the Triangle Sorter"
							+ " today!\nGoodbye.");
					}
				)
				else if (userInputTriangle.isARightTriangle()) {
				System.out.println("Your three sides make a right triangle!");
				System.out.println();
				System.out.println("Please choose to (p)lay again or (q)uit.");
				String userSelection4 = userInput.nextLine();
				if (userSelection4.equalsIgnoreCase("q")) {
					continueTestingForTriangles = false;
					System.out.println("Thank you for using the Triangle Sorter"
							+ " today!\nGoodbye.");
					}
				}
				else {
				System.out.println("Your three sides make a triangle"
						+ " of no particular type!");
				System.out.println();
				System.out.println("Please choose to (p)lay again or (q)uit.");
					String userSelection4 = userInput.nextLine();
					if (userSelection4.equalsIgnoreCase("q")) {
						continueTestingForTriangles = false;
						System.out.println("Thank you for using the Triangle Sorter"
								+ " today!\nGoodbye.");	
					}		
				}
				}
			}
}
