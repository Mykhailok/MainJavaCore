package module11.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task11_4_resources {
    public static void main(String[] args) throws IOException {

        String findWord = "four";
        int checkWord = 0;
        String line;

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("d:/homework11.txt"))){
            while ((line = bufferedReader.readLine()) != null){
                if (line.equals(findWord)){
                    checkWord++;
                }
            }
            System.out.println("Искомое слово в тексте встречается "+checkWord+" раз(а)");
        }
    }
}
