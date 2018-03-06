package headfirst.command.simpleremote;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LightOnCommandTest {
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
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testExecute() throws UnsupportedEncodingException {
		String expected = "Light is on\n";
		System.setOut(ps);
		Light light = new Light();
		LightOnCommand loc = new LightOnCommand(light);
		loc.execute();
		//String actual = new String(os.toByteArray(),"UTF_8"); //use os because it has the changes of ps
		String actual = os.toString();
		assertTrue(expected.equals(actual)); //os because its tostring is defined to return the string output
	}

}
