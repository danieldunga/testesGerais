package testeEnum;

public enum Menu {
	
	SALVAR(1), IMPRMIR(2), ABRIR(3), VISUALIZAR(4), FECHAR(5);
	
	private final int valor;
	
	Menu(int valorOpcao){
		valor = valorOpcao;
	}
	public int getValor(){
		return valor;
	}
}
