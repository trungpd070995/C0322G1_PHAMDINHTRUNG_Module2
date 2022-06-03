package _case_study_resort_furama.ultils;

import _case_study_resort_furama.exception.*;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexData {
    private static Scanner scanner = new Scanner(System.in);

//
    public static String regexVilla(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new VillaException("Bạn đã nhập sai mã định dạng. Mã định dạng phải là SVVL-YYYY");
                }

            } catch (VillaException e) {
                System.err.println(e.getMessage());
            }
        } while (check);
        return temp;
    }


    public static String regexHouse(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new HouseException("Bạn đã nhập sai mã định dạng. Mã định dạng phải là SVHO-YYYY");
                }

            } catch (HouseException e) {
                System.err.println(e.getMessage());
            }
        } while (check);
        return temp;
    }

    public static String regexRoom(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new RoomException("Bạn đã nhập sai mã định dạng. Mã định dạng phải là SVRO-YYYY");
                }

            } catch (RoomException e) {
                System.err.println(e.getMessage());
            }
        } while (check);
        return temp;
    }

    public static String regexString(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new StringException("Bạn đã nhập sai mã định dạng. Tên dịch vụ phải viết hoa");
                }

            } catch (StringException e) {
                System.err.println(e.getMessage());
            }
        } while (check);
        return temp;
    }

    public static String regexAmount(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new AmoutException("Bạn đã nhập sai mã định dạng. Số lượng người tối đa phải >0 và nhỏ hơn <20");
                }

            } catch (AmoutException e) {
                System.err.println(e.getMessage());
            }
        } while (check);
        return temp;
    }

    public static String regexInt(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new IntException("Bạn đã nhập sai mã định dạng. Diện tích phải lớn hơn 30m^2");
                }

            } catch (IntException e) {
                System.err.println(e.getMessage());
            }
        } while (check);
        return temp;
    }

    public static String regexArea(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new AreaException("Bạn đã nhập sai mã định dạng. Số tầng phải là số nguyên dương");
                }

            } catch (AreaException e) {
                System.err.println(e.getMessage());
            }
        } while (check);
        return temp;
    }

    public static String regexAge(String temp, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(regex, temp)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(temp, formatter);
                    LocalDate now = LocalDate.now();
                    int current = Period.between(age, now).getYears();
                    if (current > 18 && current < 100) {
                        check = false;
                    } else {
                        throw new AgeException("Tuổi phải lớn hơn 18 và bé hơn 100");
                    }
                } else {
                    throw new AgeException("Định dạng nhập vào không đúng");
                }
            } catch (AgeException e) {
                System.err.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }

    public static String regexPhone(String regex){
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new PhoneException("Bạn đã nhập sai mã định dạng. Số điện thoại phải bắt đầu từ 0");
                }
            } catch (PhoneException e) {
                System.err.println(e.getMessage());
            }
        } while (check);
        return temp;
    }

}
