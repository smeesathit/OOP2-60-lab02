/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    // instance variables - replace the example below with your own
    private String accountNumber;
    private String ownerName;
    private double accountBalance;

    /**
     * Constructor for objects of class BankAccount
     */
    public BankAccount()
    {
        // initialise instance variables
        accountNumber = "";
        ownerName = "";
    }

    /**
     * Set methods
     */
    public void setAccountNumber(String accNumber)
    {
        accountNumber = accNumber;
    }
    
    public void setOwnerName(String name)
    {
        ownerName = name;
    }
    
    /**
     * Get methods
     */
    public String getAccountNumber()
    {
        return accountNumber;
    }
    
    public String getOwnerName()
    {
        return ownerName;
    }
    
    public double getBalance()
    {
        return accountBalance;
    }

    /**
     * Other methods
     */
    public void deposit(double amount)
    {
        accountBalance += amount;
    }
    
    public void withdraw(double amount)
    {
        accountBalance -= amount;
    }
}
