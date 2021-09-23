import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeBookTester {
	GradeBook g1;
	GradeBook g2;
	GradeBook g3;
	@Before
	public void setUp() {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		g3 = new GradeBook(5);
		
		g1.addScore(5);
		g2.addScore(10);
		g3.addScore(20);
		g1.addScore(30);
		g2.addScore(40);
		g3.addScore(50);
	}
	@After
	public void tearDown() {
		g1 = null;
		g2 = null;
		g3 = null;
	}
	public void addScoreTest() {
		assertTrue(g1.toString().equals("5.0 30.0 0.0 0.0 0.0"));
		assertTrue(g2.toString().equals("10.0 40.0 0.0 0.0 0.0"));
		assertTrue(g3.toString().equals("20.0 50.0 0.0 0.0 0.0"));
		
		assertEquals(2,g1.getScoreSize(),.001);
	    assertEquals(2,g2.getScoreSize(),.001);
	    assertEquals(2,g3.getScoreSize(),.001);
	}
	public void testSum() {
		assertEquals(35, g1.sum(), .0001);
		assertEquals(50, g2.sum(), .0001);
		assertEquals(60, g3.sum(), .0001);
	}
	public void testMinimum() {
		assertEquals(5, g1.minimum(), .001);
		assertEquals(10, g2.minimum(), .001);
		assertEquals(20, g3.minimum(), .001);
	}
	public void finalScore() {
		assertEquals(30, g1.finalScore(), .001);
		assertEquals(40, g1.finalScore(), .001);
		assertEquals(50, g1.finalScore(), .001);
	}
}
