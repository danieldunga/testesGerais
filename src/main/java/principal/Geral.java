package principal;

public class Geral {

	private static Geral geral;
	
	private Geral() {
	}
	
	public String str;
	
	public static Geral getSingleInstance() {
		if (geral == null) {
			geral = new Geral();
		}
		return geral;
	}
	
	public static void main(String[] args) {
		
	}
}
