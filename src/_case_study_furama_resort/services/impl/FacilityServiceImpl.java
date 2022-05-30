package _case_study_furama_resort.services.impl;

import _case_study_furama_resort.models.facility_class.Facility;
import _case_study_furama_resort.models.facility_class.House;
import _case_study_furama_resort.models.facility_class.Room;
import _case_study_furama_resort.models.facility_class.Villa;
import _case_study_furama_resort.services.ServiceFacility;

import java.util.*;

public class FacilityServiceImpl implements ServiceFacility {
    static Scanner scanner = new Scanner(System.in);

    public static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    public static List<Villa> villaList = new ArrayList<>();
    public static List<House> houseList = new ArrayList<>();
    public static List<Room> roomList = new ArrayList<>();

    // Bước 1: tạo data ở khối static
    static {
        // Tạo data ở đây
        facilityIntegerMap.put(new Villa(1, "vip", 2, 3, 20, "vip", "vip", 3, 5), 0); // tạo cho được 10 dịch vụ
        facilityIntegerMap.put(new Villa(2, "vip", 3, 2, 19, "vip", "vip", 2, 4), 1); // tạo cho được 10 dịch vụ
        facilityIntegerMap.put(new Villa(3, "vip", 4, 1, 18, "vip", "vip", 5, 3), 2); // tạo cho được 10 dịch vụ
        facilityIntegerMap.put(new Villa(4, "vip", 5, 5, 17, "vip", "vip", 6, 2), 3); // tạo cho được 10 dịch vụ
        facilityIntegerMap.put(new House(1, "vip", 3, 4, 10, "vip", "vip", 4), 1); // tạo cho được 10 dịch vụ
        facilityIntegerMap.put(new House(2, "vip", 6, 3, 11, "vip", "vip", 3), 2); // tạo cho được 10 dịch vụ
        facilityIntegerMap.put(new House(3, "vip", 7, 2, 12, "vip", "vip", 2), 3); // tạo cho được 10 dịch vụ
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

//        Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
//
//        List<String[]> listVilla = new ArrayList<>();//isEmpty =true
//
//        if (!true){
//            for (String[] temp : listVilla) {
//            Villa villa = new Villa(
//                    temp[0],Integer.parseInt(temp[1]),Integer.parseInt(temp[2]),Integer.parseInt(temp[3]),temp[4],
//                    temp[5],Integer.parseInt(temp[6]),Integer.parseInt(temp[7]));
//            facilityIntegerMap.put(villa,0);
//            }
//        }
//
//        List<String[]> listHouse = new ArrayList<>();
//        if (!listHouse.isEmpty()){
//            for (String[] temp : listHouse) {
//                House house = new House(
//                        temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]),Integer.parseInt(temp[3]),
//                        temp[4], temp[5],Integer.parseInt(temp[6]));
//            }
//
//        }
//
//        List<String[]> listRoom = new ArrayList<>();
//        if (!listRoom.isEmpty()){
//            for (String[] temp : listRoom) {
//                Room room = new Room(
//                        temp[0],Integer.parseInt(temp[1]),Integer.parseInt(temp[2]),
//                        Integer.parseInt(temp[3]),temp[4],temp[5]);
//            }
//        }
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

        villaList.add(new Villa(id,serviceName,usableArea,rentalCosts,maximumPeople,rentalType, standarRoom, poolArea, numberFloor));
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

        houseList.add(new House(id, serviceName, usableArea, rentalCosts, maximumPeople, rentalType, standarHouse,numberFloors));
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

        roomList.add(new Room(id, serviceName,usableArea,rentalCosts,maximumPeople,rentalType,freeServices));
        System.out.println("Đã thêm mới thành công !");
    }

}
