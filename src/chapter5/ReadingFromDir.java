package chapter5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/15/14
 * Time: 2:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReadingFromDir {
    public static void main(String[] args) throws IOException {
        File existingDir = new File("existingDir");     // assign a dir
        existingDir.mkdir();
        System.out.println(existingDir.isDirectory());
        File existingDirFile = new File(
                existingDir, "existingDirFile.txt");  // assign a file
        System.out.println (existingDirFile.isFile());
        FileReader fr = new FileReader(existingDirFile);
        BufferedReader br = new BufferedReader(fr);
        String s;
        while( (s = br.readLine()) != null)
            System.out.println(s);
        br.close();

    }
}
