package com.fdmgroup.romanex;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RomanTest {
	
	private Roman roman;
	private String initialValue;
	private int returnValue;
	private static final int ERROR_MESSAGE = -1;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		roman = new Roman();
		initialValue = "";
		returnValue = 0;
	}

	@Test
	public void test_Return_1_Input_I() {
		// Arrange
		initialValue = "I";
		
		// Act
		returnValue = roman.convert(initialValue);
		// Assert
		
		assertTrue( returnValue == 1);
	}
//
	@Test
	public void test_Return_5_Input_V() {
		// Arrange
		initialValue = "V";
		
		// Act
		returnValue = roman.convert(initialValue);
		
		// Assert
		assertEquals(5, returnValue);
	}

	@Test
	public void test_Return_10_Input_X() {
		// Arrange
		initialValue = "X";
		
		// Act
		returnValue = roman.convert(initialValue);
		
		// Assert
		assertEquals(10, returnValue);
	}

	@Test
	public void test_Return_ERROR_MESSAGE_Input_Empty() {
		// Arrange
		initialValue = "";
		// Act
		returnValue = roman.convert(initialValue);
		
		// Assert
		assertEquals(ERROR_MESSAGE, returnValue);
	}
//
	@Test
	public void test_Return_ERROR_MESSAGE_Input_BlankSpaces() {
		// Arrange
		initialValue = "           ";
		
		// Act
		returnValue = roman.convert(initialValue);
		
		// Assert
		assertEquals(ERROR_MESSAGE, returnValue);
	}

	@Test
	public void test_Return_ERROR_MESSAGE_Input_TooLong() {
		// Arrange
		initialValue = "IIIIIIIIIII";
		
		// Act
		returnValue = roman.convert(initialValue);
		
		// Assert
		assertEquals(ERROR_MESSAGE, returnValue);
	}

}
