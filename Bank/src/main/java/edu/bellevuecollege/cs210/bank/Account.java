package edu.bellevuecollege.cs210.bank;

import edu.bellevuecollege.cs210.bank.exceptions.NonSufficientFundsException;

import java.math.BigDecimal;

public class Account {

	String firstName;
	String lastName;
	String acctNo;
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
    	
    	System.out.println("accountNo : " + acctNo);
    }

    /**
     * Deposit the amount passed into the function, the balance should reflect this deposit.
     * @param depositAmount Amount to deposit into the account.
     * @return The balance after the deposit.
     */
    public BigDecimal deposit(BigDecimal depositAmount)
    {
        return new BigDecimal(0);
    }

    /**
     * Withdraws the amount passed in from the bank account, the balance should reflect this withdrawal.
     * @param withdrawalAmount Amount to withdraw from the account.
     * @return The balance after the withdrawal.
     * @throws NonSufficientFundsException Thrown if there are insufficient funds in the account.
     */
    public BigDecimal withdraw(BigDecimal withdrawalAmount) throws NonSufficientFundsException
    {
        return new BigDecimal(0);
    }

    /**
     * Returns the balance of the account.
     * @return The balance of the account.
     */
    public BigDecimal getBalance()
    {
        return new BigDecimal(0);
    }

    public String getFirstName()
    {
        return null;
    }

    public String getLastName()
    {
       return null;
    }

    public String getAccountNumber()
    {
        return null;
    }
}
