
/**
 * Write a description of class BankCard here.
 *
 * @author (22067854 Roman Dangol)
 * @version (1.0.0)
 */
public class BankCard
 {
    //attribute
     private int cardId;
     private String clientName;
     private String issuerBank;
     private String bankAccount;
     private double balanceAmount;
    
    //constructor method
     public BankCard(int cardId, String issuerBank, String bankAccount, double balanceAmount)
     { 
         this.cardId = cardId; 
         this.issuerBank = issuerBank; 
         this.bankAccount = bankAccount; 
         this.balanceAmount = balanceAmount;
         this.clientName = ""; 
     }
        
        
     //getter method
      public int getCardId() 
     {
         return this.cardId;
     }
     
     public String getClientName() 
     {
         return this.clientName;
     }
     
      public String getIssuerBank() 
     {
          return this.issuerBank;
     }
     
     public String getBankAccount()
     {
         return this.bankAccount;
     }
     
     public double getBalanceAmount()
     {
         return this.balanceAmount;
     }
     
     
     
     //setter method 
     public void setBalanceAmount(double balanceAmount)
     {
         this.balanceAmount = balanceAmount;
     }
     
     public void setClientName(String clientName)
     {
         this.clientName = clientName;
     }
        
        
        
        

     // method to display the details of BankCard
    public void display()
    { 
        System.out.println("Card ID: " + cardId);
        if (clientName.equals("")) { 
            System.out.println("Client name: not assigned"); 
        }
        else { 
        System.out.println("Client name: " + clientName);
        System.out.println("Issuer bank: " + issuerBank); 
        System.out.println("Bank account: " + bankAccount);
        System.out.println("Balance amount: " + balanceAmount); 
        }
    }
 }
