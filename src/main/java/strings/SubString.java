package strings;

public class SubString {

	public static void main(String[] args) {
		
		final int TAMANHO_CONTA = 4;
		
		String conta1 = "430001239";
		String conta2 = "39";
		
		
		if (conta1.equals(conta2)) {
			System.out.println("comparação normal OK");
		}

		String subConta1 = "";
		if (conta1.length() >= TAMANHO_CONTA) {			
			subConta1 = conta1.substring(conta1.length() - TAMANHO_CONTA);
		} else {
			subConta1 = conta1;
		}
		System.out.println("sub1:" + subConta1);

		String subConta2 = "";
		if (conta2.length() >= TAMANHO_CONTA) {			
			subConta2 = conta2.substring(conta2.length() - TAMANHO_CONTA);
		} else {
			subConta2 = conta2;
		}
		System.out.println("sub2:" + subConta2);
		
		if (subConta1.equals(subConta2)) {
			System.out.println("sub OK");
		}
	}

}
