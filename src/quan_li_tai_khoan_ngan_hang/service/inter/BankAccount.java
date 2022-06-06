package quan_li_tai_khoan_ngan_hang.service.inter;

import quan_li_tai_khoan_ngan_hang.utils.NotFoundBankAccountException;

public interface BankAccount {
    void removeBank();

    void displayBank();

    void findByName() throws NotFoundBankAccountException;
}
