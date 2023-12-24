package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WritingInFile {
    public static void main(String[] args)  throws FileNotFoundException, IOException {
        try{
            FileWriter wr=new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\Poject1\\src\\FileHandling\\create.txt");
            wr.write("I love java Programming");
            wr.close();
            System.out.println("Successfully Wrote");
        }
        catch (IOException e){
            System.out.println("The error Occurred");
        }
    }
}
