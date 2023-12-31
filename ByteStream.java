package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) throws IOException {
        FileInputStream in=null;
        FileOutputStream out=null;
        try{
            in=new FileInputStream("C:\\Users\\Lenovo\\IdeaProjects\\Poject1\\src\\FileHandling\\input.txt");
            out=new FileOutputStream("C:\\Users\\Lenovo\\IdeaProjects\\Poject1\\src\\FileHandling\\output.txt");
            int c;
            while((c=in.read())!=-1){
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            if(in!=null) in.close();
            if(out!=null) out.close();

        }
    }
}
