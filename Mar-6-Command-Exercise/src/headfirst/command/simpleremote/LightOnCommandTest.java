package headfirst.command.simpleremote;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
	void testExecute() {
		System.setOut(ps);
		assertTrue("")
	}

}
