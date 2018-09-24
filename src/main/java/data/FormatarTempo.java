package data;

public class FormatarTempo {

	public static void main(String[] args) {
		System.out.println(apresentacaoTempo(321321));

	}

	public static String apresentacaoTempo(long tempoEmMilisegundos) {
		long segundos = tempoEmMilisegundos / 1000;
		long minutos = segundos / 60;
		segundos = segundos % 60;
		long horas = minutos / 60;
		minutos = minutos % 60;
		return String.format ("%02d:%02d:%02d", horas, minutos, segundos); // Exemplo: "12:34:56"
	}
	
}
