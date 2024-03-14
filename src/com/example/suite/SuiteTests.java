package com.example.suite;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages({ "com.example" })
public class SuiteTests {
	static {
		ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
		System.out.println(">>>> Class Loader is a" + contextClassLoader.getClass().toString());
	}
}
