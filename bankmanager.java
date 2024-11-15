import java.util.Comparator;

class Bank{
    private static int transactioncharges = 10;

    public static int getTransactioncharges() {
        return transactioncharges;
    }

    public static void setTransactioncharges(int charges) {
        transactioncharges = charges;
    }
}

class ICICI extends Bank{
    private int icicitransactioncharges;

    public ICICI() {
        this.icicitransactioncharges = calculateCharges();
    }
    private int calculateCharges(){
        return (int) (super.getTransactioncharges()*0.8);
    }
    void showTransactionCharges(){
        System.out.println("ICICI Transaction Charges : "+icicitransactioncharges);
    }
}

class HDFC extends Bank{
    private int hdfctransactioncharges;
    public HDFC() {
        this.hdfctransactioncharges = calculateCharges();
    }
    private int calculateCharges(){
        return (int) (super.getTransactioncharges()*1.2);
    }
    void showTransactionCharges(){
        System.out.println("HDFC Transaction Charges : "+hdfctransactioncharges);
    }
}
public class bankmanager {
    public static void main(String[] args) {
        Bank.setTransactioncharges(10);
        ICICI icici_bank = new ICICI();
        HDFC hdfc_bank = new HDFC();
        icici_bank.showTransactionCharges();
        hdfc_bank.showTransactionCharges();
    }

} 