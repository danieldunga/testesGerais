package strings;

public class Mascaramento {

	public static void main(String[] args) {
		
		Mascaramento m = new Mascaramento();
		
		String cartao = "6060710095267017";
		
		
		System.out.println(m.masking(cartao));
				  

	}

	/**
	 * Exemplo = 600818******9015
	 * 
	 * @param value String
	 * @return valor mascarado
	 */
	public String masking(String value) {
		String masked = "";
		
		if (value != null && value.length() >= 10) {
			StringBuffer temp = new StringBuffer(value);
			int idx = value.length() - 4;
			for (int i = 1; i <= 6; i++) {
				temp.replace(idx -1 , idx, "*");
				idx--;
			}
			masked = temp.toString();
		} else {
			// TODO - LOG - Não foi possivel fazer o mascaramento
		}
		
		
		return masked;
	}
}
