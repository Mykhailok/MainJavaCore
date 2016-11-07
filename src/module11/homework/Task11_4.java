package module11.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task11_4 {

    public static int checkWord(String word){
        int checkWord = 0;
        String line;
        String path = "d:/homework11.txt";
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            while ((line = bufferedReader.readLine()) != null){
                if (line.equals(word)){
                    checkWord++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return checkWord;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Искомое слово в тексте встречается "+checkWord("two")+" раз(а)");
    }

}
/*String findWord = "four";
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
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/