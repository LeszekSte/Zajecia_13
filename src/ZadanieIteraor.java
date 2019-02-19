import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ZadanieIteraor {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("Zosia");
        set.add("Kasia");
        set.add("Waldek");
        set.add("Zosia");
        set.add("Basia");

        double q= 2.244;

       Iterator<String> iterable = set.iterator();
      while (iterable.hasNext()){
          String next = iterable.next();
          System.out.println(next);
      }

    }


}
