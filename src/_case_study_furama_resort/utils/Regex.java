package _case_study_furama_resort.utils;

public class Regex {
    public static String regexIdVilla(){
        return REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    }

    public static String regexIdHouse(){
        return REGEX_ID_HOUSE = "^(SVHO)[-][0-9]{4}$";
    }

    public static String regexIdRoom(){
        return REGEX_ID_ROOM = "^(SVRO)[-][0-9]{4}$";
    }


    public static String regexPerson(){
        return REGEX_PERSON = "^[1-9]|([1][0-9])|(20)$";
    }

    public static String regexPrice(){
        return REGEX_PRICE = "^[0-9]*[1-9][0-9]*$";
    }

    public static String regexArea(){
        return REGEX_AREA_POOL_AND_AREA_USE = "^([3-9]\\d|[1-9]\\d{2,})$";
    }

    public static String regexBirthday(){
        return REGEX_BIRTHDAY = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/]" +
                "(0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|^29[\\/]02[\\/](19|" +
                "[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$";
    }

    public static String regexPhone(){
        return REGEX_PHONE = "^(09|03|07|08|)([0-9]{8})$";
    }

    public static String regexIdCar(){
        return REGEX_ID_CAR ="^[1-9]{1}[0-9]{8}$";
    }

    public static String regexName(){
        return REGEX_NAME ="^[A-Z][a-z]*(\\ [A-Z][a-z]*)*$";
    }

    public static String regexEmail(){
        return REGEX_MAIL = "^[a-zA-Z0-9]*\\@gmail\\.com\\.vn|[a-zA-Z0-9]*\\@gmail\\.com$";
    }

    public static String regexCostAndFloor(){
        return REGEX_COST_AND_FLOOR = "[1-9][0-9]*";
    }
    public static  String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}"; //ID villa
    public static  String REGEX_ID_HOUSE = "^(SVHO)[-][0-9]{4}$"; //ID house
    public static  String REGEX_ID_ROOM = "^(SVRO)[-][0-9]{4}$"; //ID room
    public static  String REGEX_PERSON = "^[1-9]|([1][0-9])|(20)$"; //Số lượng người tối đa
    public static  String REGEX_PRICE = "^[0-9]*[1-9][0-9]*$";
    public static  String REGEX_COST_AND_FLOOR = "[1-9][0-9]*"; // Số nguyên dương
    public static  String REGEX_AREA_POOL_AND_AREA_USE = "^([3-9]\\d|[1-9]\\d{2})$"; //Diện tích sử dụng
    public static  String REGEX_BIRTHDAY = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/]" +
            "(0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|^29[\\/]02[\\/](19|" +
            "[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$";

    public static  String REGEX_NAME ="^[A-Z][a-z]*(\\ [A-Z][a-z]*)*$";
    public static  String REGEX_PHONE ="^(09|03|07|08|)([0-9]{8})$";
    public static  String REGEX_ID_CAR ="^[1-9]{1}[0-9]{8}$";
    public static  String REGEX_MAIL="^[a-zA-Z0-9]*\\@gmail\\.com\\.vn|[a-zA-Z0-9]*\\@gmail\\.com$";

    public static final String REGEX_TYPE_NAME_STANDAR = "[A-Z][a-z]+"; //Kiểu chuẩn hoá tiêu chuẩn
    public static final String REGEX_AMOUNT_MAXIMUM_QUANTITY = "^[1-9]|([1][0-9])|(20)$"; //Số lượng tối đa
    public static final String REGEX_FLOORS = "[1-9][0-9]*";
    public static final String REGEX_COST = "[1-9][0-9]*"; //Chi phí
}
