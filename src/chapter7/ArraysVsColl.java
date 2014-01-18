package chapter7;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/18/14
 * Time: 5:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class ArraysVsColl {
}

    abstract class Animal {
        public abstract void checkup();
    }
    class Dog extends Animal {
        public void checkup() {   // implement Dog-specific code
            System.out.println("Dog checkup");
        } }
    class Cat extends Animal {
        public void checkup() {    // implement Cat-specific code
            System.out.println("Cat checkup");
        }
    }

    //Generic Methods (Exam Objectives 6.3 and 6.4) 611
    class Bird extends Animal {
        public void checkup() {     // implement Bird-specific code
            System.out.println("Bird checkup");
        }
    }
     class AnimalDoctor  {
        // method takes an array of any animal subtype
        public void checkAnimals(Animal[] animals) {
            for(Animal a : animals) {
                a.checkup();
            } }
        public static void main(String[] args) {
            // test it
            Dog[] dogs = {new Dog(), new Dog()};
            Cat[] cats = {new Cat(), new Cat(), new Cat()};
            Bird[] birds = {new Bird()};
            Animal[] animals = {new Dog(), new Bird(), new Cat()};
            AnimalDoctor doc = new AnimalDoctor();
            doc.checkAnimals(dogs);  // pass the Dog[]
            doc.checkAnimals(cats);  // pass the Cat[]
            doc.checkAnimals(birds); // pass the Bird[]
            doc.checkAnimals(animals);

            List<Animal> animals2 = new ArrayList<Animal>();
            animals2.add(new Cat());  // OK
            animals2.add(new Dog());  // OK
        }
    }

         class ArraysDanger {

             public static void main(String[] args) {
                 new ArraysDanger().foo();
             }
             public void foo() {
                 Cat[] cats = {new Cat(), new Cat()};
                 addAnimal(cats);  // no problem, send the Cat[] to the method
             }

             public void addAnimal(Animal[] animals) {
                 animals[0] = new Dog();  // Eeek! We just put a Dog
                 // in a Cat array!
             }
         }

class CollWay{
    public void addAnimal(List<Animal> animals) {
        animals.add(new Dog());  // this is always legal,
        // since Dog can
        // be assigned to an Animal
        // reference
    }
    public void addAnimal2(List<? extends Animal> animals ){ //extends = ?  is-a animal, or subtype of animal
        //animals.add(new Dog());  //if use ? then can not add no collection
    }

    public void addAnimal3(List<? super Dog> animals) { //if want to add something to coll then ? super Dog
        animals.add(new Dog());  // adding is sometimes OK with super
    }
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        ArrayList<Dog> animals2 = new ArrayList<Dog>();
        animals.add(new Dog());
        animals.add(new Dog());

        new CollWay().addAnimal(animals); // OK, since animals matches
        // the method arg
        //new CollWay().addAnimal(animals2);//cant do this
        new CollWay().addAnimal3(animals2);
        new CollWay().addAnimal2(animals2);

        //examples

        List<?> list = new ArrayList<Dog>();
         List<? extends Animal> aList = new ArrayList<Dog>();
        // List<?> foo = new ArrayList<? extends Animal>();//you cannot use wildcard notation in the object creation.

        //List<? extends Dog> cList = new ArrayList<Integer>();//: You cannot assign an Integer list to a reference that takes only a Dog (including any subtypes of Dog, of course).
         List<? super Dog> bList = new ArrayList<Animal>();
         //List<? super Animal> dList = new ArrayList<Dog>();// You cannot assign a Dog to <? super Animal>. The Dog is too "low"
        //in the class hierarchy. Only <Animal> or <Object> would have been legal.
        }



 }

class AnimalHolder<T extends Animal> { // use "T" instead
    // of "?"
    T animal;
    public static void main(String[] args) {
        AnimalHolder<Dog> dogHolder = new AnimalHolder<Dog>(); // OK
        dogHolder.animal = new Dog();
        //AnimalHolder<Integer> x = new AnimalHolder<Integer>(); // NO!
    }

}


 class CreateAnArrayList {
    public <T> List<T> makeArrayList(T t) { // take an object of an
        // unknown type and use a
        // "T" to represent the type
        List<T> list = new ArrayList<T>(); // now we can create the
        // list using "T"
        list.add(t);
        return list;
    }

     public static void main(String[] args) {
        List<Dog> list =  new CreateAnArrayList().makeArrayList(new Dog());
         System.out.println(list);
     }
}
     //equivalent
    /*public void makeArrayList(Dog t) {
        List<Dog> list = new ArrayList<Dog>();
        list.add(t);
    } */

