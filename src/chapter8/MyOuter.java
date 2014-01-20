package chapter8;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/19/14
 * Time: 10:15 PM
 * To change this template use File | Settings | File Templates.
 */
class MyOuter {
    private int x = 7;

    public void makeInner() {
        MyInner in = new MyInner();  // make an inner instance
        in.seeOuter();
    }

    public static void main(String[] args) {
        //From inside the outer class instance code, use the inner class name in the normal way:
        MyOuter mo = new MyOuter(); // gotta get an instance! MyOuter.MyInner inner = mo.new MyInner(); inner.seeOuter();
        mo.makeInner();
        //or
        //from outside the outer class instance code
        MyOuter.MyInner inner = new MyOuter().new MyInner();
        inner.seeOuter();
    }

    class MyInner {
        public void seeOuter() {
            System.out.println("Outer x is " + x);
            System.out.println("Inner class ref is " + this);
            System.out.println("Outer class ref is " + MyOuter.this);
        }
    }
}

class MyOuter2 {
    private String x = "Outer2";

    void doStuff() {
        class MyInner {
            public void seeOuter() {
                System.out.println("Outer x is " + x);
            } // close inner class method

        } // close inner class definition
        MyInner m = new MyInner();
        m.seeOuter();
    } // close outer class method doStuff()
} // close outer class


/*Think about it. The local variables of the method live on the stack,
 and exist only for the lifetime of the method. You already know that
 the scope of a local variable is limited to the method the variable is declared in.
  When the method ends, the stack frame is blown away and the variable is history.
  But even after the method completes, the inner class object created within it might
  still be alive on the heap if, for example, a reference to it was passed into some other
   code and then stored in an instance variable. Because the local variables aren't guaranteed to be alive as long
as the method-local inner class object, the inner class object can't use them. Unless the
 local variables are marked final! The following code attempts to access a local variable from within a method-local inner class.
*/
class MyOuter3 {
    private String x = "Outer2";

    void doStuff() {//if declared static, then could not have access to object specific variables like x
        final String z = "local variable";    //z moze nie istniec podczas gdy class MyInner moze zostac przekazana do innej metody
        //i bedzie dalej istniec. W momencie gdyby odwolala sie do z, z nie istnieje gdyz wraz z zakonczeniem wykonaywania sie metody
        //doStuff przestalo istniec, dla tego z musi byc final
        class MyInner { //could be only final or abstract

            public void seeOuter() {
                System.out.println("Outer x is " + x);
                System.out.println("Localvariablezis" + z); //Won'tCompile!
            } // close inner class method
        }// close inner class definition
    }// close outer class method doStuff()
}// close outer class

