package edu.bellevuecollege.cs210.bank;

import edu.bellevuecollege.cs210.bank.exceptions.NonSufficientFundsException;

import java.math.BigDecimal;

public class Account {

	String firstName;
	String lastName;
	String acctNo;
	Double balance = 0.0;
	boolean open = false;
    /**
     * Create a new account with the information passed in.
     * @param firstName First name of the account holder.
     * @param lastName Last name of the account holder.
     * @param acctNo Account number to create the account with.
     */
    public Account(String firstName, String lastName, String acctNo)
    {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.acctNo = acctNo;
    	this.open = true;
    	System.out.println("accountNo : " + acctNo + " has being create");
    }

    /**
     * Deposit the amount passed into the function, the balance should reflect this deposit.
     * @param depositAmount Amount to deposit into the account.
     * @return The balance after the deposit.
     */
    public BigDecimal deposit(BigDecimal depositAmount)
    {
    	balance += depositAmount.doubleValue();
        return new BigDecimal(balance);
    }

    /**
     * Withdraws the amount passed in from the bank account, the balance should reflect this withdrawal.
     * @param withdrawalAmount Amount to withdraw from the account.
     * @return The balance after the withdrawal.
     * @throws NonSufficientFundsException Thrown if there are insufficient funds in the account.
     */
    public BigDecimal withdraw(BigDecimal withdrawalAmount) throws NonSufficientFundsException
    {
    	/* the balance doesn't enough to withdraw */
    	if (balance - withdrawalAmount.doubleValue() < 0) {
    		throw new NonSufficientFundsException("there isn't enough balance of this account, please check again");
    	}
    	/* the balance can withdraw */
    	balance += withdrawalAmount.doubleValue();
        return new BigDecimal(0);
    }
    
    public void close() {
    	open = false;
    }

    /**
     * Returns the balance of the account.
     * @return The balance of the account.
     */
    public BigDecimal getBalance()
    {
        return new BigDecimal(balance);
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
       return lastName;
    }

    public String getAccountNumber()
    {
        return acctNo;
    }
    
    public boolean isOpen() {
    	return open;
    }
    
    /**
     * @return customize the display string
     * */
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	sb.append(getAccountNumber() + "\n");
    	sb.append(getFirstName() + " " + getLastName() + "\n");
    	sb.append("Balance : "+ getBalance() + "\n");
    	sb.append("status: " + (isOpen()?"active" : "closed") + "\n");
    	sb.append("\n");
    	sb.append("------------------------------\n");
        return sb.toString();
    }
}
