package module11.homework;



import java.io.FileNotFoundException;

public class Task11_2 {

    public static void main(String[]args) throws FileNotFoundException{
        ReadFile readFile = new ReadFile();

        StringBuilder res =  readFile.ReadFromFile();
    }

}
