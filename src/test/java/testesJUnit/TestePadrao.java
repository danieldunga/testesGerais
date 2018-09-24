package testesJUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Teste JUnit Padrão")
public class TestePadrao {

	//@Test
	void teste() {
		Assertions.fail("vai se fudê!");
	}
	
	@Test
	void teste2() {
		Assertions.assertTrue(true);
	}
	
	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",
			"1,    2,   3",
			"49,  51, 100",
			"1,  100, 101"
	})
	void somar(int num1, int num2, int resultadoEsperado) {
		Assertions.assertEquals(resultadoEsperado, num1 + num2);
	}
}
