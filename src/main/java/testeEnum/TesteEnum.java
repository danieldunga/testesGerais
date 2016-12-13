package testeEnum;

public class TesteEnum {

	public static void main(String[] args) {
//		if ("SALVAR".equals(Menu.SALVAR.name())) {
//			System.out.println("Sim quando comparado por string");
//		} else {
//			System.out.println("NAO quando comparado por string");
//		}
//		
//		String xpto = String.valueOf(Menu.FECHAR); 
//		System.out.println(xpto);
//		if (xpto.equals(Menu.FECHAR)) {
//			System.out.println("Sim quando xpto");
//		} else {
//			System.out.println("NAO quando xpto");
//		}
		
		if (new TesteEnum().verificarBUS_09(BUS.BUS_09)) {
			System.out.println("é BUS 09");
		} else { 
			System.out.println("é BUS 10");
		}
		
	}

	
	
	public boolean verificarBUS_09 (BUS bus) {
		return BUS.BUS_09 == bus;
	}
}
