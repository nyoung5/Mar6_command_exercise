package headfirst.command.simpleremote;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class LightTest {
	private PrintStream ps;
	private ByteArrayOutputStream os;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		os = new ByteArrayOutputStream();
		ps = new PrintStream(os);
		System.setOut(ps);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testOff() {
		String expected = "Light is off\n";
		Light light = new Light();
		light.off();
		String actual = os.toString();
		assertTrue(expected.equals(actual));
	}

	@Test
	void testOn() {
		String expected = "Light is on\n";
		Light light = new Light();
		light.on();
		String actual = os.toString();
		assertTrue(expected.equals(actual));
	}

}
