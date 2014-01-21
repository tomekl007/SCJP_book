package chapter2;
import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * User: tomaszlelek
 * Date: 1/21/14
 * Time: 7:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class Game {
}

class Floozet { }
class Quizel implements Klakker { }
class Jammer { List<Quizel> q; }
interface Klakker { }
class Floozel extends Jammer { List<Floozet> f; }
