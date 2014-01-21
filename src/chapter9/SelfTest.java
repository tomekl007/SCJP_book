package chapter9;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/21/14
 * Time: 11:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class SelfTest {
}
class TwoThreads {
    static Thread laurel, hardy;
    public static void main(String[] args) {
        laurel = new Thread() {
            public void run() {
                System.out.println("A");
                try {
                    hardy.sleep(1000);
                } catch (Exception e) {
                    System.out.println("B");
                }
                System.out.println("C");
            }
        };
        hardy = new Thread() {
            public void run() {
                System.out.println("D");
                try {
                    laurel.wait();
                } catch (Exception e) {
                    System.out.println("E");
                }
                System.out.println("F");
            } };
        laurel.start();
        hardy.start();
    }
}

class Starter implements Runnable {
    void go(long id) {
    System.out.println(id);
       }

    public static void main(String[] args) throws InterruptedException {
        System.out.print(Thread.currentThread().getId() + " ");
        //new Starter().run();
        //new Thread(new Starter()).run();
        Thread t = new Thread(new Starter());
        t.start();
        t.join();
    }
    public void run() { go(Thread.currentThread().getId()); }
    }



class Dudes {
    static long flag = 0;
    void chat(long id) {
    if(flag == 0) flag = id;
    for(int x = 1; x < 3; x++) {
        if(flag == id) System.out.print("yo ");
        else System.out.print("dude ");
             }
      }
 }
class DudesChat implements Runnable {
static Dudes d;
    public static void main(String[] args) {
        new DudesChat().go();
    }

    void go() {
          d = new Dudes();
         new Thread(new DudesChat()).start();
        new Thread(new DudesChat()).start();
    }
    @Override
    public void run() {
        d.chat(Thread.currentThread().getId());
        }
}

class InSync extends Thread {
    StringBuffer letter;
    public InSync(StringBuffer letter) { this.letter = letter; }
    public void run() {
        synchronized(letter) {      // #1
            for(int i = 1;i<=100;++i) System.out.print(letter);
            System.out.println();
            char temp = letter.charAt(0);
            ++temp;         // Increment the letter in StringBuffer:
            letter.setCharAt(0, temp);
        }
// #2
    }
    public static void main(String [] args) {
        StringBuffer sb = new StringBuffer("A");
        new InSync(sb).start();
        new InSync(sb).start();
        new InSync(sb).start();
    } }
