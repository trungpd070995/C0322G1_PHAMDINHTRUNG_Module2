package _case_study_furama_resort.services.impl;

import _case_study_furama_resort.models.facility_class.Facility;
import _case_study_furama_resort.models.facility_class.House;
import _case_study_furama_resort.models.facility_class.Room;
import _case_study_furama_resort.models.facility_class.Villa;
import _case_study_furama_resort.services.ServiceFacility;

import java.util.*;

public class FacilityServiceImpl implements ServiceFacility {
    static Scanner scanner = new Scanner(System.in);

    public static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    public static  List<Villa> villaList = new ArrayList<>();
    public static  List<House> houseList = new ArrayList<>();
    public static  List<Room> roomList = new ArrayList<>();

    @Override
    public void display() {

        Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
        List<String[]> listVilla = new ArrayList<>();

        if (!listVilla.isEmpty()){
            for (String[] temp : listVilla) {
            Villa villa = new Villa(
                    temp[0],Integer.parseInt(temp[1]),Integer.parseInt(temp[2]),Integer.parseInt(temp[3]),temp[4],
                    temp[5],Integer.parseInt(temp[6]),Integer.parseInt(temp[7]));
            facilityIntegerMap.put(villa,0);
            }
        }

        List<String[]> listHouse = new ArrayList<>();

        if (!listHouse.isEmpty()){
            for (String[] temp : listHouse) {
                House house = new House(
                        temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]),Integer.parseInt(temp[3]),
                        temp[4], temp[5],Integer.parseInt(temp[6]));
            }
        }
    }

    @Override
    public void addNew() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {

    }
}
