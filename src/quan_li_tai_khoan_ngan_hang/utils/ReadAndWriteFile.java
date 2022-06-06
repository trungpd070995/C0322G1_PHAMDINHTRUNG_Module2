package quan_li_tai_khoan_ngan_hang.utils;
import quan_li_tai_khoan_ngan_hang.models.bank.IOStringAccountBank;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {
     private static Scanner scanner = new Scanner(System.in);
    public static List<String[]> readFile(String filePath)  {
        List<String[]> list = new ArrayList<>();
        File file = new File(filePath);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try(FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);)
        {
            String line = "";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")){
                String[] arrStr = line.split(",");
                list.add(arrStr);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  list;

    }
//

    public static <O> void writeFileList(String filePath , List<O> o)  {
        File file = new File(filePath);

        try(FileWriter   fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);)
        {
            for ( O line : o) {
                bufferedWriter.write(((IOStringAccountBank) line).toAccountBank());
                bufferedWriter.newLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
