package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadingInFile {
    public  static void main(String[] args) throws IOException, FileNotFoundException {
        try {
            File obj = new File("C:\\Users\\Lenovo\\IdeaProjects\\Poject1\\src\\FileHandling\\create.txt");
            Scanner reader = new Scanner(obj);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        }catch (Exception e){
            System.out.println("An Error Occurred");
        }
    }
}
