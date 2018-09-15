package json;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import json.model.BalanceResponseVO;
import json.model.SaldoExtrato;
import json.model.TransactionDataVO;

public class Teste {
	
	public static void main(String[] args) {
		Teste t = new Teste();
		
		String jsonInString = t.getJson();
		String smallJsonInString = t.getJsonPequeno();
		
		System.out.println("JsonJar = " + t.TestJsonJar(jsonInString) + "ms");
		System.out.println("Jackson = " + t.TestJackson(smallJsonInString) + "ms");
	}
	
	private long TestJackson(String jsonInString) {
		long inicio = System.currentTimeMillis();
		
		
		ObjectMapper mapper = new ObjectMapper();

		try {
	
			// Convert JSON string to Object
			SaldoExtrato saldoExtrato = mapper.readValue(jsonInString, SaldoExtrato.class);
			System.out.println(saldoExtrato);
				
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return System.currentTimeMillis() - inicio;
	}
	
	private long TestJsonJar(String jsonInString) { 
		long inicio = System.currentTimeMillis();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		BalanceResponseVO responseVO = new BalanceResponseVO();
		
		JSONObject jsonObject = new JSONObject(jsonInString);
		
		responseVO.setReturnCode(jsonObject.getInt("code"));
		responseVO.setReturnMessage(jsonObject.getString("message"));
		
		JSONArray accounts = jsonObject.getJSONArray("accountData");
		if (accounts.length() > 0) { // Possui conta
			JSONObject accountData = accounts.getJSONObject(0);
			responseVO.setBalance(accountData.getLong("balance"));
			responseVO.setCardNumber(accountData.getString("cardNumber"));
			responseVO.setCardStatus(accountData.getInt("cardStatus"));
			
			
			try {
				String strDateBlock = accountData.getString("dateBlock");
				if (strDateBlock != null && !"".equals(strDateBlock)) {
					
					responseVO.setDateBlock(dateFormat.parse(strDateBlock));
				}
			} catch (ParseException e) {
				System.out.println("Erro ao converter data: " + e.getMessage());
			}
			
			responseVO.setIndicatorBalance(accountData.getString("indicatorBalance"));
			responseVO.setIndicatorUnblock(accountData.getString("indicatorUnblock"));
			responseVO.setReasonBlock(accountData.getInt("reasonBlock"));
			
			// Obter as transacõeses
			ArrayList<TransactionDataVO> listTransactions = new ArrayList<TransactionDataVO>();
			JSONArray transactions = accountData.getJSONArray("transactionData");
			if (transactions != null) {
				for (int i = 0; i < transactions.length(); i++) {
					JSONObject transaction = transactions.getJSONObject(i);
					TransactionDataVO transactionDataVO = new TransactionDataVO();
					
					transactionDataVO.setBalance(transaction.getLong("balance"));
					
					
					String strCodAutorization = "";
					if (!transaction.isNull("codeAuthorization")) {
						strCodAutorization = transaction.getString("codeAuthorization");
					}
					transactionDataVO.setCodeAuthorization(strCodAutorization);
					
					try {
						String strDate = transaction.getString("date");
						if (strDate != null && !"".equals(strDate)) {
							transactionDataVO.setDate(dateFormat.parse(strDate));
						}
					} catch (ParseException e) {
						System.out.println("Erro ao converter data" + e.getMessage());
					}
					transactionDataVO.setDescription(transaction.getString("description"));
					transactionDataVO.setIndicatorTransaction(transaction.getString("indicatorTransaction"));
					transactionDataVO.setTypeAuthorization(transaction.getInt("typeAuthorization"));
					
					listTransactions.add(transactionDataVO);
					
				}
			}
			
			responseVO.setTransactions(listTransactions);
		} 
		
		System.out.println(responseVO.toString());
		
		return System.currentTimeMillis() - inicio;
	}
	
	private String getJson() {
		StringBuffer sb = new StringBuffer();
		sb.append("{ "); 
		sb.append("   \"code\": 1, "); 
		sb.append("   \"message\": \"Consulta efetuada com sucesso\", "); 
		sb.append("   \"document\": \"23481509561\", "); 
		sb.append("   \"initialDate\": \"2016-05-10\", "); 
		sb.append("   \"finalDate\": \"2016-08-01\", "); 
		sb.append("   \"accountData\": [   { "); 
		sb.append("      \"cardNumber\": \"603389******4181\", "); 
		sb.append("      \"balance\": 708, "); 
		sb.append("      \"indicatorBalance\": \"+\", "); 
		sb.append("      \"cardStatus\": 1, "); 
		sb.append("      \"reasonBlock\": 0, "); 
		sb.append("      \"indicatorUnblock\": \"S\", "); 
		sb.append("      \"dateBlock\": \"2016-07-13\", "); 
		sb.append("      \"transactionData\":       [ "); 
		sb.append("                  { "); 
		sb.append("            \"date\": \"2016-07-19\", "); 
		sb.append("            \"hour\": \"0::\", "); 
		sb.append("            \"codeAuthorization\": null, "); 
		sb.append("            \"typeAuthorization\": 20, "); 
		sb.append("            \"description\": \"DISPONIBILIZACAO DE VALOR\", "); 
		sb.append("            \"balance\": 128, "); 
		sb.append("            \"indicatorTransaction\": \"+\" "); 
		sb.append("         }, "); 
		sb.append("                  { "); 
		sb.append("            \"date\": \"2016-06-16\", "); 
		sb.append("            \"hour\": \"0::\", "); 
		sb.append("            \"codeAuthorization\": null, "); 
		sb.append("            \"typeAuthorization\": 20, "); 
		sb.append("            \"description\": \"DISPONIBILIZACAO DE VALOR\", "); 
		sb.append("            \"balance\": 290, "); 
		sb.append("            \"indicatorTransaction\": \"+\" "); 
		sb.append("         }, "); 
		sb.append("                  { "); 
		sb.append("            \"date\": \"2016-06-16\", "); 
		sb.append("            \"hour\": \"0::\", "); 
		sb.append("            \"codeAuthorization\": null, "); 
		sb.append("            \"typeAuthorization\": 20, "); 
		sb.append("            \"description\": \"DISPONIBILIZACAO DE VALOR\", "); 
		sb.append("            \"balance\": 290, "); 
		sb.append("            \"indicatorTransaction\": \"+\" "); 
		sb.append("         } "); 
		sb.append("      ] "); 
		sb.append("   }] "); 
		sb.append("} ");
		return sb.toString();
	}
	
	private String getJsonPequeno() {
		StringBuffer sb = new StringBuffer();
		sb.append("{ "); 
		sb.append("   \"code\": 1, "); 
		sb.append("   \"message\": \"Consulta efetuada com sucesso\", "); 
		sb.append("   \"document\": \"23481509561\" "); 
		sb.append("} ");
		return sb.toString();
	}
	
}
