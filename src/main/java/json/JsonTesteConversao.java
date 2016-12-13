package json;

import org.json.JSONObject;

public class JsonTesteConversao {

	public static void main(String[] args) {
		new JsonTesteConversao().Testar();

	}
	
	public void Testar() {
		JSONObject jsonObject = new JSONObject(getJson());
		
		System.out.println("Long:   " + jsonObject.getLong("balance"));
		System.out.println("Double: " + jsonObject.getDouble("balance"));
		
		
		
	}
	
	private String getJson() {
		StringBuffer sb = new StringBuffer();
		sb.append("{ "); 
		sb.append("   \"code\": 1, ");
		sb.append("   \"balance\": 1.2, ");
		sb.append("   \"message\": \"Consulta efetuada com sucesso\", "); 
		sb.append("   \"document\": \"23481509561\" "); 
		sb.append("} ");
		return sb.toString();
	}

}
