import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class assign_32 {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>(List.of(1,9,3,14,5,27,8));
        ArrayList<Integer> copy = new ArrayList<>(lst);
        Collections.sort(copy);
        System.out.println(copy);

        String index = "";
        int numLar2 = copy.get(copy.size() - 2);
        int numSmal2 = copy.get(1);
        
        System.out.println(numLar2);
        System.out.println(numSmal2);

        //Check index
        System.out.println("Index of numLar2: " + lst.indexOf(numLar2));
        System.out.println("Index of numSmal2: " + lst.indexOf(numSmal2));
    }  
}
