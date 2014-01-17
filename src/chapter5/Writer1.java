package chapter5;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/15/14
 * Time: 1:46 PM
 * To change this template use File | Settings | File Templates.
 */

    import java.io.*;
    class Writer1 {
        public static void main(String [] args) throws IOException {
            try {                        // warning: exceptions possible
                boolean newFile = false;
                File file = new File
                        ("fileWrite1.txt");
// it's only an object
                System.out.println(file.exists());  // look for a real file
                newFile = file.createNewFile();     // maybe create a file!
                System.out.println(newFile);        // already there?
                System.out.println(file.exists());  // look again
            } catch(IOException e) { }

            File file =
                    new File("fileWrite2.txt");  // create a File object AND
            FileReader fr =
                    new FileReader(file);
            BufferedReader br =
                    new BufferedReader(fr);
            String data = br.readLine();
            System.out.println(data);
                // open "fileWrite2.txt"
                // create a FileReader to get
                // data from 'file'
                // create a BufferReader to
                // get its data from a Reader
                // read some data

            File file2 = new File("fileWrite2.txt");   // create a File
            PrintWriter pw = new PrintWriter(file2);   // pass file to
            pw.append("cos");
            // the PrintWriter
            // constructor

            File myDir = new File("mydir"); // create an object
            myDir.mkdir();                    // create an actual directory

            File myFile = new File(myDir, "myFile.txt");
            myFile.createNewFile();

            PrintWriter pw2 = new PrintWriter(myFile);
            pw2.println("new stuff");
            pw2.flush();
            pw2.close();
        }
    }

