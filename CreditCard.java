
/**
 * Write a description of class CreditCard here.
 *
 * @author (22067854 Roman Dangol)
 * @version (1.0.0)
 */
public class CreditCard extends BankCard
{
    //attribute
    private int cvcNumber; 
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    
    
    //Constructor method
    public CreditCard(int cardId, String clientName, String issuerBank, String bankAccount, double balanceAmount, int cvcNumber, double interestRate, String expirationDate)
    {
        super(cardId, issuerBank, bankAccount, balanceAmount);
        super.setClientName(clientName);
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }
    
       
    //getter method
    public int getCvcNumber()
    {
        return this.cvcNumber;
    }
    
    public double getCreditLimit()
    {
        return this.creditLimit;
    }
    
    public double getInterestRate()
    {
        return this.interestRate;
    }
    
    public String getExpirationDate()
    {
        return this.expirationDate;
    }
    
    public int getGracePeriod()
    {
        return this.gracePeriod;
    }
    
    public boolean getIsGranted()
    {
        return this.isGranted;
    }
    
    
    
    //method to set the credit limit
    public void setCreditLimit(double newCreditLimit, int newGracePeriod) 
    {
        if (newCreditLimit <= 2.5 * super.getBalanceAmount()) {
            this.creditLimit = newCreditLimit;
            this.gracePeriod = newGracePeriod;
            this.gracePeriod = newGracePeriod;
            this.isGranted = true;
        }
        else {
            System.out.println("Credit cannot be issued. The credit limit should be less than or equal to 2.5 times the balance amount.");
        }
    }
    
    //method to cancel the credit card
    public void cancelCreditCard()
    {
        this.cvcNumber = 0; 
        this.creditLimit = 0; 
        this.interestRate = 0; 
        this.expirationDate = ""; 
        this.gracePeriod = 0; 
        this.isGranted = false; 
        System.out.println("Credit card has been cancelled.");
    }
    
    //display method to display the details of Credit Card
    public void display()
    {
        super.display();
        if(isGranted){ 
            System.out.println("CVC number: " + cvcNumber);
            System.out.println("Credit Limit: " + creditLimit);
            System.out.println("Interest rate: " + interestRate);
            System.out.println("Expiration date: " + expirationDate);
            System.out.println("Grace period: " + gracePeriod); 
        } 
        else{ 
            System.out.println("Credit card has not been granted yet."); 
        } 
    } 
}
    
 


