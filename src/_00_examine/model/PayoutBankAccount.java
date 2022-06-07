package _00_examine.model;

public class PayoutBankAccount extends BankAccount {
    private String cardNumber;
    private int totalMoney;

    public PayoutBankAccount(int id,
                             String code,
                             String name,
                             String creationDate,
                             String cardNumber,
                             int totalMoney) {
        super(id, code, name, creationDate);
        this.cardNumber = cardNumber;
        this.totalMoney = totalMoney;
    }

    public PayoutBankAccount(String[] strArr) {
        super(Integer.parseInt(strArr[0]),strArr[1],strArr[2],strArr[3]);
        this.cardNumber = strArr[4];
        this.totalMoney = Integer.parseInt(strArr[5]);
    }

    @Override
    public String toString() {
        return  super.getId() + "," +
                super.getCode() + "," +
                super.getName() + "," +
                super.getCreationDate() + "," +
                cardNumber + "," +
                totalMoney;
    }

    public String getInfo() {
        return  "---BANK ACCOUNT INFO--- \n" +
                "Bank ID: " + super.getId() + "," +
                "Bank Code: " + super.getCode() + "," +
                "Bank Name: " + super.getName() + "," +
                "Bank Creation Date: " + super.getCreationDate() + "," +
                "Card Number: " + cardNumber + "," +
                "Total Money: " + totalMoney;
    }
}
