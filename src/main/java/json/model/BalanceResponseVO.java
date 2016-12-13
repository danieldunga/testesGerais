package json.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;

public class BalanceResponseVO implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 5073270660050518990L;

	private int returnCode;
	private String returnMessage;
	private String cardNumber;
    private long balance;
    private String indicatorBalance;
    private int cardStatus;
    private int reasonBlock;
    private String indicatorUnblock;
    private Date dateBlock;
    private List<TransactionDataVO> transactions;
    
    
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getIndicatorBalance() {
		return indicatorBalance;
	}
	public void setIndicatorBalance(String indicatorBalance) {
		this.indicatorBalance = indicatorBalance;
	}
	public int getCardStatus() {
		return cardStatus;
	}
	public void setCardStatus(int cardStatus) {
		this.cardStatus = cardStatus;
	}
	public int getReasonBlock() {
		return reasonBlock;
	}
	public void setReasonBlock(int reasonBlock) {
		this.reasonBlock = reasonBlock;
	}
	public String getIndicatorUnblock() {
		return indicatorUnblock;
	}
	public void setIndicatorUnblock(String indicatorUnblock) {
		this.indicatorUnblock = indicatorUnblock;
	}
	public Date getDateBlock() {
		return dateBlock;
	}
	public void setDateBlock(Date dateBlock) {
		this.dateBlock = dateBlock;
	}
	public List<TransactionDataVO> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<TransactionDataVO> transactions) {
		this.transactions = transactions;
	}
	public int getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(int returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnMessage() {
		return returnMessage;
	}
	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
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
