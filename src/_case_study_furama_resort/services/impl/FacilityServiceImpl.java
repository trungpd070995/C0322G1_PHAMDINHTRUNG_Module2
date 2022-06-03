package _case_study_furama_resort.services.impl;
import _case_study_furama_resort.models.facility_class.Facility;
import _case_study_furama_resort.models.facility_class.House;
import _case_study_furama_resort.models.facility_class.Room;
import _case_study_furama_resort.models.facility_class.Villa;
import _case_study_furama_resort.services.ServiceFacility;
import _case_study_furama_resort.utils.Regex;
import _case_study_furama_resort.utils.RegexData;

import java.util.*;

public class FacilityServiceImpl implements ServiceFacility {
    public static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static Scanner scanner = new Scanner(System.in);

    // Bước 1: tạo data ở khối static
    static {
        // Tạo data ở đây
        facilityIntegerMap.put(new Villa("1", "vip", 2, "2000000", 20, "vip", "vip", 3, 5), 0);
        facilityIntegerMap.put(new Villa("2", "vip", 3, "3000000", 19, "vip", "vip", 2, 4), 1);
        facilityIntegerMap.put(new Villa("3", "vip", 4, "4000000", 18, "vip", "vip", 5, 3), 2);
        facilityIntegerMap.put(new Villa("4", "vip", 5, "5000000", 17, "vip", "vip", 6, 2), 6);
        facilityIntegerMap.put(new House("5", "vip", 3, "6000000", 10, "vip", "vip", 4), 1);
        facilityIntegerMap.put(new House("6", "vip", 6, "7000000", 11, "vip", "vip", 3), 2);
        facilityIntegerMap.put(new House("7", "vip", 7, "8000000", 12, "vip", "vip", 2), 3);
        facilityIntegerMap.put(new Room("8", "vip", 1, "9000000", 5, "vip", "vip"), 1);
        facilityIntegerMap.put(new Room("9", "vip", 2, "500000", 6, "vip", "vip"), 2);
        facilityIntegerMap.put(new Room("10", "vip", 3, "1500000", 7, "vip", "vip"), 3);
    }

    @Override
    public void display() {

        // Bước 2 => Duyệt qua danh sách facilityIntegerMap rồi hiển thị lên
        Set<Facility> item = facilityIntegerMap.keySet();
        for (Facility temp : item) {
            System.out.println(temp);
        }
    }

    @Override
    public void addNewVilla() {
        System.out.println("Nhâp id: ");
        String id = RegexData.regexStr(scanner.nextLine(),Regex.regexIdVilla(),"Nhập sai định dạng ! Định dạng có mã là SVVL-XXXX");

        System.out.println("Nhập tên dịch vụ: ");
        String serviceName = RegexData.regexStr(scanner.nextLine(),Regex.regexName(),
                "Nhập sai định dạng ! Chữ cái bắt đầu phải viết hoa!");

        System.out.println("Nhập diện tích sử dụng: ");
        double usableArea = Double.parseDouble(RegexData.regexStr(scanner.nextLine(),Regex.regexArea(),
                "Nhập sai định dạng ! Vui lòng nhập lại !"));

        System.out.println("Nhập chi phí thuê: ");
        String rentalCosts = RegexData.regexStr(scanner.nextLine(),Regex.regexPrice(),
                "Nhập sai định dạng! Vui lòng nhập lại 1");

        System.out.println("Nhập số lượng người tối đa: ");
        int maximumPeople = Integer.parseInt(RegexData.regexStr(scanner.nextLine(),Regex.regexPerson(),
                "Nhập sai định dạng vui lòng nhập lại ! Tối đa 20 người!"));

        System.out.println("Nhập kiểu thuê: ");
        String rentalType = RegexData.regexStr(scanner.nextLine(),Regex.regexName(),
                "Nhập sai định dạng !Vui lòng nhập lại !");

        System.out.println("Nhập tiêu chuẩn phòng: ");
        String standarVilla = RegexData.regexStr(scanner.nextLine(),Regex.regexName(),
                "Nhập sai định dạng ! Vui lòng nhập lại !");

        System.out.println("Nhập diện tích hồ bơi: ");
        double poolArea = Double.parseDouble(RegexData.regexStr(scanner.nextLine(),Regex.regexArea(),
                "Diện tích hồ bơi phải lơn hơn 30m2"));

        System.out.println("Nhập số tầng: ");
        int numberFloor = Integer.parseInt(RegexData.regexStr(scanner.nextLine(),Regex.regexCostAndFloor(),
                "Nhập sai định dạng ! Phải là số nguyên dương !"));

        Villa villa = new Villa(id, serviceName, usableArea, rentalCosts, maximumPeople, rentalType, standarVilla, poolArea, numberFloor);
        facilityIntegerMap.put(villa, 0);
        System.out.println("Đã thêm mới thành công !");
    }

