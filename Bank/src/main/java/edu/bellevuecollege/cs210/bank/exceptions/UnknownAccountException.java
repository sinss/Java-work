package edu.bellevuecollege.cs210.bank.exceptions;

public class UnknownAccountException extends Exception
{
	public UnknownAccountException(String reason) {
		super(reason);
	}
}
