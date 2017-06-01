package conversao;

public class TodaStringENumeroZero {

	public static void main(String[] args) {
		String texto = "321asdf";
		
		// Separa caracter de número
		for (char letra : texto.toCharArray()) {
			if(Character.isDigit(letra)) {
				System.out.println("Número = " + letra);
			} else if (Character.isLetter(letra)) {
				System.out.println("Letra = " + letra);
			}
		}
		
		System.out.println("");
		
		// Verifica se possui apenas Zeros 
		texto = "0000m0";
		boolean apenasZeros = true;
		for (char letra : texto.toCharArray()) {
			if(letra != '0') {
				apenasZeros = false;
				break;
			}
		}
		if (apenasZeros) {
			System.out.println("String '" + texto + "' apenas com zeros");
		} else {
			System.out.println("String '" + texto + "' com caracteres diferentes de zeros");
		}

	}

}
