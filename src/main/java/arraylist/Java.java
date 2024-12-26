package arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Java {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            a.add(i);

        }
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 50; i <= 150; i++) {
            b.add(i);

        }
        List<Integer> commonNumber = findcommonElements(a, b);
        System.out.println(commonNumber);
    }
        public static List<Integer> findcommonElements(List <Integer> a, List<Integer> b){
        Set<Integer>set = new HashSet<>(a);
        List<Integer> common = new ArrayList<>();
        for (Integer num :b){
            if (set.contains((num))){
                common.add(num);

            }
        }
     return common;
    }


}
