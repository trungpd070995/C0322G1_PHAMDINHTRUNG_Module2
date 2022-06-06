package quan_li_tai_khoan_ngan_hang.utils;

public class NotFoundBankAccountException extends Exception {
    @Override
    public String getMessage() {
        return  "Account Bank is not exist ! retry";
    }
}
