package com.fdmgroup.romanex;

public class Roman implements IRoman{
	private static final int ERROR_MESSAGE = -1;
	private static final int MAX_INPUT_SIZE = 10;

	public int convert(String input) {

		if (input == "I") {
			return 1;
		} else if (input == "V") {
			return 5;
		} else if (input == "X") {
			return 10;
		} else if (input.trim().isEmpty() || input.length() > MAX_INPUT_SIZE) {
			return ERROR_MESSAGE;
		}
		return 0;
	}

}