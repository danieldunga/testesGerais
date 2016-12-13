package testeEnum;

public enum BUS {
	
	BUS_09(1), BUS_10(2);
	
	private final int valor;
	
	BUS(int valorOpcao){
		valor = valorOpcao;
	}
	public int getValor(){
		return valor;
	}
}
