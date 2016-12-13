package testeFinally;

public class Finalizacao {

	public static void main(String[] args) {

		System.out.println(new Finalizacao().teste());
		
	}

	public boolean teste() {
		boolean retorno = false;
		try {
			if (false) {
				return true;
			}
		} finally {
			System.out.println("Passou no finally");
		}
		return retorno;
	}
}
