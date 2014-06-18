package edu.bellevuecollege.cs210.bank;

import edu.bellevuecollege.cs210.bank.exceptions.NonSufficientFundsException;
import edu.bellevuecollege.cs210.bank.exceptions.UnknownAccountException;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main
{
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args)
    {
        Bank bank = new Bank();
        boolean done = false;

        while (!done)
        {
            System.out.println("1. Open Account");
            System.out.println("2. Close Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Show Balance");
            System.out.println("6. List All Accounts");
            System.out.println("7. Quit");

            if(!SCANNER.hasNextInt())
            {
                continue;
            }

            int choice = SCANNER.nextInt();
            SCANNER.nextLine();
            switch (choice)
            {
                case 1:
                {
                    openAccount(bank);
                    break;
                }
                case 2:
                {
                    try
                    {
                        closeAccount(bank);
                    }
                    catch (UnknownAccountException e)
                    {
                        System.out.println("Invalid account number");
                    }
                    break;
                }
                case 3:
                {
                    try
                    {
                        Account acct = getAccount(bank);
                        BigDecimal amount = getAmount(bank);
                        bank.getAccount(acct.getAccountNumber()).deposit(amount);
                    }
                    catch(UnknownAccountException e)
                    {
                        System.out.println("Invalid account number");
                    }
                    break;
                }
                case 4:
                {
                    try
                    {
                        Account acct = getAccount(bank);
                        BigDecimal amount = getAmount(bank);
                        bank.getAccount(acct.getAccountNumber()).withdraw(amount);
                    }
                    catch(UnknownAccountException e)
                    {
                        System.out.println("Invalid account number");
                    }
                    catch (NonSufficientFundsException ex)
                    {
                        System.out.println("Insufficient Funds");
                    }
                    break;
                }
                case 5:
                {
                    try
                    {
                        Account acct = getAccount(bank);
                        System.out.println("Balance for account " + acct.getAccountNumber() + " is " + acct.getBalance());
                    }
                    catch (UnknownAccountException e)
                    {
                        System.out.println("Invalid account number");
                    }
                    break;
                }
                case 6:
                {
                    Account[] accounts = bank.getAllAccounts();
                    for (Account acct: accounts)
                    {
                    	System.out.println(acct.toString());
                    }
                    break;
                }
                case 7:
                {
                    done = true;
                    System.out.println("System exit");
                    break;
                }

            }
        }
    }

    private static void openAccount(Bank bank)
    {
        System.out.println("First Name?");
        String fName = SCANNER.nextLine();
        System.out.println("Last Name?");
        String lName = SCANNER.nextLine();

        bank.openAccount(fName, lName);
    }

    private static void closeAccount(Bank bank) throws UnknownAccountException
    {
        System.out.println("Bank account number?");
        bank.closeAccount(SCANNER.nextLine());
    }

    private static Account getAccount(Bank bank) throws UnknownAccountException
    {
        System.out.println("Bank account number?");
        return bank.getAccount(SCANNER.nextLine());
    }

    private static BigDecimal getAmount(Bank bank) throws UnknownAccountException
    {
        System.out.println("Amount?");
        return new BigDecimal(SCANNER.nextLine());
    }
}
