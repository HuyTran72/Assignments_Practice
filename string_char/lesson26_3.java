public class lesson26_3 {
    public static void main(String[] args) {
        String s25 = "abc1234567";
        String s26 = "abc123456";

        int x = s25.compareTo(s26);
        System.out.println("x = " + x);

        //split array
        String s38 = "Hello, world";
        String[] arr = s38.split(", ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String s39 = "I am programer";
        String s40 = s39.toLowerCase();
        System.out.println(s40);
        String s41 = s39.toUpperCase();
        System.out.println(s41);

        String s42 = "abcdefg1244";
        char[] arr2 = s42.toCharArray(); 
        for (int i =0; i< arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
