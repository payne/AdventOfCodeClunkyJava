package org.mattpayne.advent;

public class Day1 {

	public static int floor(String steps) {
		int floor = 0;
		for (Byte step : steps.getBytes()) {
			switch (step) {
			case '(':
				floor++;
				break;
			case ')':
				floor--;
				break;
			}
		}
		return floor;
	}

	public static int basementPosition(String steps) {
		int floor = 0, position = 1;
		for (Byte step : steps.getBytes()) {
			switch (step) {
			case '(':
				floor++;
				break;
			case ')':
				floor--;
				break;
			}
			if (floor == -1) {
				break;
			}
			position++;
		}
		return position;
	}

}
