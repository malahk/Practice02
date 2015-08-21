package ua.org.oracle.academy.malahk;
//В целом код понравился
public class ArrayIncrement {

	public static int[] incrementArray(int[] input) throws Exception {

		validator(input);
		String tempString = "";
		for (int i = 0; i < input.length; ++i) {
			tempString += input[i];
		}
		int tempInt = Integer.parseInt(tempString) + 1;
		tempString = "";
		tempString += tempInt;
		String[] tempStringArr = tempString.split("");
		int[] tempIntArr = new int[tempStringArr.length];
		for (int i = 0; i < tempStringArr.length; ++i) {
			tempIntArr[i] = Integer.parseInt(tempStringArr[i]);
		}

		return tempIntArr;
	}

	public static boolean validator(int[] input) throws ArrayIncrementException {
		boolean result = true;
		if (validateNull(input) == false) {
			throw new ArrayIncrementException("Null incoming");
		}
		if (validateEmptyArray(input) == false) {
			throw new ArrayIncrementException("Array is empty");
		}
		if (validateEachElement(input) == false) {
			throw new ArrayIncrementException("Some element is not valid");
		}
		if (validateArraySingleNumber(input) == false) {
			throw new ArrayIncrementException(
					"With Zero at index '0' but not single number");
		}

		return result;

	}

	public static boolean validateNull(int[] input)
			throws ArrayIncrementException {
		boolean result;
		if (input == null) {
			result = false;
		} else {
			result = true;
		}
		return result;
	}

	public static boolean validateArraySingleNumber(int[] input) {
		boolean result;
		if ((input.length == 1) & ((input[0] >= 9) || (input[0] <= 0))) {
			result = true;
		} else if (input[0] == 0) {
			result = false;
		} else {
			result = true;
		}
		return result;
	}

	public static boolean validateEachElement(int[] input) {

		boolean result = true;
		for (int i = 0; i < input.length; ++i) {
			if ((input[i] > 9) || (input[i] < 0)) {
				result = false;
			}
		}
		return result;

	}

	public static boolean validateEmptyArray(int[] input) {
		boolean result;
		if (input.length == 0) {
			result = false;
		} else {
			result = true;
		}
		return result;
	}
}

