package module11.homework;

/*You should create method which replace words in the File and returns String with replaced values
        a) read file, save to string var
        b) replace words
        c) return new string
        String replacer(Map<String, String> map)*/


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task11_1 {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("two", "replaceWord");
        map.put("three", "ANOTHERWORD");
        System.out.println("Готовый файл выглядит следующим образом: \n"+replacer(map));
    }

    public static String replacer(Map <String, String> map) throws IOException {

        ReadFile readFile = new ReadFile();
        StringBuilder res = readFile.ReadFromFile();
        String s = res.toString();
        for (Map.Entry<String,String> entry : map.entrySet()){
            s = s.replaceAll(entry.getKey(),entry.getValue());
        }
        return s;
    }
}

/*String findWord = "two";
String replaceWord = "replaceWord";

ReadFile readFile = new ReadFile();

StringBuilder res = readFile.ReadFromFile();
String s = res.toString().replaceAll(findWord, replaceWord);
System.out.println("После замены получили: \n"+s);*/
