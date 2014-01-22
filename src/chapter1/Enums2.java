package chapter1;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/21/14
 * Time: 8:43 PM
 * To change this template use File | Settings | File Templates.
 */

enum CoffeeSize2 {
    BIG(8),
    HUGE(10),
    OVERWHELMING(16) {    // start a code block that defines
        // the "body" for this constant
        @Override
        public String getLidCode() {   // override the method
            System.out.println("get Lid code for : " + this.getOunces() + " " + this);
            // defined in CoffeeSize
            return "A"; }
    };
    // the semicolon is REQUIRED when more code follows
    CoffeeSize2(int ounces) {
        this.ounces = ounces;
    }
    private int ounces;
    public int getOunces() {
        return ounces;
    }
    public String getLidCode() {  // this method is overridden
        System.out.println("get Lid code for : " + this.getOunces() + " " + this);
        // by the OVERWHELMING constant
        return "B";   // the default value we want to return for
        // CoffeeSize constants
    }
    /*@Override
    public String toString(){
        return getOunces() + " to string " ;
    } */
}



public class Enums2 {
    public static void main(String[] args) {
        System.out.println(CoffeeSize2.BIG.getLidCode());
        System.out.println(CoffeeSize2.OVERWHELMING.getLidCode());
    }
}





