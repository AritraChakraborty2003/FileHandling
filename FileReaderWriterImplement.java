package FileHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterImplement {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader in=null;
        FileWriter out=null;
        try{
            in=new FileReader("C:\\Users\\Lenovo\\IdeaProjects\\Poject1\\src\\FileHandling\\input.txt");
            out= new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\Poject1\\src\\FileHandling\\output.txt");
            int c;
            while((c=in.read())!=-1){
                out.write(c);
            }
        }
        finally {
            if(in!=null) in.close();
            if(out!=null) out.close();
        }
    }
}
