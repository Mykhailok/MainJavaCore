package module11.homework;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Task11_3   {
    public static void main(String[] args) throws FileNotFoundException {
        String findWord = "three";
        String replaceWord = "REPLACEWORD";

        ReadFile readFile = new ReadFile();

        StringBuilder res = readFile.ReadFromFile();

        String s = res.toString().replaceAll(findWord, replaceWord);

        System.out.println("После замены получили: \n" + s);

        try {
           FileWriter fileWriter = new FileWriter("d:/homework11.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(s);
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("Write failed");
        }
    }




}
