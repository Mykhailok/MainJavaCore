package module11.homework;

/*You should create method which replace words in the File and returns String with replaced values
        a) read file, save to string var
        b) replace words
        c) return new string
        String replacer(Map<String, String> map)*/


import java.io.FileNotFoundException;

public class Task11_1 {

    public static void main(String[] args) throws FileNotFoundException {
        ReadFile readFile = new ReadFile();

        StringBuilder res =  readFile.ReadFromFile();

        String s = res.toString().replaceAll("two","six");

        System.out.println("После замены получили: "+s);

    }




}
