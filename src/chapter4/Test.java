package chapter4;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/13/14
 * Time: 9:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args)  {
        /* endless loop
        int sw = 0;
        switch (sw){
        case(0): {  for(int x = 10; x > 5; x++)
            if(x > 10000000) x = 10;
            break; }
        }              */


        try { new Test().go(); }
        catch (Error e) { System.out.println("ouch"); }
        int j = 6;
        assert(++j > 8): "hi";


        String x = "test";
        x.length();//method

        String[] x2 = {"test"};
        System.out.println(x2.length);//property
        System.out.println(x.substring(1,3));//include-exclude
        String e = "big surprise";
        System.out.println( e.toString() );
        //StringBuilder is not thread safe, is quicker

        StringBuilder sb = new StringBuilder("abc");
        sb.append("def").reverse().insert(3, "---"); //insert after 3
        System.out.println( sb );


    }
    public void go() {
        go();
    }


}




class EnumEqual {
    //enum comparison works same for equals and ==
    enum Color {RED, BLUE}                   // ; is optional
    public static void main(String[] args) {
        Color c1 = Color.RED;  Color c2 = Color.RED;
        if(c1 == c2) { System.out.println("=="); }
        if(c1.equals(c2)) { System.out.println("dot equals"); }
    }
}

class MyException extends Exception { }
 class Tire {
   void doStuff() {  }
}
 class Retread extends Tire {
public static void main(String[] args) {

        new Retread().doStuff();
}
     void doStuff() throws ArithmeticException { //overriden method could throw RuntimeEx(or child) could not throw caught exception
System.out.println(7/0);
}
}



