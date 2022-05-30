package _case_study_furama_resort.services.impl;
import _case_study_furama_resort.models.facility_class.Facility;
import _case_study_furama_resort.models.facility_class.House;
import _case_study_furama_resort.models.facility_class.Room;
import _case_study_furama_resort.models.facility_class.Villa;
import _case_study_furama_resort.services.ServiceFacility;

import java.util.*;

public class FacilityServiceImpl implements ServiceFacility {
    public static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static Scanner scanner = new Scanner(System.in);

    // Bước 1: tạo data ở khối static
    static {
        // Tạo data ở đây
        facilityIntegerMap.put(new Villa(1, "vip", 2, 3, 20, "vip", "vip", 3, 5), 0);
        facilityIntegerMap.put(new Villa(2, "vip", 3, 2, 19, "vip", "vip", 2, 4), 1);
        facilityIntegerMap.put(new Villa(3, "vip", 4, 1, 18, "vip", "vip", 5, 3), 2);
        facilityIntegerMap.put(new Villa(4, "vip", 5, 5, 17, "vip", "vip", 6, 2), 3);
        facilityIntegerMap.put(new House(1, "vip", 3, 4, 10, "vip", "vip", 4), 1);
        facilityIntegerMap.put(new House(2, "vip", 6, 3, 11, "vip", "vip", 3), 2);
        facilityIntegerMap.put(new House(3, "vip", 7, 2, 12, "vip", "vip", 2), 3);
        facilityIntegerMap.put(new Room(1, "vip", 1, 3, 5, "vip", "vip"), 1);
        facilityIntegerMap.put(new Room(2, "vip", 2, 2, 6, "vip", "vip"), 2);
        facilityIntegerMap.put(new Room(3, "vip", 3, 1, 7, "vip", "vip"), 3);
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
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên dịch vụ: ");
        String serviceName = scanner.nextLine();

        System.out.println("Nhập diện tích sử dụng: ");
        int usableArea = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập chi phí thuê: ");
        int rentalCosts = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập số lượng người tối đa: ");
        int maximumPeople = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập kiểu thuê: ");
        String rentalType = scanner.nextLine();

        System.out.println("Nhập tiêu chuẩn phòng: ");
        String standarRoom = scanner.nextLine();

        System.out.println("Nhập diện tích hồ bơi: ");
        int poolArea = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập số tầng: ");
        int numberFloor = Integer.parseInt(scanner.nextLine());

        Villa villa = new Villa(id, serviceName, usableArea, rentalCosts, maximumPeople, rentalType, standarRoom, poolArea, numberFloor);
        facilityIntegerMap.put(villa, 0);
        System.out.println("Đã thêm mới thành công !");
    }

    @Override
    public void addNewHouse() {
        System.out.println("Nhâp id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên dịch vụ: ");
        String serviceName = scanner.nextLine();

        System.out.println("Nhập diện tích sử dụng: ");
        int usableArea = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập chi phí thuê: ");
        int rentalCosts = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập số lượng người tối đa: ");
        int maximumPeople = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập kiểu thuê: ");
        String rentalType = scanner.nextLine();

        System.out.println("Nhập tiêu chuânt phòng: ");
        String standarHouse = scanner.nextLine();

        System.out.println("Nhập số tầng: ");
        int numberFloors = Integer.parseInt(scanner.nextLine());

        House house = new House(id, serviceName, usableArea, rentalCosts, maximumPeople, rentalType, standarHouse, numberFloors);
        facilityIntegerMap.put(house, 0);
        System.out.println("Đã thêm mới thành công !");
    }

    @Override
    public void addNewRoom() {
        System.out.println("Nhâp id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên dịch vụ: ");
        String serviceName = scanner.nextLine();

        System.out.println("Nhập diện tích sử dụng: ");
        int usableArea = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập chi phí thuê: ");
        int rentalCosts = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập số lượng người tối đa: ");
        int maximumPeople = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập kiểu thuê: ");
        String rentalType = scanner.nextLine();

        System.out.println("Dịch vụ miễn phí đi kèm: ");
        String freeServices = scanner.nextLine();

        Room room = new Room(id, serviceName, usableArea, rentalCosts, maximumPeople, rentalType, freeServices);
        facilityIntegerMap.put(room, 0);
        System.out.println("Đã thêm mới thành công !");
    }

    @Override
    public void displayMantain() {

    }

}
