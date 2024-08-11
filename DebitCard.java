
/**
 * Write a description of class DebitCard here.
 *
 * @author (22067854 Roman Dangol)
 * @version (1.0.0)
 */
public class DebitCard extends BankCard
{
     //attributes
     private int pinNumber;
     private int withdrawalAmount;
     private String dateOfWithdrawal;
     private boolean hasWithdrawn;
    
    
    //constructor
     public DebitCard(double balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int pinNumber)
     {
        super(cardId, issuerBank, bankAccount, balanceAmount);
        super.setClientName(clientName);
        this.pinNumber = pinNumber;
        this.hasWithdrawn = false;
        this.dateOfWithdrawal = "";
        this.withdrawalAmount = 0;
     }
    
    
    //getter method
     public int getPinNumber()
     {
        return this.pinNumber;
     }
    
     public int getWithdrawalAmount()
     {
         return this.withdrawalAmount;
     }
     
     public String getDateOfWithdrawal()
     {
         return this.dateOfWithdrawal;
     }
     
     public boolean getHasWithdrawn()
     {
         return this.hasWithdrawn;
     }
     
     
     //setter method
     public void withdrawalAmount(int withdrawalAmount)
     {
         this.withdrawalAmount = withdrawalAmount;
     }
     
     
     //method to check the withdrawal process
     public void Withdraw(int withdrawalAmount, String dateOfWithdrawal, int pinNumber)
     {
         if (this.pinNumber == pinNumber){
             if (this.withdrawalAmount <= super.getBalanceAmount()){
             super.setBalanceAmount(super.getBalanceAmount() - withdrawalAmount);
             this.withdrawalAmount = withdrawalAmount;
             this.dateOfWithdrawal = dateOfWithdrawal;
             this.hasWithdrawn = true;
             System.out.println("Successfully Withdrawn");
            }
            else{
                System.out.println("insufficient Balance");
            }
         }
         else{
             System.out.println("Invalid Pin");
         }
     }
     
     //method to display details of Debit Card
     public void display(){
         super.display();
         System.out.println("Pin: " + this.pinNumber);
         if (hasWithdrawn) {
            System.out.println("Withdrawal Amount: " + this.withdrawalAmount);
            System.out.println("Withdrawal Date: " + this.dateOfWithdrawal);
         } 
         else {
            System.out.println("No transactions has been made.");
         }
     }
 }
     
     
    
