package com.saritas.comparator;

import com.saritas.ComparatorApp;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author msaritas
 *
 */
public class AppTest extends TestCase {

	public AppTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	public void testApp() {
		ComparatorApp app = new ComparatorApp();
		app.sortPerson();
	}

}
