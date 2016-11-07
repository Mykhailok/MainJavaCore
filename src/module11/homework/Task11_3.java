package module11.homework;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task11_3   {

    public static File fileContentMerger (Map<String, String> map) throws IOException {
        String path = "d:/homework11.txt";
        ReadFile readFile = new ReadFile();
        StringBuilder stringBuilder = readFile.ReadFromFile();
        String s = stringBuilder.toString();
        for (Map.Entry<String, String> entry : map.entrySet()){
            s = s.replaceAll(entry.getKey(),entry.getValue());
        }
        FileWriter fileWriter = new FileWriter(path, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.append(s);
        bufferedWriter.close();

        return new File(path);
    }


    public static void main(String[] args) throws IOException {

        Map<String, String> map = new HashMap<>();
        map.put("four", "fourWORDREPLACE");
        //map.put("five", "fiveWORDREPLACE");
        System.out.println("Готовый файл выглядит следующим образом: \n"+fileContentMerger(map));

    }

}

/*String findWord = "three";
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
        }*/