package edu.bellevuecollege.cs210.bank.exceptions;

public class NonSufficientFundsException extends Exception
{
	public NonSufficientFundsException(String reason) {
		super(reason);
	}
}
