package bigdecimal;

import java.math.BigDecimal;

public class TesteBigDecimal {

	public static void main(String[] args) {
		BigDecimal a = new BigDecimal(50);
		BigDecimal b = new BigDecimal(70);
		
		if (a.compareTo(b) >= 0) {
			System.out.println("a é maior ou igual a b");
		} else {
			System.out.println("b é maior que a ");
		}

		// Teste git
		
	}

}
