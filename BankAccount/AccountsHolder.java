package BankAccount;

public class AccountsHolder {
	String AccountName;
	String AccountID;
	int balance;
	int prevBalance;
	
	public AccountsHolder() {
		this.AccountID = AccountID;
		this.AccountName= AccountName;
		this.balance = balance;
		this.prevBalance = prevBalance;
	}
	void AccountHolder() {
		System.out.println("Account Name: "+ AccountName + "\n Account ID: "+ AccountID);
	 }
	void withDrawMoney(int amount) {
		if(amount !=0) {
			balance-= amount;
			prevBalance -=amount;
		}
	}

	void depositMoney(int amount) {
		if(amount!=0) {
			balance+=amount;
			prevBalance+=amount;
		}
	}
	public String getAccountName() {
		return AccountName;
	}

	public void setAccountName(String accountName) {
		AccountName = accountName;
	}

	public String getAccountID() {
		return AccountID;
	}

	public void setAccountID(String accountID) {
		AccountID = accountID;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getPrevBalance() {
		return prevBalance;
	}

	public void setPrevBalance(int prevBalance) {
		this.prevBalance = prevBalance;
	}

	

}
