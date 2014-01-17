package chapter4;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/17/14
 * Time: 6:58 PM
 * To change this template use File | Settings | File Templates.
 */
import java.io.*;
 public class ReadingFor {

    public static void main(String[] args) {
        String s;
        try {
            FileReader fr = new FileReader("myfile.txt");//could add as arg file
            BufferedReader br = new BufferedReader(fr);
            while((s = br.readLine()) != null)
                System.out.println(s);
            //br.flush();buffer reader do not have flush method
            }catch (IOException e) { System.out.println("io error"); }
        }
     }




