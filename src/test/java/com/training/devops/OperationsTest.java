package com.training.devops;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OperationsTest {
	protected int value1, value2;
	Operations operation = new Operations();

	@Before
	public void setUp() throws Exception {
		value1 = 16;
		value2 = 4;
	}

	@Test
	public void testAddition() {
		assertEquals(18, operation.addition(value2, value1), 0);
	}

}
