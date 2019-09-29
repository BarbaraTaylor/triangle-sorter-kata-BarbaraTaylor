package triangle_sorter;

import java.util.Arrays;
import java.util.Scanner;


public class AppUserTriangleSorter {
	
	private static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the Triangle Sorter!");
		System.out.println("Please input three integer values, and this program "
				+ "will tell you if these three sides make a triangle or not.");
		System.out.println("If they represent a triangle, the program will tell you"
				+ " whether the triangle is Equilateral, Isosceles, Right, or "
				+ "none of the above.");
		
		System.out.println("Please input the first of three side-lengths:\n> ");
		int sideA = userInput.nextInt();
		userInput.nextLine();
		System.out.println("Please input the second of three side-lengths:\n> ");
		int sideB = userInput.nextInt();
		userInput.nextLine();
		System.out.println("Please input the third of three side-lengths:\n> ");
		int sideC = userInput.nextInt();
		userInput.nextLine();
		
		ShapeWithThreeLengths possTriangle = new ShapeWithThreeLengths(sideA, sideB, sideC);
		
		
		
		
		
		


		
	}

}
