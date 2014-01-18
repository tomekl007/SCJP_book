package chapter7;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/17/14
 * Time: 11:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class Ferry {
    public static void main(String[] args) {
        TreeSet<Integer> times = new TreeSet<Integer>();
        times.add(1205);
        times.add(1505);
        times.add(1545);
        times.add(1830);
        times.add(2010);
        times.add(2100);
        // add some departure times
        // Java 5 version
        SortedSet<Integer> subset = new TreeSet<Integer>();
        subset = times.headSet(1600);
        System.out.println("J5 - last before 4pm is: " + subset.last());
        TreeSet<Integer> sub2 = new TreeSet<Integer>();
        sub2 = (TreeSet)times.tailSet(2000);
        System.out.println("J5 - first after 8pm is: " + sub2.first());
        // Java 6 version using the new lower() and higher() methods
        System.out.println("J6 - last before 4pm is: " + times.lower(1600));
        System.out.println("J6 - first after 8pm is: " + times.higher(2000));

        /*Similarly, higher() returns the element greater than
         the given element, and ceiling() returns the element greater than or equal to the given element.*/
    }

}
