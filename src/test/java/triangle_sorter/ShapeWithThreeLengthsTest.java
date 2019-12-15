package triangle_sorter;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class ShapeWithThreeLengthsTest {
	
	@Test
	public void shapeWithThreeLengthsIsNotATriangle() throws Exception {
		ShapeWithThreeLengths underTest = new ShapeWithThreeLengths(4, 2, 1);
		boolean result = underTest.isAnActualTriangle();
		assertThat(result, is(false));
	}

	@Test
	public void shapeWithThreeLengthsIsATriangle() throws Exception {
		ShapeWithThreeLengths underTest = new ShapeWithThreeLengths(4, 5, 7);
		boolean result = underTest.isAnActualTriangle();
		assertThat(result, is(true));
	}
	
	
}
