package edu.bellevuecollege.cs210.bank;


import java.text.DecimalFormat;
import java.util.ArrayList;

import edu.bellevuecollege.cs210.bank.exceptions.UnknownAccountException;

public class Bank {

	ArrayList<Account> accountList = null;
	public Bank() {
		//create a new account list instance of the bank
		if (accountList == null) {
			accountList = new ArrayList<Account> ();			
		}
	}
    /**
     * Opens a new account based on the information passed in, adds it to the list of accounts.
     * @param firstName First name of account holder.
     * @param lastName Last name of account holder.
     */
    public void openAccount(String firstName, String lastName)
    {
    	int acctNo = accountList.size() + 1;
    	DecimalFormat numformat = new DecimalFormat("000");
    	Account acct = new Account(firstName, lastName, "999-" + numformat.format(acctNo));
    	
    	accountList.add(acct);
    }

    /**
     * Closes an account based on the account number, remove it from the list of accounts.
     * @param accountNumber
     */
    public void closeAccount(String accountNumber) throws UnknownAccountException
    {

    }

    /**
     * Returns the account based on the account number passed in.
     * @param accountNumber  The account number to look up and return the account.
     * @return
     */
    public Account getAccount(String accountNumber) throws UnknownAccountException
    {
        return null;
    }

    /**
     * Return all accounts currently in the bank.
     * @return A list of all accounts open in the bank.
     */
    public Account[] getAllAccounts()
    {
        return null;
    }
}
