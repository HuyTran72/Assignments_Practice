public class lesson26_3 {
    public static void main(String[] args) {
        String s25 = "abc1234567";
        String s26 = "abc123456";

        int x = s25.compareTo(s26);
        System.out.println("x = " + x);

        //split array
        String s38 = "Hello, world";
        String[] arr = s38.split(",");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
