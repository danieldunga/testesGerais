package json.model;

import java.lang.reflect.Field;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class SaldoExtrato {

	private int code;
	private String message;
	private String document;
	
	
	
	public int getCode() {
		return code;
	}



	public void setCode(int code) {
		this.code = code;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public String getDocument() {
		return document;
	}



	public void setDocument(String document) {
		this.document = document;
	}



	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
			try {
//				sb.append(getClass().getName());
//				sb.append(": ");
				for (Field f : getClass().getDeclaredFields()) {
					sb.append(f.getName());
					sb.append("=");
					sb.append(f.get(this));
					sb.append(", ");
				}
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		return sb.toString();
	}
}