    @Override
    public void addNewHouse() {
        System.out.println("Nhâp id: ");
        String id = RegexData.regexStr(scanner.nextLine(),Regex.regexIdHouse(),
                "Nhập sai định dạng ! Định dạng có mã là SVHO-XXXX");

        System.out.println("Nhập tên dịch vụ: ");
        String serviceName = RegexData.regexStr(scanner.nextLine(),Regex.regexName(),
                "Nhập sai định dạng ! Chữ cái bắt đầu phải viết hoa!");

        System.out.println("Nhập diện tích sử dụng: ");
        double usableArea = Double.parseDouble(RegexData.regexStr(scanner.nextLine(),Regex.regexArea(),
                "Nhập sai định dạng ! Vui lòng nhập lại !"));

        System.out.println("Nhập chi phí thuê: ");
        String rentalCosts = RegexData.regexStr(scanner.nextLine(),Regex.regexPrice(),
                "Nhập sai định dạng! Vui lòng nhập lại 1");

        System.out.println("Nhập số lượng người tối đa: ");
        int maximumPeople = Integer.parseInt(RegexData.regexStr(scanner.nextLine(),Regex.regexPerson(),
                "Nhập sai định dạng vui lòng nhập lại ! Tối đa 20 người!"));

        System.out.println("Nhập kiểu thuê: ");
        String rentalType = RegexData.regexStr(scanner.nextLine(),Regex.regexName(),
                "Nhập sai định dạng !Vui lòng nhập lại !");

        System.out.println("Nhập tiêu chuẩn phòng: ");
        String standarHouse = RegexData.regexStr(scanner.nextLine(),Regex.regexName(),
                "Nhập sai định dạng ! Vui lòng nhập lại !");

        System.out.println("Nhập số tầng: ");
        int numberFloors = Integer.parseInt(RegexData.regexStr(scanner.nextLine(),Regex.regexCostAndFloor(),
                "Nhập sai định dạng ! Phải là số nguyên dương !"));

        House house = new House(id, serviceName, usableArea, rentalCosts, maximumPeople, rentalType, standarHouse, numberFloors);
        facilityIntegerMap.put(house, 0);
        System.out.println("Đã thêm mới thành công !");
    }

    @Override
    public void addNewRoom() {
        System.out.println("Nhâp id: ");
        String id = RegexData.regexStr(scanner.nextLine(),Regex.regexIdRoom(),
                "Nhập sai định dạng ! Định dạng có mã là SVHO-XXXX"); // id

        System.out.println("Nhập tên dịch vụ: ");
        String serviceName = RegexData.regexStr(scanner.nextLine(),Regex.regexName(),
                "Nhập sai định dạng ! Chữ cái bắt đầu phải viết hoa!");

        System.out.println("Nhập diện tích sử dụng: ");
        double usableArea = Double.parseDouble(RegexData.regexStr(scanner.nextLine(),Regex.regexArea(),
                "Nhập sai định dạng ! Vui lòng nhập lại !"));

        System.out.println("Nhập chi phí thuê: ");
        String rentalCosts = RegexData.regexStr(scanner.nextLine(),Regex.regexPrice(),
                "Nhập sai định dạng! Vui lòng nhập lại 1");

        System.out.println("Nhập số lượng người tối đa: ");
        int maximumPeople = Integer.parseInt(RegexData.regexStr(scanner.nextLine(),Regex.regexPerson(),
                "Nhập sai định dạng vui lòng nhập lại ! Tối đa 20 người"));

        System.out.println("Nhập kiểu thuê: ");
        String rentalType = RegexData.regexStr(scanner.nextLine(),Regex.regexName(),
                "Nhập sai định dạng !Vui lòng nhập lại !");

        System.out.println("Dịch vụ miễn phí đi kèm: ");
        String freeServices = RegexData.regexStr(scanner.nextLine(), Regex.regexName(),
                "Nhập sai định dạng !");

        Room room = new Room(id, serviceName, usableArea, rentalCosts, maximumPeople, rentalType, freeServices);
        facilityIntegerMap.put(room, 0);
        System.out.println("Đã thêm mới thành công !");
    }

    @Override
    public void displayMantain() {
        Set<Facility> item = facilityIntegerMap.keySet();
        for (Facility temp : item) {
            if (facilityIntegerMap.get(temp)>=5){
                System.out.println(temp);
            }
        }
    }

}
