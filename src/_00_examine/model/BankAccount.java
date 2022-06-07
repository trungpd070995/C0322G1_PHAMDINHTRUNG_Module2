package _00_examine.model;

public abstract class BankAccount {
    private int id;
    private String code;
    private String name;
    private String creationDate;

    public BankAccount(int id, String code, String name, String creationDate) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public abstract String toString();

}
