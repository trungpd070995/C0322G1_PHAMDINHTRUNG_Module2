package _11_stack_queue.exercise.demerging;

import java.util.*;

public class DemergingTest {
    public static void main(String[] args) {
        Queue<Employee> male = new LinkedList<>();
        Queue<Employee> female = new LinkedList<>();

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Nhung", false, 18);
        employees[1] = new Employee("Huyen", false, 25);
        employees[2] = new Employee("Khanh", true, 25);
        employees[3] = new Employee("Thanh", false, 20);
        employees[4] = new Employee("Kien", true, 20);

        System.out.println("Danh sách nhân sự sau khi sắp xếp lại là: ");
        for (Employee item: employees) {
            System.out.println(item.toString());
        }
        Arrays.sort(employees);

        for (Employee item : employees) {
            if (item.isGender()){
                male.add(item);
            } else {
                female.add(item);
            }
        }

        List<Employee> orderedList = new ArrayList<>();
        while (female.size() > 0){
            orderedList.add(female.remove());
        }
        while (male.size() > 0){
            orderedList.add(male.remove());
        }
        System.out.println("------------");
        System.out.println("Danh sách nhân sự sau khi sắp xếp lại là: ");
        for (Employee item: orderedList) {
            System.out.println(item.toString());
        }
    }
}