class SelfTest {
    public static void main(String[] args) {


    List<List<Integer>> table = new ArrayList<List<Integer>>();
     //List<List<Integer>> table2 = new ArrayList<ArrayList<Integer>>();
     /*
        The type argument <List<Integer>> must be the same for both sides
        of the assignment, even though the constructor new ArrayList() on the right side is a
         subtype of the declared type List on the left.
        */
        before();
    }

    public static void before() {//ex at runtime when try to sort
        Set set = new TreeSet();
        set.add("2");
        set.add(3);
        set.add("1");
        Iterator it = set.iterator();
        while (it.hasNext())
            System.out.print(it.next() + " ");
    }
}

class Gene{
    interface Hungry<E> { void munch(E x); }
    interface Carnivore<E extends Animal> extends Hungry<E> {}
    interface Herbivore<E extends Animal> extends Hungry<E> {}
    abstract class Plant {}
    class Grass extends Plant {}
    abstract class Animal {}
    class Sheep extends Animal implements Herbivore<Sheep> {
        @Override
        public void munch(Sheep x) {}
    }
    class Wolf extends Animal implements Herbivore<Wolf> {
        public void munch(Wolf x) {}
    }

    public static void main(String[] args) {

    }
}

class Process{
    public static <E extends Number> List<E> process(List<E> nums){
        return nums;
    }

    public static void main(String[] args) {
        LinkedList<Number> in = new LinkedList<>();
        List<Number> out = new LinkedList<>();
        out = process(in);
    }
}

class PQE{
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.offer("2");
        pq.add("4");
           System.out.println("peek " + pq.peek() + " ");  //return first element in queue
           pq.offer("1");
           pq.add("3");
           pq.remove("1");
           System.out.println("pool " + pq.poll() + " ");//poll - remove first elem
           if(pq.remove("2")) System.out.print(pq.poll() + " ");
           System.out.println(pq.poll() + " " + pq.peek());
        System.out.println(pq.size());
    }
}

class TSE{
    public static void main(String[] args) {
        TreeSet<String> s = new TreeSet<String>();
            NavigableSet<String> subs = new TreeSet<String>();
            s.add("a"); s.add("b"); s.add("c"); s.add("d"); s.add("e");

            subs = s.subSet("b", true, "d", true);
            s.add("g");
            s.pollFirst();
            s.pollFirst();
            s.add("c2");
        System.out.println(s + "   " + subs );
            System.out.println(s.size() +" "+ subs.size());
    }
}

class CellingFloor{
    public static void main(String[] args) {
        TreeMap<String, String> myMap = new TreeMap<String, String>();
        /*
        The ceilingKey() method's argument is inclusive. The
         floorKey() method would be used to find keys before the specified key
         . The firstKey() method's argument is also inclusive.
         */
        myMap.put("a", "apple"); myMap.put("d", "date");
        myMap.put("f", "fig"); myMap.put("p", "pear");
        System.out.println("1st after mango: " +
                myMap.higherKey("f"));        //
        System.out.println("1st after mango: " +
                myMap.ceilingKey("f"));
        System.out.println("1st after mango: " +
                myMap.floorKey("f"));
        // sop 1
    // sop 2
    // sop 3
        SortedMap<String, String> sub = new TreeMap<String, String>();
        sub = myMap.tailMap("f");
        System.out.println(sub + " 1st after mango: " +   // sop 4
                sub.firstKey());

    }

}


 class FirstGrade {

       public static void main(String[] args) {
         TreeSet<Integer> i = new TreeSet<Integer>();
         TreeSet<Dog> d = new TreeSet<Dog>();

          //d.add(new Dog(1));   d.add(new Dog(2));   d.add(new Dog(1));
          i.add(1);            i.add(2);            i.add(1);
          System.out.println(d.size() + " " + i.size());
        }
    }

class COmparatorEx{
    public static void main(String[] args) {
        String[] s = {"map", "pen", "marble", "key"};
        Othello o = new Othello();
        Arrays.sort(s,o);
        for(String s2: s) System.out.print(s2 + " ");
             System.out.println(Arrays.binarySearch(s, "map", o));
           }
      static class Othello implements Comparator<String> {
          public int compare(String a, String b) { return b.compareTo(a); }
     }
}






