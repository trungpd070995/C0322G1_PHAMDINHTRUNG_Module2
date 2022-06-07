package _00_examine.model;

public class SavingBankAccount extends BankAccount {
    private int amount;
    private String depositDate;
    private double interestRate;
    private int term;

    public SavingBankAccount(int id,
                             String code,
                             String name,
                             String createDate,
                             int amount,
                             String depositDate,
                             double interestRate,
                             int term) {
        super(id, code, name, createDate);
        this.amount = amount;
        this.depositDate = depositDate;
        this.interestRate = interestRate;
        this.term = term;
    }

    public SavingBankAccount(String[] strArr) {
        super(Integer.parseInt(strArr[0]),strArr[1],strArr[2],strArr[3]);
        this.amount = Integer.parseInt(strArr[4]);
        this.depositDate = strArr[5];
        this.interestRate = Double.parseDouble(strArr[6]);
        this.term = Integer.parseInt(strArr[7]);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDepositDate() {
        return depositDate;
    }

    public void setDepositDate(String depositDate) {
        this.depositDate = depositDate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return  super.getId() + "," +
                super.getCode() + "," +
                super.getName() + "," +
                super.getCreationDate() + "," +
                amount + "," +
                depositDate + "," +
                interestRate + "," +
                term;
    }

    public String getInfo() {
        return  "---BANK ACCOUNT INFO--- \n" +
                "Bank ID: " + super.getId() + "," +
                "Bank Code: " + super.getCode() + "," +
                "Bank Name: " + super.getName() + "," +
                "Bank Creation Date: " + super.getCreationDate() + "," +
                "Saving Amount Of Money: " + amount + "," +
                "Deposit Saving Date: " + depositDate + "," +
                "Interest Rate: " + interestRate + "," +
                "Term: " + term;
    }
}
