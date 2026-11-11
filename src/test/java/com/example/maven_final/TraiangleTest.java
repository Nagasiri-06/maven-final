package com.example.maven_final;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TraiangleTest {
	  @Test
	    void testEquilateralTriangle() {

	        assertTrue(
	            Triangle.isEquilateral(5, 5, 5)
	        );
	    }

	    @Test
	    void testAnotherEquilateralTriangle() {

	        assertTrue(
	            Triangle.isEquilateral(7, 7, 7)
	        );
	    }

	    @Test
	    void testUnequalSides() {

	        assertFalse(
	            Triangle.isEquilateral(5, 5, 6)
	        );
	    }

	    @Test
	    void testDifferentSides() {

	        assertFalse(
	            Triangle.isEquilateral(3, 4, 5)
	        );
	    }

	    @Test
	    void testZeroSide() {

	        assertFalse(
	            Triangle.isEquilateral(0, 5, 5)
	        );
	    }

	    @Test
	    void testNegativeSide() {

	        assertFalse(
	            Triangle.isEquilateral(-5, 5, 5)
	        );
	    }

	    @Test
	    void testDecimalEqualSides() {

	        assertTrue(
	            Triangle.isEquilateral(5.5, 5.5, 5.5)
	        );
	    }

	    @Test
	    void testAlmostEqualSides() {

	        assertTrue(
	            Triangle.isEquilateral(
	                5.0, 5.0 + 1e-10, 5.0
	            )
	        );
	    }

	

}
