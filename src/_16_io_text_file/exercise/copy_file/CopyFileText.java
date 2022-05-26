package _16_io_text_file.exercise.copy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public void WriteFile(String pathFile, String line) {
        try {
            FileWriter fileWriter = new FileWriter(pathFile, true);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(line);
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> readFile(String pathFile){
        List<String> listLine = new ArrayList<>();
    try {
        FileReader fileReader = new FileReader(pathFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line ;

        while ((line = bufferedReader.readLine()) != null) {
            listLine.add(line);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return listLine;
    }
}
