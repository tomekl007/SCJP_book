package chapter7;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/17/14
 * Time: 11:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("a", "ant"); map.put("d", "dog"); map.put("h", "horse");
        SortedMap<String, String> submap;
        submap = map.subMap("b", "g");

        System.out.println(map + " " + submap);
        map.put("b", "bat");
        submap.put("f", "fish");
        map.put("r", "raccoon");
        // submap.put("p", "pig");
                System.out.println(map + " " + submap);
        // #1 create a backed collection
        // #2 show contents
        // #3 add to original
        // #4 add to copy
        // #5 add to original - out of range
        // #6 add to copy - out of range
        // #7 show final contents
    }
}
