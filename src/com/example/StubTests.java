package com.example;

import org.junit.jupiter.api.Test;

public class StubTests {
	static {
		ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
		System.out.println(">>>> Class loader is a " + contextClassLoader.getClass().toString());
	}

	@Test
	public void testStub() {
		// Nothing to do
	}
}
