
/**
 * Write a description of class GUI here.
 *
 * @author (22067854 Roman Dangol)
 * @version (1.0.0)
 */
import javax.swing.*;
import java.util.ArrayList;
import java.awt.event.*;
import java.awt.*;
public class BankGUI implements ActionListener
{
    //declaring all components here
    private JFrame frame;

    // labels for headings
    private JLabel heading1,heading2,bankcard; 
    //------- declaring components for debit card 
    private JLabel debitcard,name1,card1,bankaccount1,issuer1,bamount1,pin1,wdebitcard,wamount1,wdate1,pin2, cardID;
    private JTextField name1txt,card1txt,bankaccount1txt,issuer1txt,bamount1txt,pin1txt,wamount1txt,pin2txt,wdate1txt,cardIDtxt;
    private JButton adddebit,withdraw1, display1;
    private JComboBox wdate1combo,wmonthcombo,wyearcombo;

    //------- declaring components for credit card 
    private JLabel creditcard,name2,card2,bankaccount2,issuer2,bamount2,creditlimit,cvcnumber,intrate,expdate,wcreditcard, cardID1,graceperiod;
    private JTextField name2txt,card2txt,bankaccount2txt,issuer2txt,bamount2txt,creditlimittxt,cvcnumbertxt,intratetxt,expdatetxt,wdate2txt,cardID1txt,graceperiodtxt;
    private JButton addcredit,clearbtn,setcredit,cancelcard,display2;
    private JComboBox expdatecombo,expmonthcombo,expyearcombo;

    private ArrayList<BankCard> cards = new ArrayList();

