package FileHandling;

import java.io.File;
import java.io.IOException;

public class createFile {
    public  static void main(String[] args){
        try{
            File obj=new File("C:\\Users\\Lenovo\\IdeaProjects\\Poject1\\src\\FileHandling\\create.txt");
            if(obj.createNewFile()){
                System.out.println(obj.getName());
            }
            else{
                System.out.println("File already exist");
            }

        }
        catch(IOException e) {
            System.out.println("Object error");
        }
        }
    }

