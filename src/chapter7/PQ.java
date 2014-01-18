package chapter7;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/17/14
 * Time: 11:26 PM
 * To change this template use File | Settings | File Templates.
 */
import java.util.*;
class PQ {
    static class PQsort
            implements Comparator<Integer> {  // inverse sort
        public int compare(Integer one, Integer two) {
            return two - one;
        }
    }
        public static void main(String[] args) {
            int[] ia = {1,5,3,7,6,9,8 };
            PriorityQueue<Integer> pq1 =
                    new PriorityQueue<Integer>();
            for(int x : ia)
                pq1.offer(x);
            for(int x : ia)
                System.out.println(pq1.poll() + " ");
            System.out.println("->" + pq1 );
            PQsort pqs = new PQsort();
            PriorityQueue<Integer> pq2 =
                    new PriorityQueue<Integer>(10,pqs);
            for(int x : ia)
                pq2.offer(x);
            System.out.println(" pq2 : " +pq2);
// review queue
// get a Comparator
// use Comparator
// load queue
            System.out.println("size " + pq2.size());
            System.out.println("peek " + pq2.peek());//ret highest and not remove
            System.out.println("size " + pq2.size());
            System.out.println("poll " + pq2.poll());//ret highest and remove
            System.out.println("size " + pq2.size());
            System.out.println("pq2 : " + pq2);
            for(int x : ia)    {
                System.out.print(pq2.poll() + " ");
                System.out.println("after poll :" + pq2);
            }
        } }
