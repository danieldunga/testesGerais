package json.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

public class TransactionDataVO implements Serializable {
 
	/** serialVersionUID */
	private static final long serialVersionUID = -1458759680554965939L;

	private Date date;
	private String codeAuthorization;
	private int typeAuthorization;
	private String description;
	private long balance;
	private String indicatorTransaction;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCodeAuthorization() {
		return codeAuthorization;
	}
	public void setCodeAuthorization(String codeAuthorization) {
		this.codeAuthorization = codeAuthorization;
	}
	public int getTypeAuthorization() {
		return typeAuthorization;
	}
	public void setTypeAuthorization(int typeAuthorization) {
		this.typeAuthorization = typeAuthorization;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getIndicatorTransaction() {
		return indicatorTransaction;
	}
	public void setIndicatorTransaction(String indicatorTransaction) {
		this.indicatorTransaction = indicatorTransaction;
	}
	
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
