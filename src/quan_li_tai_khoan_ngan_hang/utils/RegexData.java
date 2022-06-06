package quan_li_tai_khoan_ngan_hang.utils;

import java.util.Scanner;

public class RegexData {
    private static Scanner scanner = new Scanner(System.in);
    public static String regexData(String temp , String regex , String error){
        boolean check = true;
        do {
            if(temp.matches(regex)){
                check = false;
            }else {
                System.out.println(error);
                temp = scanner.nextLine();
            }
        }while (check);
        return temp;
    }
}
