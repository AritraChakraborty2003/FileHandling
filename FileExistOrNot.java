package FileHandling;

import java.io.File;

public class FileExistOrNot {
    public static void main(String[] args){
        File obj=new File("C:\\Users\\Lenovo\\IdeaProjects\\Poject1\\src\\FileHandling\\create.txt");
        if(obj.exists()){
            System.out.println(obj.getName());
        }
        else{
            System.out.println("File doesn't exist");
        }
    }
}
