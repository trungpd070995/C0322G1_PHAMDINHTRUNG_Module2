package _case_study_furama_resort.models.contracts_class;

public class Contracts {
    private String contractNumber;
    private String bookingCode;
    private String deposit;
    private String totalPayment;
    private String customerCode;

    public Contracts() {
    }

    public Contracts(String contractNumber, String bookingCode, String deposit, String totalPayment, String customerCode) {
        this.contractNumber = contractNumber;
        this.bookingCode = bookingCode; //mã đặt chỗ
        this.deposit = deposit; //đặt cọc
        this.totalPayment = totalPayment; //tổng tiền thanh toán
        this.customerCode = customerCode; //mã khách hàng
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(String totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber='" + contractNumber + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", deposit='" + deposit + '\'' +
                ", totalPayment='" + totalPayment + '\'' +
                ", customerCode='" + customerCode + '\'' +
                '}';
    }
}
