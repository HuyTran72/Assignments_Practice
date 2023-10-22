public class lesson21 {
    public static void main(String[] args) {
        int result = sum(1, 2, 3);
        System.out.println(result);

        Hello("male");
        Hello("femalee");
    }

    public static int sum(int x, int y, int z) {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        return x+y+z;
    }

    public static void Hello(String gender) {
        if(gender.equals("female")) {
            System.out.println("Hello, I am female");
        } else if (gender.equals("male")) {
            System.out.println("Hello, I am male");
        } else {
            System.out.println("No gender");
        }
    }
}
