package _16_io_text_file.exercise.copy_file;

import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();

        List<String> strings = copyFileText.readFile("src\\_16_io_text_file\\exercise\\copy_file\\fileA.txt");

        for (String item : strings) {
            copyFileText.WriteFile("src\\_16_io_text_file\\exercise\\copy_file\\fileB.txt", item);
        }
    }
}
