package de.uniko.mcws.mvn;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ResponseStringTest {

	protected static final long VALID_ID = 123;
	protected static final long INVALID_ID = 0;

	private ResponseString value;

	@Test
	public void testValidId() {
		this.value = new ResponseString(VALID_ID);
		assertEquals(this.value.toString(), "Hello World!");
	}

	@Test
	public void testInvalidId() {
		this.value = new ResponseString(INVALID_ID);
		assertEquals(this.value.toString(), "nope.");
	}

}