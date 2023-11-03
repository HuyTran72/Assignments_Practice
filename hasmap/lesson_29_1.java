import java.util.HashMap;

public class lesson_29_1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, Float> map2 = new HashMap<>();

        //Add elements 
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        //Get elements
        String value = map.get(1);
        System.out.println(value);

        //remove
        map.remove(2);
        System.out.println(map.get(2));

        //Check elements exist
        boolean check = map.containsKey(4);
        System.out.println(check);

        //Check value exist
        boolean checlvl = map.containsValue("Cherry");
        System.out.println(checlvl);

        //Check hash empty
        boolean empty = map.isEmpty();
        System.out.println(empty);

        //
        int numOfE = map.size();
        System.out.println(numOfE);

        //Loop
        for(Integer key: map.keySet()) {
            String vl = map.get(key);
            System.out.println(key + ": " + vl );
        }
    }
}
