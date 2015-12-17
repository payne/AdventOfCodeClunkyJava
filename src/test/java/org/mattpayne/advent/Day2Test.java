package org.mattpayne.advent;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

import org.junit.Test;

public class Day2Test {

	@Test
	public void test() {
		assertEquals(58, Day2.squareFeet("2x3x4"));
	}
	
	@Test 
	public void addItUpTest() throws IOException {
		LineNumberReader in = new LineNumberReader(new FileReader("src/main/resources/day2_input.txt"));
		String dimensions=null;
		int total=0;
		while (null!=(dimensions=in.readLine())) {
			total += Day2.squareFeet(dimensions);
		}
		assertEquals(1586300, total);
		System.out.println("total="+total);
	}

}
