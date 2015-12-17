package org.mattpayne.advent;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class Day2 {

	// http://adventofcode.com/day/2
	public static int squareFeet(String dimensionStr) {
		String[] lwh = StringUtils.split(dimensionStr, 'x');
		int l = atoi(lwh[0]);
		int w = atoi(lwh[1]);
		int h = atoi(lwh[2]);
		int sideA = 2*l*w;
		int sideB = 2*w*h;
		int sideC = 2*h*l;
		int smallSide = NumberUtils.min(sideA,sideB,sideC);
		return sideA+sideB+sideC+smallSide/2;
	}

	private static int atoi(String string) {
		return Integer.parseInt(string);
	}

}
