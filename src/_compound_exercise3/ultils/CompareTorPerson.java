package _compound_exercise3.ultils;

import _compound_exercise3.models.Person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class CompareTorPerson implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1 = LocalDate.parse(o1.getNgaySinh(),dateTimeFormatter);
        LocalDate date2 = LocalDate.parse(o2.getNgaySinh(),dateTimeFormatter);
        if (o1.getHoVaTen().compareTo(o2.getHoVaTen())>0){
            return 1;
        }else if (o1.getHoVaTen().compareTo(o2.getHoVaTen())<0){
            return -1;
        }else {
            o1.getHoVaTen().compareTo(o2.getHoVaTen());
        }
        return 0;
    }
}
