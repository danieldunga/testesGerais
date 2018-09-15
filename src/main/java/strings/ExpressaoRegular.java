package strings;

public class ExpressaoRegular {

	public static void main(String[] args) {

		// aceita todos os números, letras e . _ e -
		String padrao = "[a-zA-Z0-9._-]+";
		
		String teste1 = "asdf";
		System.out.println(teste1 + ":" + teste1.matches(padrao));
		
		teste1 = "asdf123";
		System.out.println(teste1 + ":" + teste1.matches(padrao));
		
		teste1 = "54065";
		System.out.println(teste1 + ":" + teste1.matches(padrao));
		
		teste1 = "5406-5";
		System.out.println(teste1 + ":" + teste1.matches(padrao));
		
		teste1 = "54065$";
		System.out.println(teste1 + ":" + teste1.matches(padrao));
		
		teste1 = "54065_";
		System.out.println(teste1 + ":" + teste1.matches(padrao));
		
		teste1 = "5.4065";
		System.out.println(teste1 + ":" + teste1.matches(padrao));
		
		teste1 = "54065#";
		System.out.println(teste1 + ":" + teste1.matches(padrao));
		
		teste1 = "54065@";
		System.out.println(teste1 + ":" + teste1.matches(padrao));
	}

}
