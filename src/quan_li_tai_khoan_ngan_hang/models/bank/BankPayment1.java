package quan_li_tai_khoan_ngan_hang.models.bank;

public class BankPayment1 extends AccountBank {
    private int cardNumber;
    private  int accountMoney;
    private static String COMA = ",";

    public BankPayment1(){

    }

    public BankPayment1(int cardNumber, int accountMoney) {
        this.cardNumber = cardNumber;
        this.accountMoney = accountMoney;
    }

    public BankPayment1(int id, String accountCode,
                        String name, String dateOfBirthDay,
                        int cardNumber, int accountMoney) {
        super(id, accountCode, name, dateOfBirthDay);
        this.cardNumber = cardNumber;
        this.accountMoney = accountMoney;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(int accountMoney) {
        this.accountMoney = accountMoney;
    }

//    @Override
//    public String toString() {
//        return super.toString()+COMA+
//                getCardNumber()+COMA
//                +accountMoney;
//    }

    @Override
    public String toString() {
        return  super.toString() +
                "cardNumber=" + cardNumber +
                ", accountMoney=" + accountMoney ;
    }

    @Override
    public String toAccountBank() {
        return super.toAccountBank() + COMA+
                getCardNumber()+COMA
                +accountMoney;
    }
}
