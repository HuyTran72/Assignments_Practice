import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class lesson_28_2 {
    public static void main(String[] args) {
        ArrayList<Integer> lst7= new ArrayList<>(List.of(1,2,3,4,5,6));
        boolean check = lst7.contains(10);
        System.out.println(check);

        ArrayList<Integer> lst8 = new ArrayList<>(List.of(19,2,30,4,5,6));
        Collections.sort(lst8);
        System.out.println(lst8);

        //index of (find the 1st of element in list)
        ArrayList<Integer> lst9 = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println(lst9.indexOf(4));

        //loop list
        ArrayList<Integer> lst10 = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println("{lst10 use for loop");
        for(int value: lst10) {
            System.out.println(value);
        }
    }
}
