package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class fileRead {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        try{
            ArrayList<String>  store=new ArrayList<>();
            File obj=new File("C:\\Users\\Lenovo\\IdeaProjects\\Poject1\\src\\FileHandling\\Critical.txt");
            Scanner sc=new Scanner(obj);
            while (sc.hasNextLine()){
                String data=sc.nextLine();
                store.add(data);
            }
            System.out.println(store);
        }
        catch (IOException e){
            System.out.println("Object Error");
        }
    }
}
