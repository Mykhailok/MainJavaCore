package module11.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static String path = "d:/homework11.txt";

    public StringBuilder ReadFromFile() throws FileNotFoundException {
        StringBuilder result = null;
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        System.out.println("Читаем содержимое файла:");
        try {
            while((line = bufferedReader.readLine())!= null){
                result = stringBuilder.append(line);
                result.append(System.lineSeparator());
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Oups!!! Something went wrong");
        }
        System.out.println("В результате получили строку: \n"+result);

        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}