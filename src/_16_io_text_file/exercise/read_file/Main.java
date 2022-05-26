package _16_io_text_file.exercise.read_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "src\\_16_io_text_file\\exercise\\read_file\\countries.csv";
        List<String []> list = readLine(path);
        display(list);
    }

    public static List<String []> readLine(String path) {
        List<String []> listCountry = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null){
                String[] arr = line.split(",");
                listCountry.add(arr);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  listCountry;
    }

    private static void display(List<String []> countryList) {
        List<Country> list = new ArrayList<>();
        Country countries;
        for (String[] item : countryList) {
            countries = new Country(Integer.parseInt(item[0]),item[1], item[2]);
            list.add(countries);
        }
        for (Country item: list) {
            System.out.println(item.toString());
        }
    }
}
