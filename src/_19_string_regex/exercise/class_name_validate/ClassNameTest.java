package _19_string_regex.exercise.class_name_validate;

public class ClassNameTest {

    public static final String[] validClassName = new String[]{"C1234M", "C0222G", "P9540G", "A0324H", "C8952I"};
    public static final String[] invalidClassName = new String[]{"B9654A", "M9876C", "K8976L", "S5641P"};

    public static void main(String[] args) {
        ClassName className = new ClassName();
        for (String className1 : validClassName) {
            boolean isvalid = className.validate(className1);
            System.out.println("Class name is " + className1 + " is valid: " + isvalid);
        }
        for (String className1 : invalidClassName) {
            boolean isvalid = className.validate(className1);
            System.out.println("Class name is " + className1 + " is valid: " + isvalid);
        }
    }
}
