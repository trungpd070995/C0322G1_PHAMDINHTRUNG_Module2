package quan_li_tai_khoan_ngan_hang.models.bank;

public class SavingsBank1 extends AccountBank {
    private int saveMoney;
    private String sentDayMoney;
    private double interestRate;
    private int tenor;
    private static String COMA = ",";

    public SavingsBank1(){
    }

    public SavingsBank1(int saveMoney, String sentDayMoney, double interestRate, int tenor) {
        this.saveMoney = saveMoney;
        this.sentDayMoney = sentDayMoney;
        this.interestRate = interestRate;
        this.tenor = tenor;
    }

    public SavingsBank1(int id, String accountCode, String name, String dateOfBirthDay,
                        int saveMoney, String sentDayMoney, double interestRate, int tenor) {
        super(id, accountCode, name, dateOfBirthDay);
        this.saveMoney = saveMoney;
        this.sentDayMoney = sentDayMoney;
        this.interestRate = interestRate;
        this.tenor = tenor;
    }

    public int getSaveMoney() {
        return saveMoney;
    }

    public void setSaveMoney(int saveMoney) {
        this.saveMoney = saveMoney;
    }

    public String getSentDayMoney() {
        return sentDayMoney;
    }

    public void setSentDayMoney(String sentDayMoney) {
        this.sentDayMoney = sentDayMoney;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTenor() {
        return tenor;
    }

    public void setTenor(int tenor) {
        this.tenor = tenor;
    }

//    @Override
//    public String toString() {
//        return  super.toString()+COMA
//                +getSaveMoney()+COMA+sentDayMoney+COMA
//                +interestRate+COMA+tenor;
//
//    }

    @Override
    public String toString() {
        return  super.toString()  +
                "saveMoney=" + saveMoney +
                ", sentDayMoney='" + sentDayMoney + '\'' +
                ", interestRate=" + interestRate +
                ", tenor=" + tenor
                ;
    }

    @Override
    public String toAccountBank() {
        return super.toAccountBank() +COMA
                +getSaveMoney()+COMA+sentDayMoney+COMA
                +interestRate+COMA+tenor;
    }
}
