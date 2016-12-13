package conversao;

public class StringParaLong {

	public static void main(String[] args) {
		String conta = "1";
		String digito = "01";
		
//		String resultado = conta + Long.parseLong(digito);
		String resultado = conta + digito;
		
		System.out.println(Long.parseLong(resultado));

	}

}
