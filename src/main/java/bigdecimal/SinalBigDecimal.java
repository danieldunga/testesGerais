package bigdecimal;

import java.math.BigDecimal;

public class SinalBigDecimal {

	public static void main(String[] args) {

		BigDecimal valor = new BigDecimal("-00000123.909");
		
		if (valor.doubleValue() > 0) {
			System.out.println("Positivo: " + valor);
		} else {
			System.out.println("Negativo: " + valor);
		}

	}

}
