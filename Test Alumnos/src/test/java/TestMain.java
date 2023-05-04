import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class TestMain {

	@Test
	public void testMain2() {
		String[] args = {"2", "4"};
		assertThrows(IndexOutOfBoundsException.class, () -> {
			Main.main(args);
		});

	}

	@Test
	public void testMain1() {
		String[] args = {"2", "4", "+"};
		try {
			Main.main(args);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}


	@Test
	public void testSuma1() {
		int resultadoReal = Main.suma(54,-21);
		int resultadoEsperado = 33;
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	public void testResta1() {
		int resultadoReal = Main.resta(-4, 0);
		int resultadoEsperado = -4;
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	public void testMultiplica() {
		int resultadoReal = Main.multiplica(0, 2);
		int resultadoEsperado = 0;
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	public void testDivideConCero() {
		int a = 16;
		int b = 0;
		int division;
		try {
			division = Main.divide(a, b);
			fail("Debería haber entrado al catch");
		} catch (Exception e) {
			assertTrue(true);
		}
	}
	@Test
	public void testDivide2() {
		int a = 1;
		int b = 0;
		int division;
		try {
			division = Main.divide(a, b);
			fail("Debería haber entrado al catch");
		} catch (Exception e) {
			assertTrue(true);
		}
	}

	@Test
	public void testResta2() {
		int resultadoReal = Main.resta(2, 2);
		int resultadoEsperado = 0;
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	public void testMultiplica2() {
		int resultadoReal = Main.multiplica(0, 1520);
		int resultadoEsperado = 0;
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	public void testSuma2() {
		int resultadoReal = Main.suma(2, 666);
		int resultadoEsperado = 668;
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	public void testDivide3() {
		int resultadoReal = Main.divide(7, 2);
		int resultadoEsperado = 4;
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	public void testMultiplica3() {
		int resultadoReal = Main.multiplica(55445, 1000);
		int resultadoEsperado = 55445000;
		assertEquals(resultadoEsperado, resultadoReal);
	}

}

