import java.util.ArrayList;
import java.util.List;

public class lesson_28 {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        ArrayList<Integer> lst2 = new ArrayList<>(5);
        ArrayList<Integer> lst3 = new ArrayList<>(List.of(1,2,3,4,5,6));

        System.out.println(lst);
        System.out.println(lst2);
        System.out.println(lst3);

        ArrayList<Integer> lst4 = new ArrayList<>();
        lst4.add(7);
        lst4.add(8);
        lst4.add(11);
        lst4.add(1, 99);
        System.out.println("Lst4 is: " + lst4);

        //size
        System.out.println("The number of elements is: " + lst4.size());

        //get(int index)
        System.out.println(lst4.get(3));

        //remove
        lst4.remove(2);
        System.out.println(lst4);

        ArrayList<Integer> lst5 = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println(lst5);
        lst5.remove(Integer.valueOf(3));
        System.out.println(lst5);



    }
}
