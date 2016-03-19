import static org.junit.Assert.*;

import org.junit.Test;


public class TriangleTest {
	private Triangle tri;

	@Test
	public void testjudge() {
		tri = new Triangle();
		assertEquals(1,Triangle.judge(2,3,7));
		assertEquals(2,Triangle.judge(3,3,3));
		assertEquals(3,Triangle.judge(3,3,5));
		assertEquals(4,Triangle.judge(3,4,5));
	}

}
