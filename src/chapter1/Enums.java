package chapter1;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/21/14
 * Time: 8:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class Enums {
}

enum CoffeeSize {
    // 8, 10 & 16 are passed to the constructor
    BIG(8), HUGE(10), OVERWHELMING(16);
    CoffeeSize(int ounces) { // constructor
        System.out.println("consturcotr : " + ounces);
        this.ounces = ounces;
    }
    private int ounces;      // an instance variable
    public int getOunces() {
        return ounces;
    } }
class Coffee {
    void setSize(CoffeeSize size) {
        System.out.println("set size to " + size);
        this.size = size;
    }

    CoffeeSize size;    // each instance of Coffee has an enum
    public static void main(String[] args) {
        Coffee drink1 = new Coffee();
        drink1.setSize(CoffeeSize.BIG);

Coffee drink2 = new Coffee();
drink2.setSize(CoffeeSize.OVERWHELMING);
System.out.println(drink1.size.getOunces()); // prints 8
for(CoffeeSize cs: CoffeeSize.values())
        System.out.println(cs + " " + cs.getOunces());
    }
            }

