package strings;

public class StringFormat {

	public static void main(String[] args) {
		String cardNumber = "0123456789";
		Integer codigo = 7;
		
		System.out.println(cardNumber + codigo);
		
		System.out.println(String.format("%s-%s", cardNumber, codigo));

	}

}
