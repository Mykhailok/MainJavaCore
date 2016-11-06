package module11.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task11_4 {
    public static void main(String[] args) throws FileNotFoundException {

        String findWord = "four";
        int checkWord = 0;

        BufferedReader bufferedReader = new BufferedReader(new FileReader("d:/homework11.txt"));
        String line;
        try {
            while ((line = bufferedReader.readLine()) != null){
                if (line.equals(findWord)){
                checkWord++;
                }
            }
            System.out.println("Искомое слово в тексте встречается "+checkWord+" раз(а)");
        } catch (IOException e) {
            System.out.println("Oups!!! Something went wrong");
        }
    }

}
