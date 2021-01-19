package src.HashMaps;

import java.util.*;

public class HashSets {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
        h.add("Riya");
        h.add("Tulu");
        h.add("Monkey");
        System.out.println(h);
        h.clear();
        System.out.println(h);
        HashSet<Integer> hashbrowns = new HashSet<>();
        hashbrowns.add(12);
        hashbrowns.add(39);
        hashbrowns.add(67);
        hashbrowns.add(70);

        Iterator<Integer> it = hashbrowns.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
