package chapter2;

import java.io.IOException;

class Animal {
                  public void eat() throws Exception {
                    // throws an Exception
                  }
                }
                class Dog2 extends Animal {
                  public void eat() throws IOException { /* no Exceptions */}
                  public static void main(String [] args) throws Exception{
Animal a = new Dog2();
Dog2 d = new Dog2();
d.eat(); // ok
a.eat(); // compiler error -
                                       // unreported exception
} }