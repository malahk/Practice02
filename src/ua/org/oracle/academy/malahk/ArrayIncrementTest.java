package ua.org.oracle.academy.malahk;

import java.util.Arrays;

import org.junit.*;

public class ArrayIncrementTest {

	@Test(expected = ArrayIncrementException.class)
	public void nullEntryTest() throws Exception {
		int[] testValue = null;
		ArrayIncrement.incrementArray(testValue);
	}

	@Test(expected = ArrayIncrementException.class)
	public void emptyArrayTest() throws Exception {
		int[] testValue = new int[0];
		ArrayIncrement.incrementArray(testValue);
	}

	@Test(expected = ArrayIncrementException.class)
	public void zeroTest() throws Exception {
		int[] testValue = new int[] { 0, 1, 2 };
		ArrayIncrement.incrementArray(testValue);
	}

	@Test
	public void singleZeroTest() throws Exception {
		int[] testValue = new int[] { 0 };
		ArrayIncrement.incrementArray(testValue);
	}

	@Test(expected = ArrayIncrementException.class)
	public void elementTest() throws Exception {
		int[] testValue = new int[] { 12, 2, 12 };
		ArrayIncrement.incrementArray(testValue);
	}

	@Test
	public void incrementArray() throws Exception {
		int[] expected = { 2, 5, 7 };
		int[] testValue = new int[] { 2, 5, 6 };
		Assert.assertEquals(Arrays.toString(expected), Arrays.toString(ArrayIncrement.incrementArray(testValue)));
	}
	@Test
	public void incrementArrayIncreaseLenth() throws Exception {
		int[] expected = { 1, 0, 0, 0 };
		int[] testValue = new int[] { 9, 9, 9 };
		Assert.assertEquals(Arrays.toString(expected), Arrays.toString(ArrayIncrement.incrementArray(testValue)));
	}


}
