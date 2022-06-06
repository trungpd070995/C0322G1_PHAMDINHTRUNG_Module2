package quan_li_tai_khoan_ngan_hang.models.bank;

public abstract class AccountBank implements IOStringAccountBank {
    private int id;
    private String accountCode;
    private String name;
    private String dateOfBirthDay;
    private static String COMA = ",";

    public AccountBank() {
    }

    public AccountBank(int id, String accountCode, String name, String dateOfBirthDay) {
        this.id = id;
        this.accountCode = accountCode;
        this.name = name;
        this.dateOfBirthDay = dateOfBirthDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirthDay() {
        return dateOfBirthDay;
    }

    public void setDateOfBirthDay(String dateOfBirthDay) {
        this.dateOfBirthDay = dateOfBirthDay;
    }

//    @Override
//    public String toString() {
//        return id+COMA+accountCode+COMA+name+COMA+dateOfBirthDay;
//    }

    @Override
    public String toString() {
        return "id=" + id +
                ", accountCode='" + accountCode + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirthDay='" + dateOfBirthDay
                ;
    }

    @Override
    public String toAccountBank() {
        return id+COMA+accountCode+COMA+name+COMA+dateOfBirthDay;
    }
}
