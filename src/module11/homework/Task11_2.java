package module11.homework;



import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Task11_2 {

    public static void main(String[]args) throws FileNotFoundException{
        String findWord = "four";
        String replaceWord = "REPLACEWORD";

        ReadFile readFile = new ReadFile();

        StringBuilder res =  readFile.ReadFromFile();

            String s = res.toString().replaceAll(findWord, replaceWord);

            System.out.println("После замены получили: \n" + s);

            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("d:/output.txt"));
                bufferedWriter.write(s);
                bufferedWriter.close();
            } catch (IOException e) {
                System.err.println("Write failed");
            }

    }

}
