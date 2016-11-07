package module11.homework;



import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task11_2 {

    public static File fileContentReplacer(Map<String, String> map) throws IOException {
        String path = "d:/output.txt";
        ReadFile readFile = new ReadFile();
        StringBuilder stringBuilder = readFile.ReadFromFile();
        String s = stringBuilder.toString();
        for (Map.Entry<String,String> entry : map.entrySet()){
            s = s.replaceAll(entry.getKey(),entry.getValue());
        }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            bufferedWriter.write(s);
            bufferedWriter.close();
        return new File(path);
    }

    public static void main(String[]args) throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("two", "replaceWord");
        map.put("three", "ANOTHERWORD");
        System.out.println("Готовый файл выглядит следующим образом: \n"+fileContentReplacer(map));
    }

}




/*
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
            }*/