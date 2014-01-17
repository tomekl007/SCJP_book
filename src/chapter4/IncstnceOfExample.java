package chapter4;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/13/14
 * Time: 9:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class IncstnceOfExample {

    public static void main(String[] args) {
        int [] nums = new int[3];
        if (nums instanceof Object) {
            System.out.println("true");} // result is true
//        An array is always an instance of Object. Any array.



                float f1 = 2.3f;
                float[][] f2 = {{42.0f}, {1.7f, 2.3f}, {2.6f, 2.7f}};
                float[] f3 = {2.7f};
                Long x = 42L;
        if(f3 == f2[2]){        // insert code here
                System.out.println("true2");
        }
            //enchaced for loop


        int[] xArray = {7,6,5,4,3,2,1};
        // insert code here

            for(int y : xArray) {
                System.out.println(y);
            }



       }



}

class A { }
class B extends A {
    public static void main (String [] args) {
        A myA = new B();
        m2(myA);
        B myB = new B();
        m3(myB);

        //logic operators works only on boolean
        //5 && 6
        //exactly one operand must be true
        System.out.println("xor " + ((2<3) ^ (4>3)));
    }
    public static void m2(A a) {
        if (a instanceof B)
            ((B)a).doBstuff();     // downcasting an A reference
        // to a B reference
    }
    public static void m3(B b){
        if(b instanceof A){
            System.out.println("b isA a");
        }
    }
    public static void doBstuff() {
        System.out.println("'a' refers to a B");
    }




}