    //constructor
    public BankGUI(){
        //------create frame----------//
        frame = new JFrame();

        heading1 = new JLabel("SANIMA");
        heading1.setBounds(345, 3, 111, 39);
        heading1.setForeground(new Color(0,100,0));
        heading1.setFont(new Font("Helvetica", Font.BOLD, 26));
        frame.add(heading1);

        heading2 = new JLabel("BANK");
        heading2.setBounds(452, 3, 117, 39);
        heading2.setForeground(new Color(61,138,247));
        heading2.setFont(new Font("Helvetica", Font.BOLD, 26));
        frame.add(heading2);

        bankcard = new JLabel("BANK CARD");
        bankcard.setBounds(365, 42, 155, 36);
        bankcard.setFont(new Font("Helvetica", Font.BOLD, 24));
        frame.add(bankcard);

        //------------creating debit card components------------//
        debitcard = new JLabel("DebitCard Details");
        debitcard.setBounds(72, 90, 236, 30);
        debitcard.setForeground(new Color(98,156,68));
        debitcard.setFont(new Font("Helvetica", Font.BOLD, 24));
        frame.add(debitcard);

        name1 = new JLabel("Client Name       :");
        name1.setBounds(72, 141, 130, 25);
        name1.setForeground(new Color(61,138,247));
        name1.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(name1);

        name1txt = new JTextField();
        name1txt.setBounds(204, 140, 193, 25);
        name1txt.setForeground(new Color(61,138,247));
        name1txt.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(name1txt);

        card1 = new JLabel("Card ID             :");
        card1.setBounds(72, 168, 130, 25);
        card1.setForeground(new Color(61,138,247));
        card1.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(card1);

        card1txt = new JTextField();
        card1txt.setBounds(204, 167, 193, 25);
        card1txt.setForeground(new Color(61,138,247));
        card1txt.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(card1txt);

        bankaccount1 = new JLabel("Bank Account     :");
        bankaccount1.setBounds(72, 194, 130, 25);
        bankaccount1.setForeground(new Color(61,138,247));
        bankaccount1.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(bankaccount1);

        bankaccount1txt = new JTextField();
        bankaccount1txt.setBounds(204, 194, 193, 25);
        bankaccount1txt.setForeground(new Color(61,138,247));
        bankaccount1txt.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(bankaccount1txt);

        issuer1 = new JLabel("Issuer Bank        :");
        issuer1.setBounds(72, 221, 130, 25);
        issuer1.setForeground(new Color(61,138,247));
        issuer1.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(issuer1);

        issuer1txt = new JTextField();
        issuer1txt.setBounds(204, 221, 193, 25);
        issuer1txt.setForeground(new Color(61,138,247));
        issuer1txt.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(issuer1txt);

        bamount1 = new JLabel("Balance Amount :");
        bamount1.setBounds(72, 249, 130, 25);
        bamount1.setForeground(new Color(61,138,247));
        bamount1.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(bamount1);

        bamount1txt = new JTextField();
        bamount1txt.setBounds(204, 248, 193, 25);
        bamount1txt.setForeground(new Color(61,138,247));
        bamount1txt.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(bamount1txt);

        pin1 = new JLabel("PIN Number        :");
        pin1.setBounds(72, 275, 130, 25);
        pin1.setForeground(new Color(61,138,247));
        pin1.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(pin1);

        pin1txt = new JTextField();
        pin1txt.setBounds(204, 275, 193, 25);
        pin1txt.setForeground(new Color(61,138,247));
        pin1txt.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(pin1txt);

        adddebit = new JButton("Add DebitCard");
        adddebit.setBounds(72, 332, 125, 30);
        adddebit.setBackground(new Color(203, 232, 186));
        adddebit.setFocusable(false);
        frame.add(adddebit);

        display1 = new JButton("Display");
        display1.setBounds(225, 332, 106, 30);
        display1.setBackground(new Color(203, 232, 186));
        display1.setFocusable(false);
        frame.add(display1);

        //---------withdraw section for debit card----------//
        wdebitcard = new JLabel("Withdraw From DebitCard");
        wdebitcard.setBounds(510, 122, 313, 30);
        wdebitcard.setForeground(new Color(98,156,68));
        wdebitcard.setFont(new Font("Helvetica", Font.BOLD, 22));
        frame.add(wdebitcard);

        cardID = new JLabel("Card ID                   :");
        cardID.setBounds(510, 167, 153, 25);
        cardID.setForeground(new Color(61,138,247));
        cardID.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(cardID);

        cardIDtxt = new JTextField();
        cardIDtxt.setBounds(666, 166, 193, 25);
        cardIDtxt.setForeground(new Color(61,138,247));
        cardIDtxt.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(cardIDtxt);

        wamount1 = new JLabel("Withdrawal Amount :");
        wamount1.setBounds(510, 200, 153, 25);
        wamount1.setForeground(new Color(61,138,247));
        wamount1.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(wamount1);

        wamount1txt = new JTextField();
        wamount1txt.setBounds(666, 200, 193, 25);
        wamount1txt.setForeground(new Color(61,138,247));
        wamount1txt.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(wamount1txt);

        pin2 = new JLabel("PIN Number            :");
        pin2.setBounds(510, 232, 156, 25);
        pin2.setForeground(new Color(61,138,247));
        pin2.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(pin2);

        pin2txt = new JTextField();
        pin2txt.setBounds(666, 231, 193, 25);
        pin2txt.setForeground(new Color(61,138,247));
        pin2txt.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(pin2txt);

        String date[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String month[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String year[]={"2023","2024","2025","2026","2027"};

        wdate1combo = new JComboBox(date);
        wdate1combo.setBounds(666, 264, 57, 27);
        frame.add(wdate1combo);

        wmonthcombo = new JComboBox(month);
        wmonthcombo.setBounds(734, 264, 57, 27);
        frame.add(wmonthcombo);

        wyearcombo = new JComboBox(year);
        wyearcombo.setBounds(802, 264, 57, 27);
        frame.add(wyearcombo);

        wdate1 = new JLabel("Date of Withdrawal  :");
        wdate1.setBounds(510, 265, 157, 25);
        wdate1.setForeground(new Color(61,138,247));
        wdate1.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(wdate1);

        withdraw1 = new JButton("Withdraw");
        withdraw1.setBounds(510, 320, 106, 30);
        withdraw1.setBackground(new Color(203, 232, 186));
        withdraw1.setFocusable(false);
        frame.add(withdraw1);

        //-----------creating credit card components-----------//
        creditcard = new JLabel("CreditCard Details");
        creditcard.setBounds(72, 402, 236, 30);
        creditcard.setForeground(new Color(98,156,68));
        creditcard.setFont(new Font("Helvetica", Font.BOLD, 24));
        frame.add(creditcard);

        name2 = new JLabel("Client Name       :");
        name2.setBounds(72, 455, 134, 25);
        name2.setForeground(new Color(61,138,247));
        name2.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(name2);

        name2txt = new JTextField();
        name2txt.setBounds(210, 455, 193, 25);
        name2txt.setForeground(new Color(61,138,247));
        name2txt.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(name2txt);

        card2 = new JLabel("Card ID              :");
        card2.setBounds(72, 483, 134, 25);
        card2.setForeground(new Color(61,138,247));
        card2.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(card2);

        card2txt = new JTextField();
        card2txt.setBounds(210, 482, 193, 25);
        card2txt.setForeground(new Color(61,138,247));
        card2txt.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(card2txt);

        bankaccount2 = new JLabel("Bank Account     :");
        bankaccount2.setBounds(72, 510, 134, 25);
        bankaccount2.setForeground(new Color(61,138,247));
        bankaccount2.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(bankaccount2);

        bankaccount2txt = new JTextField();
        bankaccount2txt.setBounds(210, 508, 193, 25);
        bankaccount2txt.setForeground(new Color(61,138,247));
        bankaccount2txt.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(bankaccount2txt);

        issuer2 = new JLabel("Issuer Bank        :");
        issuer2.setBounds(72, 537, 134, 25);
        issuer2.setForeground(new Color(61,138,247));
        issuer2.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(issuer2);

        issuer2txt = new JTextField();
        issuer2txt.setBounds(210, 536, 193, 25);
        issuer2txt.setForeground(new Color(61,138,247));
        issuer2txt.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(issuer2txt);

        bamount2 = new JLabel("Balance Amount :");
        bamount2.setBounds(72, 564, 134, 25);
        bamount2.setForeground(new Color(61,138,247));
        bamount2.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(bamount2);

        bamount2txt = new JTextField();
        bamount2txt.setBounds(210, 563, 193, 25);
        bamount2txt.setForeground(new Color(61,138,247));
        bamount2txt.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(bamount2txt);

        cvcnumber = new JLabel("CVC Number      :");
        cvcnumber.setBounds(72, 593, 134, 25);
        cvcnumber.setForeground(new Color(61,138,247));
        cvcnumber.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(cvcnumber);

        cvcnumbertxt = new JTextField();
        cvcnumbertxt.setBounds(210, 592, 193, 25);
        cvcnumbertxt.setForeground(new Color(61,138,247));
        cvcnumbertxt.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(cvcnumbertxt);

        intrate = new JLabel("Interest Rate       :");
        intrate.setBounds(72, 620, 134, 25);
        intrate.setForeground(new Color(61,138,247));
        intrate.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(intrate);

        intratetxt = new JTextField();
        intratetxt.setBounds(210, 619, 193, 25);
        intratetxt.setForeground(new Color(61,138,247));
        intratetxt.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(intratetxt);

        expdate = new JLabel("Expiration Date   :");
        expdate.setBounds(72, 650, 134, 25);
        expdate.setForeground(new Color(61,138,247));
        expdate.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(expdate);

        expdatecombo = new JComboBox(date);
        expdatecombo.setBounds(210, 648, 57, 27);
        frame.add(expdatecombo);

        expmonthcombo = new JComboBox(month);
        expmonthcombo.setBounds(278, 648, 57, 27);
        frame.add(expmonthcombo);

        expyearcombo = new JComboBox(year);
        expyearcombo.setBounds(346, 648, 57, 27);
        frame.add(expyearcombo);

        addcredit = new JButton("Add CreditCard");
        addcredit.setBounds(72, 690, 125, 30);
        addcredit.setBackground(new Color(203, 232, 186));
        addcredit.setFocusable(false);
        frame.add(addcredit);

        display2 = new JButton("Display");
        display2.setBounds(225, 690, 106, 30);
        display2.setBackground(new Color(203, 232, 186));
        display2.setFocusable(false);
        frame.add(display2);

        clearbtn = new JButton("Clear");
        clearbtn.setBounds(383, 735, 180, 30);
        clearbtn.setBackground(new Color(203, 232, 186));
        clearbtn.setFocusable(false);
        frame.add(clearbtn);

        //----------credit limit section for credit card----------//
        wcreditcard = new JLabel("Set Credit Limit For CreditCard");
        wcreditcard.setBounds(510, 443, 337, 30);
        wcreditcard.setForeground(new Color(98,156,68));
        wcreditcard.setFont(new Font("Helvetica", Font.BOLD, 22));
        frame.add(wcreditcard);

        cardID1 = new JLabel("Card ID                 :");
        cardID1.setBounds(510, 493, 153, 25);
        cardID1.setForeground(new Color(61,138,247));
        cardID1.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(cardID1);

        cardID1txt = new JTextField();
        cardID1txt.setBounds(666, 491, 193, 25);
        cardID1txt.setForeground(new Color(61,138,247));
        cardID1txt.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(cardID1txt);

        creditlimit = new JLabel("Credit Limit            :");
        creditlimit.setBounds(510, 526, 157, 25);
        creditlimit.setForeground(new Color(61,138,247));
        creditlimit.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(creditlimit);

        creditlimittxt = new JTextField();
        creditlimittxt.setBounds(666, 525, 193, 25);
        creditlimittxt.setForeground(new Color(61,138,247));
        creditlimittxt.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(creditlimittxt);

        graceperiod = new JLabel("Grace Period         :");
        graceperiod.setBounds(510, 559, 156, 25);
        graceperiod.setForeground(new Color(61,138,247));
        graceperiod.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(graceperiod);

        graceperiodtxt = new JTextField();
        graceperiodtxt.setBounds(666, 559, 193, 25);
        graceperiodtxt.setForeground(new Color(61,138,247));
        graceperiodtxt.setFont(new Font("Helvetica", Font.PLAIN, 16));
        frame.add(graceperiodtxt);

        setcredit = new JButton("Set Credit LImit");
        setcredit.setBounds(510, 605, 125, 30);
        setcredit.setBackground(new Color(203, 232, 186));
        setcredit.setFocusable(false);
        frame.add(setcredit);

        cancelcard = new JButton("Cancel CreditCard");
        cancelcard.setBounds(647, 605, 151, 30);
        cancelcard.setBackground(new Color(203, 232, 186));
        cancelcard.setFocusable(false);
        frame.add(cancelcard);

        //----adding Actionlistener to the buttons------//
        adddebit.addActionListener(this);
        addcredit.addActionListener(this);
        clearbtn.addActionListener(this);
        display1.addActionListener(this);
        withdraw1.addActionListener(this);
        display2.addActionListener(this);
        setcredit.addActionListener(this);
        cancelcard.addActionListener(this);

        //-----setting up frame properties-------//
        frame.setLayout(null);
        frame.setSize(900,830);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    //implement the method of the    
    //ActionListener
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == adddebit){
            try{
                //Get values from text fields
                String balanceAmount = bamount1txt.getText();
                int BalanceAmount = Integer.parseInt(balanceAmount);

                String cardID = card1txt.getText();
                int CardID = Integer.parseInt(cardID);

                String bankAccount = bankaccount1txt.getText();
                String issuerBank = issuer1txt.getText();
                String clientName = name1txt.getText();

                String pinNumber = pin1txt.getText();
                int PinNumber = Integer.parseInt(pinNumber);

                // Create a DebitCard object with the entered details
                DebitCard debitCardDetails = new DebitCard(BalanceAmount, CardID, bankAccount, issuerBank, clientName,PinNumber);

                boolean isAdded = false;
                if(cards.isEmpty()){
                    // If the cards list is empty, add the debit card directly
                    cards.add(debitCardDetails);
                    JOptionPane.showMessageDialog(frame, "Card has been added", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    for (BankCard debtcard : cards){
                        if(CardID == debtcard.getCardId()){
                            // If a card with the same ID already exists, display a message
                            JOptionPane.showMessageDialog(frame, "Card has already been added", "Success", JOptionPane.INFORMATION_MESSAGE);
                            isAdded = false;
                        }
                        else{
                            isAdded = true;
                        }
                    }
                    if(isAdded == true){
                        // If the card is not already added, add it to the cards list
                        cards.add(debitCardDetails);
                        JOptionPane.showMessageDialog(frame, "Card has been added", "Success", JOptionPane.INFORMATION_MESSAGE); 
                    }
                }
            }
            catch(NumberFormatException nfe){
                // Show error message for invalid input
                JOptionPane.showMessageDialog(frame, "Unacceptable Input Format. Please enter a valid input", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if(e.getSource() == display1){
            if(cards.isEmpty()){
                // If no DebitCard is added, display an error message
                JOptionPane.showMessageDialog(frame, "Sorry, no DebitCard has been added yet", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                for(BankCard displaydebit: cards){
                    if(displaydebit instanceof DebitCard){
                        // If the card is a DebitCard, display its details
                        JOptionPane.showMessageDialog(frame, "The details of Debit Card has been displayed", "Success", JOptionPane.INFORMATION_MESSAGE);
                        System.out.println("\n");
                        ((DebitCard)displaydebit).display();
                        System.out.println("\n");
                    }
                }
            }
        }

        if (e.getSource() == withdraw1) {
            try {
                String cardID12 = cardIDtxt.getText();
                int CarddID1 = Integer.parseInt(cardID12);

                String PinNumber = pin2txt.getText();
                int pinNumber1 = Integer.parseInt(PinNumber);

                String withdrawalAmount = wamount1txt.getText();
                int WithdrawalA = Integer.parseInt(withdrawalAmount);

                String year = (String) wyearcombo.getSelectedItem();
                String month = (String) wmonthcombo.getSelectedItem();
                String day = (String) wdate1combo.getSelectedItem();
                String dateofwithdrawal = year + month + day;

                if (cards.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Cannot Withdraw, DebitCard has not been added", "Alert",
                        JOptionPane.ERROR_MESSAGE);
                } else {
                    boolean cardFound = false;  // Flag variable to track if the card is found
                    for (BankCard withdrawCards : cards) {
                        if (withdrawCards instanceof DebitCard) {
                            if (CarddID1 == withdrawCards.getCardId()) {
                                if (pinNumber1 == ((DebitCard) withdrawCards).getPinNumber()) {
                                    if (WithdrawalA <= ((DebitCard) withdrawCards).getBalanceAmount()) {
                                        ((DebitCard) withdrawCards).Withdraw(WithdrawalA, dateofwithdrawal, pinNumber1);
                                        JOptionPane.showMessageDialog(frame, "The amount has been withdrawn successfully",
                                            "Success", JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(frame, "Insufficient Balance", "Alert",
                                            JOptionPane.INFORMATION_MESSAGE);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(frame, "Incorrect Pin Number", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                }
                                cardFound = true;  // Set the flag to true since the card is found
                                break;  // Exit the loop since the card is found
                            }
                        }
                    }
                    if (!cardFound) {  // If card is not found after the loop
                        JOptionPane.showMessageDialog(frame, "The DebitCard with given Id has not been found", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(frame, "The information you provided cannot be accepted", "Error",
                    JOptionPane.ERROR_MESSAGE);
            }
        }

        
        if(e.getSource() == addcredit){
            try{
                //Get values from text fields
                String cardid = card2txt.getText();
                int CardID1 = Integer.parseInt(cardid);

                String clientname = name2txt.getText();
                String issuerbank = issuer2txt.getText();
                String bankaccount = bankaccount2txt.getText();

                String balanceamount = bamount2txt.getText();
                int BalanceAmount = Integer.parseInt(balanceamount);

                String cvcNumber = cvcnumbertxt.getText();
                int CvcNumber = Integer.parseInt(cvcNumber);

                String interestRate = intratetxt.getText();
                double interestRateDouble = Double.parseDouble(interestRate);

                String year1 = (String)expyearcombo.getSelectedItem();
                String month1 = (String)expmonthcombo.getSelectedItem();
                String day1 = (String)expdatecombo.getSelectedItem();
                String dateofexp = (year1 + month1 + day1);

                CreditCard creditCardDetails = new CreditCard(CardID1, clientname, issuerbank, bankaccount, BalanceAmount, CvcNumber, interestRateDouble, dateofexp);

                boolean isAdded = false;
                if(cards.isEmpty()){
                    // If no cards are added, add the credit card and display a success message
                    cards.add(creditCardDetails);
                    JOptionPane.showMessageDialog(frame, "Card has been added", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    for(BankCard creditcard : cards){
                        if(CardID1 == creditcard.getCardId()){
                            // If the card with the same ID is already added, display a message 
                            JOptionPane.showMessageDialog(frame, "Card has already been added", "Success", JOptionPane.INFORMATION_MESSAGE);
                            isAdded = false;
                        }
                        else{
                            isAdded = true;
                        }
                    }
                    if(isAdded == true){
                        // If the card is not already added, add the credit card and display a success message
                        cards.add(creditCardDetails);
                        JOptionPane.showMessageDialog(frame, "Card has been added", "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(frame, "Please enter a valid input", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if(e.getSource() == display2){
            if(cards.isEmpty()){
                // Displaying an error message if no CreditCard has been added yet
                JOptionPane.showMessageDialog(frame, "Sorry, no CreditCard has been added yet", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                for(BankCard displaycredit: cards){
                    if(displaycredit instanceof CreditCard){
                        // Displaying a success message before showing the details of each Credit Card
                        JOptionPane.showMessageDialog(frame, "The details of Credit Card has been displayed", "Success", JOptionPane.INFORMATION_MESSAGE);
                        System.out.println("\n");
                        ((CreditCard)displaycredit).display();
                        System.out.println("\n");
                    }
                }
            }

        }

        if (e.getSource() == setcredit) {
            try {
                String cardid1 = cardID1txt.getText();
                int Cardid1 = Integer.parseInt(cardid1);

                String CreditLimit = creditlimittxt.getText();
                int creditLimit = Integer.parseInt(CreditLimit);

                String gracePeriod = graceperiodtxt.getText();
                int GracePeriod = Integer.parseInt(gracePeriod);

                if (cards.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Cannot set Credit Limit, Credit Card has not been added", "Alert", JOptionPane.ERROR_MESSAGE);
                } else {
                    boolean cardFound = false;
                    for (BankCard setCredit : cards) {
                        if (setCredit instanceof CreditCard) {
                            if (Cardid1 == setCredit.getCardId()) {
                                cardFound = true;
                                if (creditLimit <= 2.5 * setCredit.getCardId()) {
                                    ((CreditCard) setCredit).setCreditLimit(creditLimit, GracePeriod);
                                    JOptionPane.showMessageDialog(frame, "The Credit Limit has been set successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                                    break; // Exit the loop since the credit limit is set
                                } else {
                                    JOptionPane.showMessageDialog(frame, "The amount you entered is more than the credit limit", "Alert", JOptionPane.ERROR_MESSAGE);
                                    break; // Exit the loop since the credit limit condition is not met
                                }
                            }
                        }
                    }
                    if (!cardFound) {
                        JOptionPane.showMessageDialog(frame, "The provided ID has not been found", "Alert", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(frame, "The information you provided cannot be accepted", "Alert", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == cancelcard) {
            try {
                // Get values from text fields
                String cardid2 = cardID1txt.getText();
                int Cardid1 = Integer.parseInt(cardid2);

                if (cards.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Cannot cancel Credit Card, Credit Card has not been added", "Alert", JOptionPane.ERROR_MESSAGE);
                } else {
                    boolean cardFound = false;
                    for (BankCard cancelcard : cards) {
                        if (cancelcard instanceof CreditCard) {
                            if (Cardid1 == cancelcard.getCardId()) {
                                ((CreditCard) cancelcard).cancelCreditCard();
                                JOptionPane.showMessageDialog(frame, "The Credit Card has been cancelled", "Success", JOptionPane.INFORMATION_MESSAGE);
                                cardFound = true;
                                break; // Exit the loop after canceling the credit card
                            }
                        }
                    }
                    if (!cardFound) {
                        JOptionPane.showMessageDialog(frame, "The card ID provided does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(frame, "The information you provided cannot be accepted", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if(e.getSource() == clearbtn){
            // Clearing the text fields
            name1txt.setText("");
            card1txt.setText("");
            bankaccount1txt.setText("");
            issuer1txt.setText("");
            bamount1txt.setText("");
            pin1txt.setText("");
            cardIDtxt.setText("");
            wamount1txt.setText("");
            pin2txt.setText("");
            name2txt.setText("");
            card2txt.setText("");
            bankaccount2txt.setText("");
            issuer2txt.setText("");
            bamount2txt.setText("");
            cvcnumbertxt.setText("");
            intratetxt.setText("");
            cardID1txt.setText("");
            graceperiodtxt.setText("");
            creditlimittxt.setText("");
            // Resetting the selected items in combo boxes
            wdate1combo.setSelectedItem("1");
            wmonthcombo.setSelectedItem("Jan");
            wyearcombo.setSelectedItem("2023");
            expdatecombo.setSelectedItem("1");
            expmonthcombo.setSelectedItem("Jan");
            expyearcombo.setSelectedItem("2023");
        }
    }

    public static void main(String[] args){
        BankGUI GUI = new BankGUI();
    }
}