package com.Learning.practiceJava;

import java.util.Arrays;

import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

enum Season {
	Summer(5), Winter(6), Spring(7), Fall(8);

	private int id;

	Season(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
}

public class EnumTest extends TestCase {

	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public EnumTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(EnumTest.class);
	}

	public void test() {
		System.out.println(Season.valueOf("Summer"));

		List<Season> seasons = Arrays.asList(Season.values());
		System.out.println(seasons);

		System.out.println(Season.valueOf("Summer").getId());

		assertEquals(0, 0);

	}

}
