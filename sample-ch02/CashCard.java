
/**
 * Write a description of class CashCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashCard
{
    // instance variables - replace the example below with your own
    private String cardNumber;
    private double cardBalance;

    /**
     * Constructor for objects of class CashCard
     */
    public CashCard()
    {
        // initialise instance variables
        cardNumber = "";
        cardBalance = 0.0;
    }

    /**
     * Set method
     */
    public void setCardNumber(String cardNum)
    {
        cardNumber = cardNum;
    }

    /**
     * Get methods
     */
    public String getCardNumber()
    {
        return cardNumber;
    }
    
        public double getCardBalance()
    {
        return cardBalance;
    }


    /**
     * Other methods
     */
    public void refill(double amount)
    {
        cardBalance += amount;
    }

    public void deduct(double amount)
    {
        cardBalance -= amount;
    }
} // End class
