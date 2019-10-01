package triangle_sorter;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class TriangleTest {
	
	@Test
	public void testTriangleIsEquilateral() {
		Triangle underTest = new Triangle(4, 4, 4);
		boolean result = underTest.isAnEquilateralTriangle();
		assertThat(result, is(true));
	}
	
	@Test
	public void testTriangleIsNotEquilateral() {
		Triangle underTest = new Triangle(3, 4, 4);
		boolean result = underTest.isAnEquilateralTriangle();
		assertThat(result, is(false));
	}
	
	@Test
	public void testTriangleIsIsosceles() {
		Triangle underTest = new Triangle(3, 4, 4);
		boolean result = underTest.isAnIsoscelesTriangle();
		assertThat(result, is(true));
	}
	
	@Test
	public void testTriangleIsEquilateralNotIsosceles() {
		Triangle underTest = new Triangle(3, 3, 3);
		boolean result = underTest.isAnIsoscelesTriangle();
		assertThat(result, is(false));
	}
	
	@Test
	public void testTriangleIsNotIsosceles() {
		Triangle underTest = new Triangle(3, 2, 4);
		boolean result = underTest.isAnIsoscelesTriangle();
		assertThat(result, is(false));
	}
	
	@Test
	public void testTriangleIsRight1() {
		Triangle underTest = new Triangle(3, 4, 5);
		boolean result = underTest.isARightTriangle();
		assertThat(result, is(true));
	}

	@Test
	public void testTriangleIsRight2() {
		Triangle underTest = new Triangle(13, 5, 12);
		boolean result = underTest.isARightTriangle();
		assertThat(result, is(true));
	}	
	
	@Test
	public void testTriangleIsNotRight1() {
		Triangle underTest = new Triangle(3, 5, 5);
		boolean result = underTest.isARightTriangle();
		assertThat(result, is(false));
	}
	
	@Test
	public void testTriangleIsNotRight2() {
		Triangle underTest = new Triangle(3, 3, 3);
		boolean result = underTest.isARightTriangle();
		assertThat(result, is(false));
	}
	
	@Test
	public void testTriangleIsNotRight3() {
		Triangle underTest = new Triangle(2, 5, 4);
		boolean result = underTest.isARightTriangle();
		assertThat(result, is(false));
	}
	
	@Test
	public void testTriangleIsNotRight4() {
		Triangle underTest = new Triangle(1, 2, 5);
		boolean result = underTest.isARightTriangle();
		assertThat(result, is(false));
	}
	
}
