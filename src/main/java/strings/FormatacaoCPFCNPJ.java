package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatacaoCPFCNPJ {

	public static void main(String[] args) {
		System.out.println(formatCPF("28328445883"));
		System.out.println(formatCPF("8328445883"));
		System.out.println(formatCPF("5883"));
		
		System.out.println(formatarCPF("28328445883"));
		System.out.println(formatarCPF("8328445883"));
		System.out.println(formatarCPF("5883"));

		System.out.println(formatarCNPJ("05895042000151"));
		System.out.println(formatarCNPJ("5895042000151"));
		System.out.println(formatarCNPJ("0000000005895042000151"));
		
		System.out.println(formatarConta("28328445883"));
		System.out.println(formatarConta("8328445883"));
		System.out.println(formatarConta("5883"));
		
	}

	public static String formatCPF(String cpf) {
		Pattern pattern = Pattern.compile("(\\d{3})(\\d{3})(\\d{3})(\\d{2})");
		Matcher matcher = pattern.matcher(cpf);
		if (matcher.matches()) 
			cpf = matcher.replaceAll("$1.$2.$3-$4");
		return cpf;		
	}
	
	public static String formatarCPF(String cpf) {
		String cpfFormatado = "";
		if (cpf != null) {
			cpfFormatado = cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
		}
		return cpfFormatado;
	}
	
	public static String formatarCNPJ(String cnpj) {
		String cnpjFormatado = "";
		if (cnpj != null) {
			cnpj = strZeroEsquerda(cnpj, 14);
			cnpjFormatado = cnpj.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
		}
		return cnpjFormatado;
	}
	
	public static String strZeroEsquerda(String value, int n) {
		String s = value.trim();
		StringBuffer resp = new StringBuffer();
		int fim = n - s.length();
		for (int x = 0; x < fim; x++)
			resp.append('0');
		return resp + s;
	}
	
	public static String formatarConta(String conta) {
		String resultado = "";
		if (conta != null) {
			resultado = conta.replaceAll("(\\d{" + (conta.length() -1) + "})(\\d{1})", "$1-$2");
		}
		return resultado;
	}
}
