package _case_study_resort_furama.services.implement;

import _case_study_resort_furama.exception.AreaException;
import _case_study_resort_furama.exception.FloorException;
import _case_study_resort_furama.exception.RentCostException;
import _case_study_resort_furama.exception.UsableAreaException;
import _case_study_resort_furama.models.facility.Facility;
import _case_study_resort_furama.models.facility.House;
import _case_study_resort_furama.models.facility.Room;
import _case_study_resort_furama.models.facility.Villa;
import _case_study_resort_furama.services.service.FacilityService;
import _case_study_resort_furama.ultils.Regex;
import _case_study_resort_furama.ultils.RegexData;
import _case_study_resort_furama.ultils.WriteAndReadFile;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> integerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    private static List<String[]> list;
    private static final String FILE_FACILITY = "src\\_case_study_resort_furama\\data\\facility.csv";


    @Override
    public void display() {
        Map<Facility, Integer> integerMap;
        integerMap =  returnMap();

        for (Map.Entry<Facility, Integer> item : integerMap.entrySet()) {
            System.out.println("Service " + item.getKey() + "số lần đã thuê " + item.getValue());
        }
        list.clear();
        integerMap.clear();
    }

    private  Map<Facility, Integer>  returnMap() {
        Map<Facility, Integer> integerMap = new LinkedHashMap<>();
        list = WriteAndReadFile.readFile(FILE_FACILITY);
        Facility facility;
        for (String[] item : list) {
            if (item[0].contains("SVVL")) {
                facility = new Villa(item[0], item[1], Double.parseDouble(item[2]), Double.parseDouble(item[3]), item[4],
                        item[5], item[6], Double.parseDouble(item[7]), Integer.parseInt(item[8]));
                integerMap.put(facility, 0);
            } else if (item[0].contains("SVHO")) {
                facility = new House(item[0], item[1], Double.parseDouble(item[2]), Double.parseDouble(item[3]), item[4],
                        item[5], item[6], Integer.parseInt(item[7]));
                integerMap.put(facility, 0);
            } else if (item[0].contains("SVRO")) {
                facility = new Room(item[0], item[1], Double.parseDouble(item[2]), Double.parseDouble(item[3]), item[4],
                        item[5], item[6]);
                integerMap.put(facility, 0);
            }
        }
        return integerMap;
    }


    @Override
    public void addNewVilla() {
        Map<Facility, Integer> integerMap ;
        integerMap =  returnMap();

        String id;
        boolean check = true;
        do{
             id = inputIdVilla();
            for (Map.Entry<Facility, Integer> item : integerMap.entrySet()) {
                if (item.getKey().getId().equals(id)) {
                    System.err.println("Id đã có trong danh sách ! Mời bạn nhập lại !");
                }else {
                    check=false;
                }
            }
        }while (check);

            String name = inputName();
            System.out.println("Nhập diện tích sử dụng :");
            double usableArea;
            do {
                try {
                    usableArea = Double.parseDouble(scanner.nextLine());
                    if (usableArea > 30) {
                        break;
                    } else {
                        try {
                            throw new UsableAreaException("Diện tích phải lớn hơn 30m2");
                        } catch (UsableAreaException e) {
                            System.err.println(e.getMessage());
                        }
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Bạn đã sai định dạng ! mời nhập lại !");
                }
            } while (true);

            System.out.println("Nhập chi phí cho thuê :");
            double rentCost;
            do {
                try {
                    rentCost = Double.parseDouble(scanner.nextLine());
                    if (rentCost > 0) {
                        break;
                    } else {
                        try {
                            throw new RentCostException("Không được là số nguyên âm");
                        }catch (RentCostException e){
                            System.err.println(e.getMessage());
                        }
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Bạn nhập định dạng đã sai");
                }
            } while (true);

            String amount = inputAmount();
            String rentType = inputRentalType();
            String room = inputTypeRoom();
            System.out.println("Nhập diện tích hồ bơi :");
            double area;
            do {
                try {
                    area = Double.parseDouble(scanner.nextLine());
                    if (area > 30) {
                        break;
                    } else {
                        try {
                            throw new AreaException("Diện tích phải lớn hơn 30");
                        }catch (AreaException e){
                            System.err.println(e.getMessage());
                        }
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Bạn đã nhập định dạng sai");
                }
            } while (true);
            System.out.println("Nhập số tầng :");
            int floor;
            do {
                try {
                    floor = Integer.parseInt(scanner.nextLine());
                    if (floor >= 0) {
                        break;
                    } else {
                        try {
                            throw new FloorException("Không nhập số nguyên âm");
                        }catch (FloorException e) {
                            System.err.println(e.getMessage());
                        }
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Bạn đã nhập định dạng sai");
                }
            } while (true);

            Villa villa = new Villa(id, name, usableArea, rentCost, amount, rentType, room, area, floor);
            integerMap.put(villa, 0);
            System.out.println("Đã thêm mới villa thành công");
            String line = id + "," + name + "," + usableArea + "," + rentCost + "," + amount +
                    "," + rentType + "," + room + "," + area + "," + floor;
            WriteAndReadFile.writeFile(FILE_FACILITY, line);
        }

    private String inputIdVilla() {
        System.out.println("Nhập id , mã dịch vụ :");
        return RegexData.regexVilla(Regex.REGEX_ID_VILLA);
    }

    private String inputName() {
        System.out.println("Nhập tên dịch vụ :");
        return RegexData.regexString(Regex.REGEX_NAME);
    }

    private String inputAmount() {
        System.out.println("Nhập số lượng người tối đa :");
        return RegexData.regexAmount(Regex.REGEX_AMOUNT);
    }


    private String inputRentalType() {
        System.out.println("Nhập kiểu mà bạn muốn thuê :");
        return RegexData.regexString(Regex.REGEX_RENTALTYPE);
    }

    private String inputTypeRoom() {
        System.out.println("Nhập loại phòng mà bạn muốn thuê :");
        return RegexData.regexString(Regex.REGEX_TYPEROOM);
    }

    @Override
    public void addNewHouse() {
        String id = inputIdHouse();
        boolean check = true;
        for (Map.Entry<Facility, Integer> item : integerMap.entrySet()) {
            if (item.getKey().getId().equals(id)) {
                check = false;
            }
        }
        if (!check) {
            System.out.println("id này đã tồn tại");
        } else {
            String name = inputName();
            System.out.println("Nhập diện tích sử dụng :");
            double usableArea;
            do {
                try {
                    usableArea = Double.parseDouble(scanner.nextLine());
                    if (usableArea > 30) {
                        break;
                    } else {
                        System.out.println("Không được nhập dưới 30");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Nhập định dạng sai");
                }
            } while (true);

            System.out.println("Nhập chi phí cho thuê :");
            double rentCost;
            do {
                try {
                    rentCost = Double.parseDouble(scanner.nextLine());
                    if (rentCost > 0) {
                        break;
                    } else {
                        System.out.println("Không được là số âm");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Bạn đã nhập dịnh dạng sai");
                }

            } while (true);

            String amount = inputAmount();
            String rentType = inputRentalType();
            String room = inputTypeRoom();
            System.out.println("Nhập số tầng :");
            int floor;
            do {
                try {
                    floor = Integer.parseInt(scanner.nextLine());
                    if (floor >= 0) {
                        break;
                    } else {
                        System.out.println("Không được nhập là số âm");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Bạn đã nhập định dạng sai");
                }
            } while (true);
            House house = new House(id, name, usableArea, rentCost, amount, rentType, room, floor);
            integerMap.put(house, 0);
            System.out.println("Đã thêm mới house thành công");
            String line = id + "," + name + "," + usableArea + "," + rentCost + "," + amount + ","
                    + rentType + "," + room + "," + floor;
            WriteAndReadFile.writeFile(FILE_FACILITY, line);
        }


    }

    private String inputIdHouse() {
        System.out.println("Nhập id , mã dịch vụ :");
        return RegexData.regexHouse(Regex.REGEX_ID_HOUSE);
    }

    private String inputIdRoom() {
        System.out.println("Nhập id , mã dịch vụ :");
        return RegexData.regexRoom(Regex.REGEX_ID_ROOM);
    }

    private String inputFree() {
        System.out.println("Nhập dịch vụ miễn phí :");
        return RegexData.regexString(Regex.REGEX_FREE);
    }

    @Override
    public void addNewRoom() {
        String id = inputIdRoom();
        boolean check = true;
        for (Map.Entry<Facility, Integer> item : integerMap.entrySet()) {
            if (item.getKey().getId().equals(id)) {
                check = false;
            }
        }
        if (!check) {
            System.err.println("id này đã tồn tại");
        } else {
            String name = inputName();
            System.out.println("Nhập diện tích sử dụng :");
            double usableArea = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập chi phí cho thuê :");
            double rentCost = Double.parseDouble(scanner.nextLine());
            String amount = inputAmount();
            String rentType = inputRentalType();
            String freeService = inputFree();
            Room room = new Room(id, name, usableArea, rentCost, amount, rentType, freeService);
            integerMap.put(room, 0);
            System.out.println("Đã thêm thành công");
            String line = id + "," + name + "," + usableArea + "," + rentCost + "," + amount + "," + rentType + "," + freeService;
            WriteAndReadFile.writeFile(FILE_FACILITY, line);
        }
    }

    @Override
    public void displayMaintain() {

    }


}